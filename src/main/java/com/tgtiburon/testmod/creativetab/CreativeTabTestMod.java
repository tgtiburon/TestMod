package com.tgtiburon.testmod.creativetab;

import com.tgtiburon.testmod.init.ModItems;
import com.tgtiburon.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Tony on 7/12/2014.
 */
public class CreativeTabTestMod
{
    public static final CreativeTabs TESTMOD_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
      public Item getTabIconItem()
        {
            return ModItems.spartanPlant;
        }//end getTabIconItem()

        @Override
        public String getTranslatedTabLabel()
        {
            return "Test Mod";
        }//end String getTranslatedLabel()

    };



}//end class CreativeTabGeneticsMod

