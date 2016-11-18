package xlxacidxlx.datmod.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

import java.util.List;

/**
 * Created by Acid on 11/1/2016.
 */
public class ItemAxe extends net.minecraft.item.ItemAxe {
	private boolean implemented = false;

	/**
	 * Constructs the BaseItemAxe
	 *
	 * @param material The material the axe is made of
	 * @param name     The name of the axe
	 * @param damage   The amount of damage the axe has
	 * @param speed    How fast the axe is
	 */
	public ItemAxe(ToolMaterial material, String name, float damage, float speed) {
		super(material, damage, speed);

		setCreativeTab(CreativeTabs.tools);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
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
	public ModelResourceLocation getModelResourceLocation() {
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
