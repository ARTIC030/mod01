package ru.artic030.mod01;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "mod01", name = "a mod", version = "0.30")

public class ModClass {
	@SidedProxy(clientSide = "ru.artic030.mod01.ClientProxy", serverSide = "ru.artic030.mod01.ServerProxy")
	public static ServerProxy proxy;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent ev){
		proxy.preLoad();
	}
	@EventHandler
	public void load(FMLInitializationEvent ev){
		proxy.load();
	}
	@EventHandler
	public void postLoad(FMLPostInitializationEvent ev){
		proxy.postLoad();
		
	}

}
