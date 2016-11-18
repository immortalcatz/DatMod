package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

/**
 * Created by Acid on 10/26/2016.
 */
public class Items extends net.minecraft.creativetab.CreativeTabs {
	/**
	 * Constructs the Items Creative Tab
	 */
	public Items() {
		super(getNextID(), DatMod.MODID + "_items");
	}

	@Override
	public Item getTabIconItem() {
		return xlxacidxlx.datmod.register.Items.magnetItem;
	}
}
