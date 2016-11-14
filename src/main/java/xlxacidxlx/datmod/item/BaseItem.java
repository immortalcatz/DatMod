package xlxacidxlx.datmod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

import java.util.List;

/**
 * Created by Acid on 11/1/2016.
 */
public class BaseItem extends net.minecraft.item.Item {
	public boolean implemented = false;

	public BaseItem(String name) {
		setCreativeTab(CreativeTabs.items);

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

	public String getName() {
		return this.toString().toLowerCase();
	}

	public boolean isImplemented() {
		return this.implemented;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		// TODO: Check if the magnet is active, and if it is cancel the drop of the item..
		return super.onDroppedByPlayer(item, player);
	}

	public void setImplemented(boolean implemented) {
		this.implemented = implemented;
	}
}
