package xlxacidxlx.datmod.block;

import net.minecraft.block.material.Material;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

public class BaseBlockOre extends BaseBlock {
	public BaseBlockOre(Material material, String name) {
		super(material, name);

		setCreativeTab(CreativeTabs.ores);

		// TODO: These may need to be changed..
		setHardness(2.5f);
		setHarvestLevel("pickaxe", 4);
	}

	public BaseBlockOre(String name) {
		super(name);

		setCreativeTab(CreativeTabs.ores);

		// TODO: These may need to be changed..
		setHardness(2.5f);
		setHarvestLevel("pickaxe", 4);
	}
}
