package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class GoldiriteShovel extends BaseItemShovel {
	/**
	 * Constructs the Goldirite Shovel
	 */
	GoldiriteShovel() {
		super(Materials.goldirite, "Goldirite Shovel");

		setImplemented(true);
	}
}
