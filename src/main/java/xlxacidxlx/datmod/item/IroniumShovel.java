package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class IroniumShovel extends BaseItemShovel {
	/**
	 * Constructs the Ironium Shovel
	 */
	IroniumShovel() {
		super(Materials.ironium, "Ironium Shovel");

		setImplemented(true);
	}
}
