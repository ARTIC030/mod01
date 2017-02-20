package ru.artic030.mod01.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocksList {
	public static final Block block01 = new Block01(Material.GRASS, "block01");
	
	public static void register()
	{
		//просто блок.
		registerBlock(block01);
	}
	
	public static void registerBlock(final Block block){
		

		//метод действует ЗА ВСЕ Блоки выше созданные, в особенности, чтоб ТЕКСТУРА НЕ ЕБАЛА МОЗГА!11
		GameRegistry.register(block01);
		//метод действует ЗА ВСЕ итемБлоки выше созданные, в особенности, чтоб ТЕКСТУРА НЕ ЕБАЛА МОЗГА!11
		GameRegistry.register(new ItemBlock(block01).setRegistryName(block.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	public static void registerRender(){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block01), 0, new ModelResourceLocation(block01.getRegistryName(), "inventory"));
	}}


