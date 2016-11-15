package xlxacidxlx.datmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xlxacidxlx.datmod.block.ModBlocks;
import xlxacidxlx.datmod.crafting.ModRecipes;
import xlxacidxlx.datmod.event.ModEvents;
import xlxacidxlx.datmod.item.ModItems;
import xlxacidxlx.datmod.proxy.CommonProxy;

import java.io.File;

/**
 * Created by Acid on 10/20/2016.
 */
@Mod(modid = DatMod.MODID, version = DatMod.VERSION, name = DatMod.NAME, updateJSON = "http://raw.githubusercontent.com/xlxAciDxlx/DatMod/VERSION.md")
public class DatMod {
	public static final String MODID = "datmod";
	public static final String VERSION = "1.0.0";
	public static final String NAME = "DatMod";

	@SidedProxy(clientSide = "xlxacidxlx.datmod.proxy.ClientProxy", serverSide = "xlxacidxlx.datmod.proxy.CommonProxy")
	private static CommonProxy proxy;

	@Mod.Instance
	public static DatMod instance;

	private static xlxacidxlx.datmod.creativetab.CreativeTabs creativeTabs;
	public static Logger logger = LogManager.getLogger(DatMod.NAME);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File configDir = new File(event.getModConfigurationDirectory() + "/" + DatMod.NAME);
		configDir.mkdirs();
		ConfigHandler.init(new File(configDir.getPath(), DatMod.NAME + ".cfg"));

		creativeTabs = new xlxacidxlx.datmod.creativetab.CreativeTabs();

		proxy.preInit(event);
		ModItems.preInit();
		ModBlocks.preInit();

		logger.info("PreInitialization completed!");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new OreGenerator(), 1);

		logger.info("Initialization completed!");
	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) {
		logger.info("Loading completed!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		ModEvents.postInit();

		logger.info("PostInitialization completed!");
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		logger.info("Server starting..");
	}

	@EventHandler
	public void serverStarted(FMLServerStartedEvent event) {
		logger.info("Server started!");
	}

	@EventHandler
	public void serverStopping(FMLServerStoppingEvent event) {
		logger.info("Server stopping..");
	}

	@EventHandler
	public void serverStopped(FMLServerStoppedEvent event) {
		logger.info("Server stopped!");
	}
}
