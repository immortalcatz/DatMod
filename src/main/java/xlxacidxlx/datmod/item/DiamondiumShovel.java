package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 10/26/2016.
 */
class DiamondiumShovel extends BaseItemShovel {
	/**
	 * Constructs the Diamondium Shovel
	 */
	DiamondiumShovel() {
		super(Materials.diamondium, "Diamondium Shovel");

		setImplemented(true);
	}
}
