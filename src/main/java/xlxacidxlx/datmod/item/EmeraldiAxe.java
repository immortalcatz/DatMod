package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
class EmeraldiAxe extends BaseItemAxe {
	/**
	 * Constructs the Emeraldi Axe
	 */
	EmeraldiAxe() {
		super(Materials.emeraldi, "Emeraldi Axe", Materials.emeraldi.getDamageVsEntity(), Materials.emeraldi.getEfficiencyOnProperMaterial());

		setImplemented(true);
	}
}
