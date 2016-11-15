package xlxacidxlx.datmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.creativetab.CreativeTabs;

import java.util.List;

/**
 * Created by Acid on 10/26/2016.
 */
public class BaseBlock extends Block {
	public boolean implemented = false;

	public BaseBlock(Material materialIn, String name) {
		super(materialIn);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2); // TODO: This may need to be changed..
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	public BaseBlock(String name) {
		super(Material.ROCK);

		setCreativeTab(CreativeTabs.blocks);

		name = name.toLowerCase().replace(" ", "");
		setRegistryName(DatMod.MODID, name);
		setUnlocalizedName(name);

		setHardness(1.5f);
		setHarvestLevel("pickaxe", 2); // TODO: This may need to be changed..
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if (!isImplemented()) {
			tooltip.add("[Not implemented!]");
		}

		super.addInformation(stack, playerIn, tooltip, advanced);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false; // TODO: Possibly change this for certain blocks..
	}

	public ModelResourceLocation getModelResourceLocation() {
		return new ModelResourceLocation(getRegistryName(), "inventory");
	}

	public ResourceLocation getResourceLocation() {
		return getRegistryName();
	}

	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}

	public boolean isImplemented() {
		return this.implemented;
	}

	public void setImplemented(boolean implemented) {
		this.implemented = implemented;
	}
}
