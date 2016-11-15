package xlxacidxlx.datmod;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Acid on 10/26/2016.
 */
public class Materials {
	// Name, Harvest Level, Max Uses(Durability), Efficiency, Damage, Enchantability
	public static Item.ToolMaterial diamondium = EnumHelper.addToolMaterial("diamondium", 3, 2000, 10.0F, 4.0F, 14);
	public static Item.ToolMaterial emeraldi = EnumHelper.addToolMaterial("emeraldi", 3, 800, 11.0F, 3.5F, 20);
	public static Item.ToolMaterial goldirite = EnumHelper.addToolMaterial("goldirite", 3, 125, 14.0F, 1.0F, 24);
	public static Item.ToolMaterial ironium = EnumHelper.addToolMaterial("ironium", 3, 500, 7.0F, 4.0F, 18);

	public static Item.ToolMaterial getDiamondium() {
		return diamondium;
	}

	public static Item.ToolMaterial getEmeraldi() {
		return emeraldi;
	}

	public static Item.ToolMaterial getGoldirite() {
		return goldirite;
	}

	public static Item.ToolMaterial getIronium() {
		return ironium;
	}
}
