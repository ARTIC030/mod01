package assets.mod01.src.blocks;

import java.util.Random;

import assets.mod01.src.CoreMod;
import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class Block05 extends Block {

	public Block05(int par1) {
		super(par1, Material.clay);
		this.setHardness(0.1F);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister texture)
	{
		this.blockIcon = texture.registerIcon(InfoMod.MODID + ":block05");
	}
	public int idDropped(int par1, Random par2Random,  int par3){
		int drop = par2Random.nextInt(6);
		
		if(drop == 1)
		    {
			return Item.goldNugget.itemID;
			}
			
		else if(drop == 2)
		{
			return Item.ingotGold.itemID;
		}
		else if(drop == 3){
				
		return Block.cobblestone.blockID;
		}
				else {
				
		return CoreMod.block05.blockID;
		}
	}
	
}			
	
	

