package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 10/26/2016.
 */
class DiamondiumSword extends BaseItemSword {
	/**
	 * Construcs the Diamondium Sword
	 */
	DiamondiumSword() {
		super(Materials.diamondium, "Diamondium Sword");

		setImplemented(true);
	}
}
