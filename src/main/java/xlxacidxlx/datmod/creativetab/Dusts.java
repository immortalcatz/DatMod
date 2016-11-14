package xlxacidxlx.datmod.creativetab;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Dusts extends net.minecraft.creativetab.CreativeTabs {
	public Dusts() {
		super(getNextID(), DatMod.MODID + "_dusts");
	}

	@Override
	public Item getTabIconItem() {
		return Items.ITEM_FRAME;
	}
}
