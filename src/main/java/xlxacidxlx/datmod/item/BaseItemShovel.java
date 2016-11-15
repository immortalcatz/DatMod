package xlxacidxlx.datmod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

import java.util.List;

/**
 * Created by Acid on 11/1/2016.
 */
class BaseItemShovel extends ItemSpade {
	private boolean implemented = false;

	/**
	 * Constructs the BaseItemShovel
	 *
	 * @param material The material the shovel is made of
	 * @param name     The name of the shovel
	 */
	BaseItemShovel(ToolMaterial material, String name) {
		super(material);

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

	/**
	 * Gets the items model location
	 *
	 * @return ModelResourceLocation
	 */
	ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	/**
	 * Checks if the item is set as implemented
	 *
	 * @return boolean
	 */
	private boolean isImplemented() {
		return this.implemented;
	}

	/**
	 * Sets if the item is implemented
	 *
	 * @param implemented True/false
	 */
	public void setImplemented(boolean implemented) {
		this.implemented = implemented;
	}
}
