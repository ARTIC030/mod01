package assets.mod01.src.blocks;

import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Block03 extends Block {

	public Block03(int par1) {
		super(par1, Material.rock);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister texture)
	{
		this.blockIcon = texture.registerIcon(InfoMod.MODID + ":block03");
	}
	
	
}
