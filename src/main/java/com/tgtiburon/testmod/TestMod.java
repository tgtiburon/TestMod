package com.tgtiburon.testmod;


import com.tgtiburon.testmod.handler.ConfigurationHandler;
import com.tgtiburon.testmod.proxy.IProxy;
import com.tgtiburon.testmod.reference.Reference;
import com.tgtiburon.testmod.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



/**
 * Created by Tony on 7/13/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class TestMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_LOCATION, serverSide = Reference.SERVER_PROXY_LOCATION)
    public static IProxy proxy;


    //preInit loads: blocks, items, loggers, config handlers
    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        //Send the suggested config file to the handler
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //now we register our config handler
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("PreInit Complete");
    }//end preInit


    //init loads: renderers, Gui's, etc
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init Complete");

    }//end init

    //postInit loads: add-ons
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent even)
    {

        LogHelper.info("PostInit Complete");
    }//end postInit

}//end class TestMod
