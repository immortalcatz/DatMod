package xlxacidxlx.datmod.creativetab;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Ingots extends net.minecraft.creativetab.CreativeTabs {
	public Ingots() {
		super(getNextID(), DatMod.MODID + "_ingots");
	}

	@Override
	public Item getTabIconItem() {
		return Items.DIAMOND;
	}
}
