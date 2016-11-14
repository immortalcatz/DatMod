package xlxacidxlx.datmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.OreGenerator;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		// TODO: Work on this
	}

	public void init(FMLInitializationEvent event) {
		// TODO: Work on this
		GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO: Work on this
	}
}
