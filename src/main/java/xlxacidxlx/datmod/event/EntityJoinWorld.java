package xlxacidxlx.datmod.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xlxacidxlx.datmod.ConfigHandler;
import xlxacidxlx.datmod.DatMod;
import xlxacidxlx.datmod.register.Items;

import java.util.Set;

/**
 * Created by Acid on 10/26/2016.
 */
public class EntityJoinWorld {
	@SubscribeEvent
	public void entityJoinWorld(EntityJoinWorldEvent event) {
		if (event.getWorld().isRemote) {
			return;
		}

		Entity entity = event.getEntity();

		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();

			if (ConfigHandler.enableWelcomeMessage) {
				Style chatStyle = new Style().setBold(true).setColor(TextFormatting.GOLD);
				Style dividerStyle = new Style().setColor(TextFormatting.DARK_BLUE);
				Style githubStyle = new Style().setColor(TextFormatting.DARK_GRAY);

				ITextComponent divider = new TextComponentString("============================").setStyle(dividerStyle);
				ITextComponent message = new TextComponentString("Thanks for trying out " + DatMod.NAME + ", " + player.getDisplayNameString()).setStyle(chatStyle);
				ITextComponent githubMessage = ForgeHooks.newChatWithLinks("Be sure to report issues at our GitHub: http://github.com/xlxacidxlx/DatMod/").setStyle(githubStyle);

				player.addChatComponentMessage(divider);
				player.addChatComponentMessage(message);
				player.addChatComponentMessage(githubMessage);
				player.addChatComponentMessage(divider);
			}

			if (ConfigHandler.giveMagnet) {
				if (ConfigHandler.giveMagnetFirstJoinOnly) {
					Set<String> nbt = entity.getTags();

					if (!nbt.contains("playedBefore")) {
						return;
					}
				}

				InventoryPlayer inventory = player.inventory;
				ItemStack magnetStack = new ItemStack(Items.magnetItem);
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

				player.addTag("playedBefore");
			}
		}
	}
}
