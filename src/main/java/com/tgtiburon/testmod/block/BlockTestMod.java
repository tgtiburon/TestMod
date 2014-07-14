package com.tgtiburon.testmod.block;

import com.tgtiburon.testmod.creativetab.CreativeTabTestMod;
import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Tony on 7/13/2014.
 */
public class BlockTestMod extends Block


{

    public BlockTestMod(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
    }

    //Default blocks will be made of stone if no arguments are sent
    public BlockTestMod()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));


        //Blocks named by minecraft as  tile.modid.blockname.name
    }//end getUnlocalizedName()


    @Override

    //this method only exists on the client side...Servers don't use textures

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));


    }//end public void registerIcons()

    protected String getUnwrappedUnlocalizedName(String unLocalizedName)
    {
        return unLocalizedName.substring(unLocalizedName.indexOf(".") + 1);

    }//end getUnWrapped...





}//end class BlockTestMod
