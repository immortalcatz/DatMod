package xlxacidxlx.datmod.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.DatMod;

import java.util.List;

public class Magnet extends BaseItem {
	public static boolean active = false;

	public Magnet() {
		super("Magnet");

		setImplemented(true);
		setMaxDamage(0);
		setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("It's very... attractive!");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}

	public static boolean isActive(ItemStack itemStack) {
		return active;
	}

	@Override
	public boolean isDamageable() {
		return false;
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if (!worldIn.isRemote) {
			if (!playerIn.isSneaking()) {
				playerIn.addChatComponentMessage(new TextComponentString("You must be sneaking to toggle the magnet!"));
				return ActionResult.newResult(EnumActionResult.FAIL, itemStackIn);
			}

			String message = "Magnet has been %s";
			NBTTagCompound itemTagCompound = itemStackIn.getTagCompound();
			if (isActive(itemStackIn)) {
				message = String.format(message, "deactivated");
				active = false;
				itemTagCompound.removeTag("ench");
			} else {
				message = String.format(message, "activated");
				active = true;
				itemStackIn.addEnchantment(Enchantments.EFFICIENCY, 1);
			}

			DatMod.logger.info(message);
			playerIn.addChatComponentMessage(new TextComponentString(message));
		}

		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

		if (isActive(stack)) {
			double radius = ConfigHandler.magnetRadius;

			// TODO: Figure out some way to combine these..
			List<EntityItem> items = entityIn.worldObj.getEntitiesWithinAABB(EntityItem.class, entityIn.getEntityBoundingBox().expand(radius, radius, radius));
			List<EntityXPOrb> xps = entityIn.worldObj.getEntitiesWithinAABB(EntityXPOrb.class, entityIn.getEntityBoundingBox().expand(radius, radius, radius));

			for (EntityItem item : items) {
				teleportToPlayer(item, (EntityPlayer) entityIn);
			}

			for (EntityXPOrb xp : xps) {
				teleportToPlayer(xp, (EntityPlayer) entityIn);
			}
		}
	}

	public static void teleportToPlayer(Entity item, EntityPlayer player) {
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		double factor = 1;

		item.addVelocity((x - item.posX) * factor, (y - item.posY) * factor, (z - item.posZ) * factor);
	}
}
