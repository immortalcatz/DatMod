package xlxacidxlx.datmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xlxacidxlx.datmod.block.ModBlocks;
import xlxacidxlx.datmod.item.ModItems;

public class ModRecipes {
	public static void init() {
		registerRecipes();
		registerShapelessRecipes();
		registerSmeltingRecipes();
	}

	public static void registerRecipe(ItemStack output, String lineOne, String lineTwo, String lineThree, ItemStack input) {
		GameRegistry.addRecipe(output, lineOne, lineTwo, lineThree, input);
	}

	public static void registerRecipe(ItemStack output, Object... params) {
		GameRegistry.addRecipe(output, params);
	}

	public static void registerRecipes() {
		// TODO: Register recipes for mod tools (Diamondium, Emeraldi, Goldirite, Ironium)
	}

	public static void registerShapelessRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapelessRecipe(output, input);
	}

	public static void registerShapelessRecipes() {
		//
	}

	public static void registerSmeltingRecipe(ItemStack input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}

	public static void registerSmeltingRecipes() {
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

		// Rotten flesh -> leather (test smelting recipe)
		registerSmeltingRecipe(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER), xpLeather);
	}
}
