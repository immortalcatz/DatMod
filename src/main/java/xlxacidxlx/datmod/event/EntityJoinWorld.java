package xlxacidxlx.datmod.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.item.ModItems;

public class EntityJoinWorld {
	@SubscribeEvent
	public void entityJoinWorld(EntityJoinWorldEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			// TODO: Add link to GitHub issues to the welcome message!
			player.addChatComponentMessage(new TextComponentString("Thanks for trying out DatMod, " + player.getDisplayNameString() + "!"));

			// TODO: Add a config for if the magnet should be given on first world join
			boolean foundItem = false;
			InventoryPlayer inventory = player.inventory;
			int inventorySize = inventory.getSizeInventory();
			ItemStack magnetStack = new ItemStack(ModItems.magnetItem);
			for (int i = 0; i < inventorySize; i++) {
				if (foundItem) {
					continue;
				}

				try {
					if (inventory.getStackInSlot(i).isItemEqual(magnetStack)) {
						DatMod.logger.info("Found magnet!");
						foundItem = true;
					}
				} catch (NullPointerException ignored) {
				}
			}

			if (!foundItem) {
				DatMod.logger.info("Magnet not found, adding to inventory..");
				inventory.setInventorySlotContents(0, magnetStack);
			}
		}
	}
}
