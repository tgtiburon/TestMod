package com.tgtiburon.testmod.client.gui;

import com.tgtiburon.testmod.handler.ConfigurationHandler;
import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Tony on 7/12/2014.
 */

//our Gui extends the Forge standard gui
public class ModGuiConfig extends GuiConfig
{


    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }//end public ModGuiConfig
}//end public class ModGuiConfig
