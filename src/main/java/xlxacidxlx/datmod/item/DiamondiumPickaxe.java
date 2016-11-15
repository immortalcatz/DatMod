package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 10/26/2016.
 */
class DiamondiumPickaxe extends BaseItemPickaxe {
	/**
	 * Constructs the Diamondium Pickaxe
	 */
	DiamondiumPickaxe() {
		super(Materials.diamondium, "Diamondium Pickaxe");

		setImplemented(true);
	}
}
