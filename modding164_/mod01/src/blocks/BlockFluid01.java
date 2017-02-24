package assets.mod01.src.blocks;

import assets.mod01.src.CoreMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid01 extends BlockFluidClassic {

	public BlockFluid01(int id) {
		super(id, CoreMod.fluid01, Material.water);
		CoreMod.fluid01.setBlockID(1002);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta){
		return Block.waterMoving.getIcon(side, meta);
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0x9900CC;
	}

}
