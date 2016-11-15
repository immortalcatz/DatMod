package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class IroniumAxe extends BaseItemAxe {
	/**
	 * Constructs the Ironium Axe
	 */
	IroniumAxe() {
		super(Materials.ironium, "Ironium Axe", Materials.ironium.getDamageVsEntity(), Materials.ironium.getEfficiencyOnProperMaterial());

		setImplemented(true);
	}
}