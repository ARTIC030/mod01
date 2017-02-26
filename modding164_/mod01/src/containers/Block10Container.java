package assets.mod01.src.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public class Block10Container extends Container {
	
	private World worldObj;
	
	private int posX;
	private int posY;
	private int posZ;
	
	public Block10Container(InventoryPlayer invplayer, World world, int i, int j, int k){
		
	}
	public boolean canInteractWith(EntityPlayer entityplayer){
		return true;
	}
	public boolean isUsableByPlayer(EntityPlayer entityplayer){
		
		return true;
	}

}
