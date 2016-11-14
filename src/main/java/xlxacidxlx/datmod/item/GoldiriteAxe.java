package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
public class GoldiriteAxe extends BaseItemAxe {
	protected GoldiriteAxe() {
		super(Materials.goldirite, "Goldirite Axe", Materials.goldirite.getDamageVsEntity(), Materials.goldirite.getEfficiencyOnProperMaterial());
		// TODO: Properly set damage and speed
	}
}