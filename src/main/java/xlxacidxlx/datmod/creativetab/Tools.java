package xlxacidxlx.datmod.creativetab;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Tools extends net.minecraft.creativetab.CreativeTabs {
	public Tools() {
		super(getNextID(), DatMod.MODID + "_tools");
	}

	@Override
	public Item getTabIconItem() {
		return Items.DIAMOND_SWORD;
	}
}
