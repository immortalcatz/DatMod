package xlxacidxlx.datmod.register;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.base.Item;

/**
 * Created by Acid on 11/10/2016.
 */
public class Recipes {
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
		Item diamondiumIngot = Items.diamondiumIngot;
		Item emeraldiIngot = Items.emeraldiIngot;
		Item goldiriteIngot = Items.goldiriteIngot;
		Item ironiumIngot = Items.ironiumIngot;

		net.minecraft.item.Item stick = net.minecraft.init.Items.STICK;
		net.minecraft.item.Item redstone = net.minecraft.init.Items.REDSTONE;

		// Axes
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumAxe), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiAxe), new Object[]{
				" EE",
				" SE",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteAxe), new Object[]{
				" GG",
				" SG",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumAxe), new Object[]{
				" II",
				" SI",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Blocks
		GameRegistry.addRecipe(new ItemStack(Blocks.diamondium), new Object[]{
				"DDD",
				"DDD",
				"DDD",
				'D', diamondiumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.emeraldi), new Object[]{
				"EEE",
				"EEE",
				"EEE",
				'E', emeraldiIngot
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.goldirite), new Object[]{
				"GGG",
				"GGG",
				"GGG",
				'G', goldiriteIngot
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.ironium), new Object[]{
				"III",
				"III",
				"III",
				'I', ironiumIngot
		});

		// Magnet
		GameRegistry.addRecipe(new ItemStack(Items.magnetItem), new Object[]{
				"III",
				"IRI",
				"I I",
				'I', ironiumIngot,
				'R', redstone
		});

		// Pickaxes
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumPickaxe), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiPickaxe), new Object[]{
				"EEE",
				" S ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiritePickaxe), new Object[]{
				"GGG",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumPickaxe), new Object[]{
				"III",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Shovels
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumShovel), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiShovel), new Object[]{
				" E ",
				" S ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteShovel), new Object[]{
				" G ",
				" S ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumShovel), new Object[]{
				" I ",
				" S ",
				" S ",
				'I', ironiumIngot,
				'S', stick
		});

		// Swords
		GameRegistry.addRecipe(new ItemStack(Items.diamondiumSword), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', diamondiumIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.emeraldiSword), new Object[]{
				" E ",
				" E ",
				" S ",
				'E', emeraldiIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.goldiriteSword), new Object[]{
				" G ",
				" G ",
				" S ",
				'G', goldiriteIngot,
				'S', stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.ironiumSword), new Object[]{
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

		registerSmeltingRecipe(new ItemStack(Blocks.diamondiumOre), new ItemStack(Items.diamondiumIngot), xpDiamondium);
		registerSmeltingRecipe(new ItemStack(Blocks.emeraldiOre), new ItemStack(Items.emeraldiIngot), xpEmeraldi);
		registerSmeltingRecipe(new ItemStack(Blocks.goldiriteOre), new ItemStack(Items.goldiriteIngot), xpGoldirite);
		registerSmeltingRecipe(new ItemStack(Blocks.ironiumOre), new ItemStack(Items.ironiumIngot), xpIronium);

		if (ConfigHandler.enableRottenFleshToLeatherRecipe) {
			// Rotten flesh -> leather
			registerSmeltingRecipe(new ItemStack(net.minecraft.init.Items.ROTTEN_FLESH), new ItemStack(net.minecraft.init.Items.LEATHER), xpLeather);
		}
	}
}
