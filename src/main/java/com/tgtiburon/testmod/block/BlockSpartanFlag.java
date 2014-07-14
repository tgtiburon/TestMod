package com.tgtiburon.testmod.block;

import net.minecraft.block.Block;

/**
 * Created by Tony on 7/13/2014.
 */
public class BlockSpartanFlag extends BlockTestMod
{
   // public static Block spartanBlock;

    public BlockSpartanFlag()

    {

        super();
        this.setBlockName("spartanFlag");
        this.setBlockTextureName("spartanFlag");
        this.setLightLevel(1f);
        this.setHardness(3f);
        this.setResistance(3f);
        this.setStepSound(Block.soundTypeGlass);
    }

}
