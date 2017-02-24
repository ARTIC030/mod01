package assets.mod01.src.blocks;

import java.util.ArrayList;
import java.util.Random;

import assets.mod01.src.CoreMod;
import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Block01 extends Block {
	
	
	public Block01(int par1) {
		super(par1, Material.clay);
		this.setHardness(0.2F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister texture)
	{
		this.blockIcon = texture.registerIcon(InfoMod.MODID + ":block01");
	}
	
	public int idDropped(int par1, Random par2Random, int par3){
		int drop = par2Random.nextInt(6);
	
			return CoreMod.block01.blockID;
			
			
			
}
}
