package ru.artic030.mod01;

import net.minecraftforge.fml.common.Mod.EventHandler;
import ru.artic030.mod01.blocks.BlocksList;

public class ServerProxy {
	@EventHandler
	public void preLoad(){
		//������� ��� ������ BlocksList
		BlocksList.register();
		
	}
	@EventHandler
	public void load(){
		
	}
	@EventHandler
	public void postLoad(){
		
	}

}



