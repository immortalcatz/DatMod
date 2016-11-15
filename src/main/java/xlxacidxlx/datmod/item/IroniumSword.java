package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class IroniumSword extends BaseItemSword {
	/**
	 * Constructs the Ironium sword
	 */
	IroniumSword() {
		super(Materials.ironium, "Ironium Sword");

		setImplemented(true);
	}
}
