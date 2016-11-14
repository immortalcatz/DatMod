package xlxacidxlx.datmod;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
	// TODO: Work on this

	public static Configuration config;

	// General Settings
	public static boolean enableMod;
	public static boolean debugMode;

	// Feature Settings
	public static double magnetRadius;
	public static boolean mobsDropBones;

	// Ores Settings

	// World Settings
	public static boolean enableOreGen;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}

	public static void syncConfig() {
		String category;

		category = "General";
		config.addCustomCategoryComment(category, "Settings that don't really fit anywhere else.");
		debugMode = config.getBoolean("debugMode", category, false, "Toggles debug mode");
		enableMod = config.getBoolean("enableMod", category, true, "Toggles the mod");

		category = "Features";
		config.addCustomCategoryComment(category, "Settings related to the mods features");
		magnetRadius = config.getInt("magnetRadius", category, 8, 2, 16, "Sets the radius the magnet will pull items/XP from");
		mobsDropBones = config.getBoolean("mobsDropBones", category, true, "Toggles if mobs drop bones on death");

		category = "Ores";
		config.addCustomCategoryComment(category, "Settings related to Ores");

		category = "World";
		config.addCustomCategoryComment(category, "Settings related to the World (ore generation, biomes, etc)");
		enableOreGen = config.getBoolean("enableOreGen", category, true, "Toggles ore generation");

		config.save();
	}
}