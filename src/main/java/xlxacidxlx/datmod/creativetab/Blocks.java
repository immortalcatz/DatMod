package xlxacidxlx.datmod.creativetab;

import net.minecraft.item.Item;
import xlxacidxlx.datmod.DatMod;

/**
 * Created by Acid on 10/26/2016.
 */
public class Blocks extends net.minecraft.creativetab.CreativeTabs {
	/**
	 * Registers the Blocks Creative Tab
	 */
	public Blocks() {
		super(getNextID(), DatMod.MODID + "_blocks");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(xlxacidxlx.datmod.register.Blocks.diamondium);
	}
}
