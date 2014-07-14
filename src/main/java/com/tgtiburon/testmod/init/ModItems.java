package com.tgtiburon.testmod.init;

import com.tgtiburon.testmod.item.*;
import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tony on 7/12/2014.
 */


// Initialize my items

//This prevents other mods from tinkering with your mod

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTestMod spartanPlant = new ItemSpartanPlant();
    //public static final ItemTestMod redPeaPlant = new ItemRedPeaPlant();
    //public static final ItemTestMod pinkPeaPlant = new ItemPinkPeaPlant();

   // public static final ItemTestMod creeptonianSword = new ItemCreeptonianSword();
    public static void init()
    {
        GameRegistry.registerItem(spartanPlant, "SpartanPlant");
        //GameRegistry.registerItem(redPeaPlant, "RedPeaPlant");
        //GameRegistry.registerItem(pinkPeaPlant, "PinkPeaPlant");
        //GameRegistry.registerItem(creeptonianSword, "CreeptonianSword");



    }//end public static void init()


}//end public class ModItems
