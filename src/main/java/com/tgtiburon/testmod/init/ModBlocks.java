package com.tgtiburon.testmod.init;


import com.tgtiburon.testmod.block.BlockSpartanFlag;
import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tony on 7/12/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockSpartanFlag spartanFlag = new BlockSpartanFlag();

    public static void init()
    {
        GameRegistry.registerBlock(spartanFlag, "spartanFlag");


    }//end static void init()
}//end public class ModBLocks

