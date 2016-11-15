package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
public class EmeraldiAxe extends BaseItemAxe {
	protected EmeraldiAxe() {
		super(Materials.emeraldi, "Emeraldi Axe", Materials.emeraldi.getDamageVsEntity(), Materials.emeraldi.getEfficiencyOnProperMaterial());
		// TODO: Properly set damage and speed

		setImplemented(true);
	}
}
