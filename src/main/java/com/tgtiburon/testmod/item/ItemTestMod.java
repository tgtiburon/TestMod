package com.tgtiburon.testmod.item;

import com.tgtiburon.testmod.creativetab.CreativeTabTestMod;
import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Tony on 7/12/2014.
 */

//We will use this Item as a wrapper for our other items
// Then we need to only change the items we want different stats for

public class ItemTestMod extends Item
{

    public ItemTestMod()
    {
        super();
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);

    }

    //Used to change minecrafts internal name for items to something more user
    //friendly

    //Default = item.GeneticsMod:whitePeaPlant.name

    //We lowercast so item.geneticsmod:whitePeaPlant.name


    //All of the below is to put the text into a format minecraft looks for.

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }//end getUnlocalizedName()

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s" ,Reference.MOD_ID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName())  );
    }
//For this item...this is the texture and registers it with minecraft

    @Override

    //this method only exists on the client side...Servers don't use textures

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));


    }//end public void registerIcons()

    protected String getUnwrappedUnlocalizedName(String unLocalizedName)
    {
        return unLocalizedName.substring(unLocalizedName.indexOf(".") + 1);

    }//end getUnWrapped...

}//end public class ItemGeneticsMod
