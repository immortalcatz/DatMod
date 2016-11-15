package xlxacidxlx.datmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.block.ModBlocks;
import xlxacidxlx.datmod.item.BaseItem;
import xlxacidxlx.datmod.item.ModItems;

/**
 * Created by Acid on 11/10/2016.
 */
public class ModRecipes {
	/**
	 * Registers all the recipes during Forge's initialization event
	 */
	public static void init() {
		registerRecipes();
		registerShapelessRecipes();
		registerSmeltingRecipes();
	}

	/**
	 * Registers the specified recipe
	 *
	 * @param output    The item to receive from crafting
	 * @param lineOne   The first line's recipe
	 * @param lineTwo   The second line's recipe
	 * @param lineThree The third line's recipe
	 * @param input     Items that go into crafting the item
	 */
	public static void registerRecipe(ItemStack output, String lineOne, String lineTwo, String lineThree, ItemStack input) {
		GameRegistry.addRecipe(output, lineOne, lineTwo, lineThree, input);
	}

	/**
	 * Registers the specified recipe
	 *
	 * @param output The item to get from crafting
	 * @param params An object of crafting lines and ingredients
	 */
	public static void registerRecipe(ItemStack output, Object... params) {
		GameRegistry.addRecipe(output, params);
	}

	/**
	 * Registers the recipes
	 */
	private static void registerRecipes() {
		BaseItem diamondiumIngot = ModItems.diamondiumIngot;
		BaseItem emeraldiIngot = ModItems.emeraldiIngot;
		BaseItem goldiriteIngot = ModItems.goldiriteIngot;
		BaseItem ironiumIngot = ModItems.ironiumIngot;

		Item stick = Items.STICK;
		Item redstone = Items.REDSTONE;

		// Axes
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondiumAxe), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldiAxe), new Object[]{
				" EE",
				" SE",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.goldiriteAxe), new Object[]{
				" GG",
				" SG",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.ironiumAxe), new Object[]{
				" II",
				" SI",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diamondium), new Object[]{
				"DDD",
				"DDD",
				"DDD",
				'D', diamondiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldi), new Object[]{
				"EEE",
				"EEE",
				"EEE",
				'E', emeraldiIngot
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.goldirite), new Object[]{
				"GGG",
				"GGG",
				"GGG",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ironium), new Object[]{
				"III",
				"III",
				"III",
				'I', ironiumIngot
		});

		// Magnet
		GameRegistry.addRecipe(new ItemStack(ModItems.magnetItem), new Object[]{
				"III",
				"IRI",
				"I I",
				'I', ironiumIngot,
				'R', redstone
		});

		// Pickaxes
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondiumPickaxe), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldiPickaxe), new Object[]{
				"EEE",
				" S ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.goldiritePickaxe), new Object[]{
				"GGG",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.ironiumPickaxe), new Object[]{
				"III",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Shovels
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondiumShovel), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldiShovel), new Object[]{
				" E ",
				" S ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.goldiriteShovel), new Object[]{
				" G ",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.ironiumShovel), new Object[]{
				" I ",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Swords
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondiumSword), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldiSword), new Object[]{
				" E ",
				" E ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.goldiriteSword), new Object[]{
				" G ",
				" G ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.ironiumSword), new Object[]{
				" I ",
				" I ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});
	}

	/**
	 * Registers a shapeless recipe
	 *
	 * @param output The item to receive from crafting
	 * @param input  The item to put in for crafting
	 */
	public static void registerShapelessRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapelessRecipe(output, input);
	}

	/**
	 * Registers all shapeless recipes
	 */
	private static void registerShapelessRecipes() {
	}

	/**
	 * Registers a smelting recipe
	 *
	 * @param input  The item to put in to smelt
	 * @param output The item received from smelting
	 * @param xp     The amount of XP gained from smelting the item
	 */
	private static void registerSmeltingRecipe(ItemStack input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}

	/**
	 * Registers all smelting recipes
	 */
	private static void registerSmeltingRecipes() {
		float xp = 0.5f;
		float xpDiamondium = 1.5f;
		float xpEmeraldi = 0.8f;
		float xpGoldirite = 0.6f;
		float xpIronium = xp;
		float xpLeather = 0.1f;

		registerSmeltingRecipe(new ItemStack(ModBlocks.diamondiumOre), new ItemStack(ModItems.diamondiumIngot), xpDiamondium);
		registerSmeltingRecipe(new ItemStack(ModBlocks.emeraldiOre), new ItemStack(ModItems.emeraldiIngot), xpEmeraldi);
		registerSmeltingRecipe(new ItemStack(ModBlocks.goldiriteOre), new ItemStack(ModItems.goldiriteIngot), xpGoldirite);
		registerSmeltingRecipe(new ItemStack(ModBlocks.ironiumOre), new ItemStack(ModItems.ironiumIngot), xpIronium);

		if (ConfigHandler.enableRottenFleshToLeatherRecipe) {
			// Rotten flesh -> leather
			registerSmeltingRecipe(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER), xpLeather);
		}
	}
}
