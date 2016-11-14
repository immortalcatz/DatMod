package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Items extends net.minecraft.creativetab.CreativeTabs {
	public Items() {
		super(getNextID(), DatMod.MODID + "_items");
	}

	@Override
	public Item getTabIconItem() {
		return net.minecraft.init.Items.ITEM_FRAME;
	}
}
