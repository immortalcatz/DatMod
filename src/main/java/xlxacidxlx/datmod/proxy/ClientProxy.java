package xlxacidxlx.datmod.proxy;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.block.ModBlocks;
import xlxacidxlx.datmod.item.BaseItem;
import xlxacidxlx.datmod.item.ModItems;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO: Work on this
		OBJLoader.INSTANCE.addDomain(DatMod.MODID);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO: Work on this
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO: Work on this
	}

	public void registerModel(BaseItem item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, item.getModelResourceLocation());
	}
}
