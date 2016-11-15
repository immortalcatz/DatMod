package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class IroniumPickaxe extends BaseItemPickaxe {
	/**
	 * Constructs the Ironium Pickaxe
	 */
	IroniumPickaxe() {
		super(Materials.ironium, "Ironium Pickaxe");

		setImplemented(true);
	}
}
