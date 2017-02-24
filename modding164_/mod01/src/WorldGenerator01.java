package assets.mod01.src;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenerator01 implements IWorldGenerator {

	@Override
	public void generate(Random random, int ChunkX, int ChunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		
		switch(world.provider.dimensionId){
		case 0 : generateSurface(world,random,ChunkX*16,ChunkZ*16);
		}}
	private void generateSurface(World world, Random random, int BlockX, int BlockZ){
	for (int i=0; i < 20; i++){
		int Xcoord = BlockX + random.nextInt(16);
		int Zcoord = BlockZ + random.nextInt(16);
		int Ycoord = random.nextInt(16);
		(new WorldGenMinable(CoreMod.block07.blockID, 64)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}
	
}}
