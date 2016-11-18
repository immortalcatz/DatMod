package xlxacidxlx.datmod.register;

import net.minecraftforge.common.MinecraftForge;
import xlxacidxlx.datmod.event.EntityJoinWorld;
import xlxacidxlx.datmod.event.LivingDrops;

/**
 * Created by Acid on 10/26/2016.
 */
public class Events {
	private static EntityJoinWorld entityJoinWorldEvent = new EntityJoinWorld();
	private static LivingDrops livingDropsEvent = new LivingDrops();

	/**
	 * Registers all the mod's events during Forge's FMLPostInitialization event
	 */
	public static void postInit() {
		MinecraftForge.EVENT_BUS.register(entityJoinWorldEvent);
		MinecraftForge.EVENT_BUS.register(livingDropsEvent);
	}
}
