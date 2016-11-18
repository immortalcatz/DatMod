package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.base.Item;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

/**
 * Created by Acid on 10/26/2016.
 */
public class DiamondiumIngot extends Item {
	/**
	 * Constructs the Diamondium Ingot
	 */
	public DiamondiumIngot() {
		super("Diamondium Ingot");

		setCreativeTab(CreativeTabs.ingots);
		setImplemented(true);
	}
}
