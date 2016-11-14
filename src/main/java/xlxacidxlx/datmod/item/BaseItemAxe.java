package xlxacidxlx.datmod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

import java.util.List;

/**
 * Created by Acid on 11/1/2016.
 */
public class BaseItemAxe extends ItemAxe {
	public boolean implemented = false;

	protected BaseItemAxe(ToolMaterial material, String name, float damage, float speed) {
		super(material, damage, speed);

		setCreativeTab(CreativeTabs.tools);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if (!isImplemented()) {
			tooltip.add("[Not implemented!]");
		}

		super.addInformation(stack, playerIn, tooltip, advanced);
	}

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public boolean isImplemented() {
		return this.implemented;
	}
}
