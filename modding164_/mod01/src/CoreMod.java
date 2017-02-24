package assets.mod01.src;


import assets.mod01.src.blocks.Block01;
import assets.mod01.src.blocks.Block02;
import assets.mod01.src.blocks.Block03;
import assets.mod01.src.blocks.Block04;
import assets.mod01.src.blocks.Block05;
import assets.mod01.src.blocks.Block07;
import assets.mod01.src.blocks.Block08;
import assets.mod01.src.blocks.Block09;
import assets.mod01.src.blocks.BlockFluid01;
import assets.mod01.src.blocks.Flower06;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ic2.api.item.Items;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;

@Mod(modid=InfoMod.MODID, name=InfoMod.MODNAME, version=InfoMod.MODVERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class CoreMod {
	public ItemStack Plutonium244;
	private static boolean registeredTileEntities = true;
	


	

	@Instance(InfoMod.MODID)
	public static CoreMod INSTANCE;
	
	
	@Mod.Instance(InfoMod.MODID)
	public static CoreMod mod01;
	
	
	public static final Block block01 = new Block01(3050).setUnlocalizedName("block01");
	public static final Block block02 = new Block02(3051).setUnlocalizedName("block02");
	public static Block block03 = new Block03(3052).setUnlocalizedName("block03");
	public static Block block04 = new Block04(3053).setUnlocalizedName("block04");
	public static Block block05 = new Block05(3054).setUnlocalizedName("block05");
	public static Block flower06 = new Flower06(3055).setUnlocalizedName("block06");
	public static Block block07 = new Block07(3056).setUnlocalizedName("block07");
	public static Block block08 = new Block08(3057).setUnlocalizedName("block08");
	public static Block block09 = new Block09(3058).setUnlocalizedName("block09");
	public static Fluid fluid01 = new Fluid01().setBlockID(1002);
	public static BlockFluid01 fluidblock01 = new BlockFluid01(1002);
	

	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	
	{
	    
		
	}
	
	

	@EventHandler
	public void Init(FMLInitializationEvent event)
	
	{
		
		GameRegistry.registerBlock(block01);
		LanguageRegistry.addName(block01, "Block 01");
		GameRegistry.registerBlock(block02);
		LanguageRegistry.addName(block02, "Block 02");
		GameRegistry.registerBlock(block03);
		LanguageRegistry.addName(block03, "Block 03");
		GameRegistry.registerBlock(block04);
		LanguageRegistry.addName(block04, "Block 04");
		GameRegistry.registerBlock(block05);
		LanguageRegistry.addName(block05, "Block 05");
		GameRegistry.registerBlock(flower06);
		LanguageRegistry.addName(flower06, "Flower 06");
		GameRegistry.registerBlock(block07);
		LanguageRegistry.addName(block07, "Block 07");
		GameRegistry.registerBlock(block09);
		LanguageRegistry.addName(block09, "Block 09");
		GameRegistry.registerBlock(fluidblock01);
		LanguageRegistry.addName(fluidblock01, "Block08");
		Plutonium244 = Items.getItem("Plutonium");
		GameRegistry.addRecipe(Plutonium244, new Object[]{ "YYY", "YIY", "YYY", ('Y'), Items.getItem("Uran238"), ('I'), Items.getItem("Uran235")});
	    Recipes.compressor.addRecipe(new RecipeInputItemStack (new ItemStack(Block.glass), 1), null, new ItemStack[] { new ItemStack(Block.sand, 1)});
	    NBTTagCompound heat50 = new NBTTagCompound();
	    heat50.setInteger("minHeat", 50);
	    NBTTagCompound scr1 = new NBTTagCompound();
	    scr1.setInteger("amplification", 120000);
	    Recipes.matterAmplifier.addRecipe(new RecipeInputItemStack(new ItemStack(Item.appleGold),1 ), scr1);
	    Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(Block.stone)), heat50, new ItemStack(Block.gravel, 2), new ItemStack(Block.sand), Items.getItem("stoneDust") );
	    
	    
	}   

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	
	{
		
	}
	
	
	
}