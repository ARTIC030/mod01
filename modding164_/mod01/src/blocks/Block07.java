package assets.mod01.src.blocks;

import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Block07 extends Block {

	public Block07(int par1) {
		super(par1, Material.rock);
		this.setHardness(0.5F);
		this.setStepSound(soundStoneFootstep);
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister texture)
	{
		this.blockIcon = texture.registerIcon(InfoMod.MODID + ":block07");
	}
	
}
