package assets.mod01.src.blocks;

import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Flower06 extends BlockFlower {

	public Flower06(int par1) {
		super(par1, Material.plants);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister texture)
	{
		this.blockIcon = texture.registerIcon(InfoMod.MODID + ":flower06");
	}

}
