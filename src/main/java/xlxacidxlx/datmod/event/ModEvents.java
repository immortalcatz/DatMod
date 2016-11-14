package xlxacidxlx.datmod.event;

import net.minecraftforge.common.MinecraftForge;

public class ModEvents {
	private static EntityJoinWorld entityJoinWorldEvent = new EntityJoinWorld();

	public static void postInit() {
		MinecraftForge.EVENT_BUS.register(entityJoinWorldEvent);
	}
}
