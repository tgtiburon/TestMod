package com.tgtiburon.testmod.handler;

import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Tony on 7/13/2014.
 */
public class ConfigurationHandler
{

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //make a new configuration based on the file passed to us
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            //Since there is no config, lets load one
            loadConfiguration();

        }

    }//end public static void init()

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }

    }//end public void OnConfigurationChangedEvent()
    //private because it is only called within this class
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");


        if(configuration.hasChanged())
        {
            configuration.save();
        }//end if(config
    }//end public void loadConfiguration()9
}
