package assets.mod01.src.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Block09 extends Block {

	public Block09(int par1) {
		super(par1, Material.circuits);
		
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	{
		float factor = 1.0F;
		float f = factor / 16.0F;
		return AxisAlignedBB.getBoundingBox(i + f, j, k + f, i + factor - f, j + factor, k + factor - f);
	
	}
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	{
		if ((entity instanceof EntityPlayer))
		{ EntityPlayer player = (EntityPlayer) entity;
		
		player.fallDistance = 0.0F;
		if (player.motionY < -0.15D)
		{ 
			player.motionY = -0.15D;
		}
		{
			if (player.motionY < 0.2D)
			{
				player.motionY = 0.2D;
		}
		}
		}
	    }
	    public boolean isBlockNormalCube(World world, int i, int j, int k){
	    	return false;
	    }
	    
	    public boolean isOpaqueCube(){
	    	
	    	return false;

	    }
	    public boolean renderAsNormalBlock(){
	    	
	    	return false;
	    }
	    public int getRenderType(){
	    	return 0;
	    }
	    public int quantityDropped(Random random){
	    	return 1;
	    }
	    public boolean isLadder(World world, int x, int y, int z, EntityLivingBase entity){
	    	return true;
	    }
	    
	    
	    
	    

}
