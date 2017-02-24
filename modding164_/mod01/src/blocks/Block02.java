package assets.mod01.src.blocks;

import assets.mod01.src.InfoMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Block02 extends Block {
	private Icon front, side, top, bottom;

	public Block02(int par1) {
		super(par1, Material.rock);
		this.setHardness(1F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(6000F);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister textur)
	{
	  front = textur.registerIcon(InfoMod.MODID + ":block02_Front");
	  side = textur.registerIcon(InfoMod.MODID + ":block02_Side");
	  top = textur.registerIcon(InfoMod.MODID + ":block02_Top");
	  bottom = textur.registerIcon(InfoMod.MODID + ":block02_Bottom");
	}
	@Override
	public Icon getIcon(int side, int meta)
	{
		return side == 1 ? this.top : (side == 0 ? this.bottom : (meta == 2 && side == 2 ? this.front : (meta == 3 && side == 5 ? this.front : (meta == 0 && side == 3 ? this.front : (meta == 1 && side == 4 ? this.front : this.side)))));
	}
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
	        par5Entity.attackEntityFrom(DamageSource.drown, 19);
	}
	
}
