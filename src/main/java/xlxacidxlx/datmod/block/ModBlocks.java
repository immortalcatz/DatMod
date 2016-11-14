package xlxacidxlx.datmod.block;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Diamondium diamondium;
	public static DiamondiumOre diamondiumOre;
	public static Emeraldi emeraldi;
	public static EmeraldiOre emeraldiOre;
	public static Goldirite goldirite;
	public static GoldiriteOre goldiriteOre;
	public static Ironium ironium;
	public static IroniumOre ironiumOre;

	public static void preInit() {
		diamondium = new Diamondium();
		diamondiumOre = new DiamondiumOre();
		emeraldi = new Emeraldi();
		emeraldiOre = new EmeraldiOre();
		goldirite = new Goldirite();
		goldiriteOre = new GoldiriteOre();
		ironium = new Ironium();
		ironiumOre = new IroniumOre();

		registerBlocks();
	}

	public static void registerBlock(BaseBlock block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block), block.getResourceLocation());
	}

	public static void registerBlocks() {
		registerBlock(diamondium);
		registerBlock(diamondiumOre);

		registerBlock(emeraldi);
		registerBlock(emeraldiOre);

		registerBlock(goldirite);
		registerBlock(goldiriteOre);

		registerBlock(ironium);
		registerBlock(ironiumOre);
	}

	public static void registerRender(BaseBlock block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, block.getModelResourceLocation());
	}

	public static void registerRenders() {
		registerRender(diamondium);
		registerRender(diamondiumOre);

		registerRender(emeraldi);
		registerRender(emeraldiOre);

		registerRender(goldirite);
		registerRender(goldiriteOre);

		registerRender(ironium);
		registerRender(ironiumOre);
	}
}
