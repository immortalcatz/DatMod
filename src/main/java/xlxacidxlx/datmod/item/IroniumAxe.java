package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
public class IroniumAxe extends BaseItemAxe {
	protected IroniumAxe() {
		super(Materials.ironium, "Ironium Axe", Materials.ironium.getDamageVsEntity(), Materials.ironium.getEfficiencyOnProperMaterial());
		// TODO: Properly set damage and speed

		setImplemented(true);
	}
}