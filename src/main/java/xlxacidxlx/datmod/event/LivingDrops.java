package xlxacidxlx.datmod.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xlxacidxlx.datmod.DatMod;

import java.util.Random;

/**
 * Created by Acid on 11/15/2016.
 */
public class LivingDrops {
	@SubscribeEvent
	public void livingDrops(LivingDropsEvent event) {
		Entity entity = event.getEntity();

		if (entity instanceof IMob || entity instanceof IAnimals) {
			Random random = new Random();
			int maxDrops = 4;
			int minDrops = 1;
			int range = (maxDrops - minDrops);
			int drops = random.nextInt(range);

			if (drops > maxDrops) {
				drops = maxDrops;
			}

			DatMod.logger.info(drops + " bones dropped!");
			entity.dropItem(Items.BONE, drops);
		}
	}
}
