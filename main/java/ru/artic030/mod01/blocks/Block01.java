package ru.artic030.mod01.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ru.artic030.mod01.ModClass;

public class Block01 extends Block
{
   

   public Block01(final Material materialIn, final String name)
   {
       super(materialIn);
       setRegistryName(name);
       setUnlocalizedName(name);
       setSoundType(SoundType.GROUND);
       setHardness(2.0F);
       setLightLevel(1.0F);
       setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
   }

  
   @Override
   public EnumBlockRenderType getRenderType(final IBlockState state)
   {
       return EnumBlockRenderType.MODEL;
   }

   
   @Override
   public boolean isFullCube(final IBlockState state)
   {
       return true;
   }

   
   @Override
   public boolean canPlaceBlockAt(final World worldIn, final BlockPos pos)
   {
       return super.canPlaceBlockAt(worldIn, pos) && worldIn.getBlockState(pos.down()).isFullyOpaque();
   }
}