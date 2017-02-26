package assets.mod01.src.tiles;

import assets.mod01.src.CoreMod;
import assets.mod01.src.containers.Block10Container;
import assets.mod01.src.ui.Block10Gui;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Block10GuiHandler implements IGuiHandler {
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == CoreMod.block10.blockID? new Block10Container(player.inventory, world, x, y, z): null;
		}
		return null;
		}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == CoreMod.block10.blockID? new Block10Gui(player.inventory, world, x, y, z): null;
		}
		return null;
	}
	}
	


