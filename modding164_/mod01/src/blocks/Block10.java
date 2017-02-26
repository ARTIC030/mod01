package assets.mod01.src.blocks;

import assets.mod01.src.CoreMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Block10 extends Block {

	public Block10(int par1) {
		super(par1, Material.clay);
	}
	
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9 )
	{
		if (!player.isSneaking())
		{
			player.openGui(CoreMod.INSTANCE, 0, var1, var2, var3, var4);
			return true;

		} else {
			
			return false;
		}
	}}
	


