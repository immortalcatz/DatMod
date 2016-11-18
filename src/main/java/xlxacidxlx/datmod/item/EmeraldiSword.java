package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemSword;

/**
 * Created by Acid on 11/1/2016.
 */
public class EmeraldiSword extends ItemSword {
	/**
	 * Constructs the Emeraldi Sword
	 */
	public EmeraldiSword() {
		super(Materials.emeraldi, "Emeraldi Sword");

		setImplemented(true);
	}
}
