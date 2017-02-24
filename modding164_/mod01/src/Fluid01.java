package assets.mod01.src;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class Fluid01 extends Fluid {

	public Fluid01()  {
		super("fluidgf");
		setDensity(10);
		setViscosity(1000);
		FluidRegistry.registerFluid(this);
		
	}

}
