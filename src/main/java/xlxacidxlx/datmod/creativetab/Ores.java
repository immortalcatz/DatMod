package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Ores extends net.minecraft.creativetab.CreativeTabs {
	public Ores() {
		super(getNextID(), DatMod.MODID + "_ores");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(net.minecraft.init.Blocks.DIAMOND_ORE);
	}
}
