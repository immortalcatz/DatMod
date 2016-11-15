package xlxacidxlx.datmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.OreGenerator;

/**
 * Created by Acid on 10/26/2016.
 */
public class CommonProxy {
	/**
	 * Called when FMLPreInitialization is reached
	 *
	 * @param event The event
	 */
	public void preInit(FMLPreInitializationEvent event) {
	}

	/**
	 * Called when the FMLInitializationEvent is reached
	 *
	 * @param event The event
	 */
	public void init(FMLInitializationEvent event) {
		if (ConfigHandler.enableOreGeneration) {
			GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
		}
	}

	/**
	 * Called when the FMLPostInitialization event is reached
	 *
	 * @param event The event
	 */
	public void postInit(FMLPostInitializationEvent event) {
	}
}
