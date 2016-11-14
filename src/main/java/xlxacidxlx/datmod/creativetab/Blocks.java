package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

public class Blocks extends net.minecraft.creativetab.CreativeTabs {
	public Blocks() {
		super(getNextID(), DatMod.MODID + "_blocks");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(net.minecraft.init.Blocks.DIAMOND_BLOCK);
	}
}
