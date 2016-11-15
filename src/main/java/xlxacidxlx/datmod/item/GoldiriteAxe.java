package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class GoldiriteAxe extends BaseItemAxe {
	/**
	 * Constructs the Goldirite Axe
	 */
	GoldiriteAxe() {
		super(Materials.goldirite, "Goldirite Axe", Materials.goldirite.getDamageVsEntity(), Materials.goldirite.getEfficiencyOnProperMaterial());

		setImplemented(true);
	}
}