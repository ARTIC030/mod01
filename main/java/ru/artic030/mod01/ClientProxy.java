package ru.artic030.mod01;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.artic030.mod01.blocks.BlocksList;

public class ClientProxy extends ServerProxy {
	
	@EventHandler
	public void preLoad(){
		
		super.preLoad();
	}
	@EventHandler
	public void load(){
		
		BlocksList.registerRender();
		
	}
	@EventHandler
	public void postLoad(){
		
	}

}
