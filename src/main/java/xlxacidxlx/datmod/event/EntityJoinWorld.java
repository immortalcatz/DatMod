package xlxacidxlx.datmod.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.item.ModItems;

/**
 * Created by Acid on 10/26/2016.
 */
public class EntityJoinWorld {
	@SubscribeEvent
	public void entityJoinWorld(EntityJoinWorldEvent event) {
		if (event.getWorld().isRemote) {
			return;
		}

		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			player.addChatComponentMessage(new TextComponentString("Thanks for trying out DatMod, " + player.getDisplayNameString() + "!"));

			InventoryPlayer inventory = player.inventory;
			ItemStack magnetStack = new ItemStack(ModItems.magnetItem);
			if (!inventory.hasItemStack(magnetStack)) {
				DatMod.logger.info("Magnet not found, adding to inventory..");

				boolean itemPlaced = false;
				int inventorySize = inventory.getSizeInventory();

				for (int i = 0; i < inventorySize; i++) {
					if (itemPlaced) {
						continue;
					}

					if (inventory.getStackInSlot(i) == null) {
						itemPlaced = true;
						inventory.setInventorySlotContents(i, magnetStack);
					}
				}
			}
		}
	}
}
