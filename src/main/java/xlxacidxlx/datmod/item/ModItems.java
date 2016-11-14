package xlxacidxlx.datmod.item;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static DiamondiumAxe diamondiumAxe;
	public static DiamondiumDust diamondiumDust;
	public static DiamondiumIngot diamondiumIngot;
	public static DiamondiumPickaxe diamondiumPickaxe;
	public static DiamondiumShovel diamondiumShovel;
	public static DiamondiumSword diamondiumSword;

	public static EmeraldiAxe emeraldiAxe;
	public static EmeraldiDust emeraldiDust;
	public static EmeraldiIngot emeraldiIngot;
	public static EmeraldiPickaxe emeraldiPickaxe;
	public static EmeraldiShovel emeraldiShovel;
	public static EmeraldiSword emeraldiSword;

	public static GoldiriteAxe goldiriteAxe;
	public static GoldiriteDust goldiriteDust;
	public static GoldiriteIngot goldiriteIngot;
	public static GoldiritePickaxe goldiritePickaxe;
	public static GoldiriteShovel goldiriteShovel;
	public static GoldiriteSword goldiriteSword;

	public static IroniumAxe ironiumAxe;
	public static IroniumDust ironiumDust;
	public static IroniumIngot ironiumIngot;
	public static IroniumPickaxe ironiumPickaxe;
	public static IroniumShovel ironiumShovel;
	public static IroniumSword ironiumSword;

	public static Magnet magnetItem;

	public static void preInit() {
		diamondiumAxe = new DiamondiumAxe();
		diamondiumDust = new DiamondiumDust();
		diamondiumIngot = new DiamondiumIngot();
		diamondiumPickaxe = new DiamondiumPickaxe();
		diamondiumShovel = new DiamondiumShovel();
		diamondiumSword = new DiamondiumSword();

		emeraldiAxe = new EmeraldiAxe();
		emeraldiDust = new EmeraldiDust();
		emeraldiIngot = new EmeraldiIngot();
		emeraldiPickaxe = new EmeraldiPickaxe();
		emeraldiShovel = new EmeraldiShovel();
		emeraldiSword = new EmeraldiSword();

		goldiriteAxe = new GoldiriteAxe();
		goldiriteDust = new GoldiriteDust();
		goldiriteIngot = new GoldiriteIngot();
		goldiritePickaxe = new GoldiritePickaxe();
		goldiriteShovel = new GoldiriteShovel();
		goldiriteSword = new GoldiriteSword();

		ironiumAxe = new IroniumAxe();
		ironiumDust = new IroniumDust();
		ironiumIngot = new IroniumIngot();
		ironiumPickaxe = new IroniumPickaxe();
		ironiumShovel = new IroniumShovel();
		ironiumSword = new IroniumSword();

		magnetItem = new Magnet();

		registerItems();
	}

	public static void registerItems() {
		GameRegistry.register(diamondiumAxe);
		GameRegistry.register(diamondiumDust);
		GameRegistry.register(diamondiumIngot);
		GameRegistry.register(diamondiumPickaxe);
		GameRegistry.register(diamondiumShovel);
		GameRegistry.register(diamondiumSword);

		GameRegistry.register(emeraldiAxe);
		GameRegistry.register(emeraldiDust);
		GameRegistry.register(emeraldiIngot);
		GameRegistry.register(emeraldiPickaxe);
		GameRegistry.register(emeraldiShovel);
		GameRegistry.register(emeraldiSword);

		GameRegistry.register(goldiriteAxe);
		GameRegistry.register(goldiriteDust);
		GameRegistry.register(goldiriteIngot);
		GameRegistry.register(goldiritePickaxe);
		GameRegistry.register(goldiriteShovel);
		GameRegistry.register(goldiriteSword);

		GameRegistry.register(ironiumAxe);
		GameRegistry.register(ironiumDust);
		GameRegistry.register(ironiumIngot);
		GameRegistry.register(ironiumPickaxe);
		GameRegistry.register(ironiumShovel);
		GameRegistry.register(ironiumSword);

		GameRegistry.register(magnetItem);
	}

	public static void registerRender(BaseItem item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	public static void registerRender(BaseItemAxe item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	public static void registerRender(BaseItemPickaxe item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	public static void registerRender(BaseItemShovel item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	public static void registerRender(BaseItemSword item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, item.getModelResourceLocation());
	}

	public static void registerRenders() {
		registerRender(diamondiumAxe);
		registerRender(diamondiumDust);
		registerRender(diamondiumIngot);
		registerRender(diamondiumPickaxe);
		registerRender(diamondiumShovel);
		registerRender(diamondiumSword);

		registerRender(emeraldiAxe);
		registerRender(emeraldiDust);
		registerRender(emeraldiIngot);
		registerRender(emeraldiPickaxe);
		registerRender(emeraldiShovel);
		registerRender(emeraldiSword);

		registerRender(goldiriteAxe);
		registerRender(goldiriteDust);
		registerRender(goldiriteIngot);
		registerRender(goldiritePickaxe);
		registerRender(goldiriteShovel);
		registerRender(goldiriteSword);

		registerRender(ironiumAxe);
		registerRender(ironiumDust);
		registerRender(ironiumIngot);
		registerRender(ironiumPickaxe);
		registerRender(ironiumShovel);
		registerRender(ironiumSword);

		registerRender(magnetItem);
	}
}
