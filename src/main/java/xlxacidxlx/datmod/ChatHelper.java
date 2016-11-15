package xlxacidxlx.datmod;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

/**
 * Created by Acid on 11/15/2016.
 */
public class ChatHelper {
	public TextFormatting defaultColor = TextFormatting.GRAY;

	public static void messagePlayer(Entity player, String message) {
		player.addChatMessage(string(message));
	}

	public static TextComponentString string(String string) {
		return new TextComponentString(string);
	}

	public static TextComponentTranslation translate(String key, Object args) {
		return new TextComponentTranslation(key, args);
	}
}
