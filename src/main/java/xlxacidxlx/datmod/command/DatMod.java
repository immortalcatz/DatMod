package xlxacidxlx.datmod.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

// TODO: Figure out how to setup sub commands
public class DatMod extends CommandBase {
	@Override
	public String getCommandName() {
		return "DatMod";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return getCommandName();
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		String message = "Thanks for installing " + xlxacidxlx.datmod.DatMod.NAME + " v" + xlxacidxlx.datmod.DatMod.VERSION + "!";
		sender.addChatMessage(new TextComponentString(message));
	}
}
