package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class GoldiriteSword extends BaseItemSword {
	/**
	 * Constructs the Goldirite Sword
	 */
	GoldiriteSword() {
		super(Materials.goldirite, "Goldirite Sword");

		setImplemented(true);
	}
}
