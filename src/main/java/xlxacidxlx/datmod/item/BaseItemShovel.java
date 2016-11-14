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
public class BaseItemShovel extends ItemSpade {
	public boolean implemented = false;

	public BaseItemShovel(ToolMaterial material, String name) {
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

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public boolean isImplemented() {
		return this.implemented;
	}
}
