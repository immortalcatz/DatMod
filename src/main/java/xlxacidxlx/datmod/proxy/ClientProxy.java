package xlxacidxlx.datmod.proxy;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.block.ModBlocks;
import xlxacidxlx.datmod.item.BaseItem;
import xlxacidxlx.datmod.item.ModItems;

/**
 * Created by Acid on 10/26/2016.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO: Uncomment this once we have 3D items/models
		//OBJLoader.INSTANCE.addDomain(DatMod.MODID);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}

	/**
	 * Registers the specified item's model
	 *
	 * @param item The item to register
	 */
	public void registerModel(BaseItem item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, item.getModelResourceLocation());
	}
}
