package assets.mod01.src.blocks;

import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Block04 extends Block {

public Block04(int par1) {
		super(par1,Material.glass);
		this.setStepSound(soundGlassFootstep);
		this.setHardness(0.4F);
	}
public boolean isOpaqueCube()
{
	return false;
}
public boolean renderAsNormalBlock()
{
	return false;
}
public int getRenderType()
{
	return 0;
}
public int getRenderBlockPass()
{
	return 0;
}
public boolean canSilkHarvest()
{
	return true;
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister texture)
{
	this.blockIcon = texture.registerIcon(InfoMod.MODID + ":block04");
}
}
