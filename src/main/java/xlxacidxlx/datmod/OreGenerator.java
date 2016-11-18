package xlxacidxlx.datmod;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import xlxacidxlx.datmod.register.Blocks;

import java.util.Random;

/**
 * Created by Acid on 11/2/2016.
 */
public class OreGenerator implements IWorldGenerator {
	// Diamondium Settings
	private int oreDiamondiumChance = 3;
	private int oreDiamondiumMaxVein = 5;
	private int oreDiamondiumMaxY = 20;

	// Emeraldi Settings
	private int oreEmeraldiChance = 4;
	private int oreEmeraldiMaxVein = 4;
	private int oreEmeraldiMaxY = 32;

	// Goldirite Settings
	private int oreGoldiriteChance = 2;
	private int oreGoldiriteMaxVein = 4;
	private int oreGoldiriteMaxY = 18;

	// Ironium Settings
	private int oreIroniumChance = 10;
	private int oreIroniumMaxVein = 8;
	private int oreIroniumMaxY = 63;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case -1:
				generateNether(world, random, chunkX, chunkZ);
				break;

			case 0:
				generateOverworld(world, random, chunkX, chunkZ);
				break;

			case 1:
				generateEnd(world, random, chunkX, chunkZ);
				break;
		}

	}

	/**
	 * Generates ores in "The End"
	 *
	 * @param world The current world
	 * @param rand  Random number
	 * @param x     X coordinate
	 * @param z     Z coordinate
	 */
	private void generateEnd(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(Blocks.diamondiumOre, world, rand, x, z, oreDiamondiumMaxVein, oreDiamondiumChance, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(Blocks.emeraldiOre, world, rand, x, z, oreEmeraldiMaxVein, oreEmeraldiChance, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(Blocks.goldiriteOre, world, rand, x, z, oreGoldiriteMaxVein, oreGoldiriteChance, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(Blocks.ironiumOre, world, rand, x, z, oreIroniumMaxVein, oreIroniumChance, oreIroniumMaxY);
		}
	}

	/**
	 * Generates ores in "The Nether"
	 *
	 * @param world The current world
	 * @param rand  Random number
	 * @param x     X coordinate
	 * @param z     Z coordinate
	 */
	private void generateNether(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(Blocks.diamondiumOre, world, rand, x, z, oreDiamondiumMaxVein, oreDiamondiumChance, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(Blocks.emeraldiOre, world, rand, x, z, oreEmeraldiMaxVein, oreEmeraldiChance, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(Blocks.goldiriteOre, world, rand, x, z, oreGoldiriteMaxVein, oreGoldiriteChance, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(Blocks.ironiumOre, world, rand, x, z, oreIroniumMaxVein, oreIroniumChance, oreIroniumMaxY);
		}
	}

	/**
	 * Generates ores in the "Overworld"
	 *
	 * @param world The current world
	 * @param rand  Random number
	 * @param x     X coordinate
	 * @param z     Z coordinate
	 */
	private void generateOverworld(World world, Random rand, int x, int z) {
		if (ConfigHandler.enableOreGenerationDiamondium) {
			generateOre(Blocks.diamondiumOre, world, rand, x, z, oreDiamondiumMaxVein, oreDiamondiumChance, oreDiamondiumMaxY);
		}

		if (ConfigHandler.enableOreGenerationEmeraldi) {
			generateOre(Blocks.emeraldiOre, world, rand, x, z, oreEmeraldiMaxVein, oreEmeraldiChance, oreEmeraldiMaxY);
		}

		if (ConfigHandler.enableOreGenerationGoldirite) {
			generateOre(Blocks.goldiriteOre, world, rand, x, z, oreGoldiriteMaxVein, oreGoldiriteChance, oreGoldiriteMaxY);
		}

		if (ConfigHandler.enableOreGenerationIronium) {
			generateOre(Blocks.ironiumOre, world, rand, x, z, oreIroniumMaxVein, oreIroniumChance, oreIroniumMaxY);
		}
	}

	/**
	 * Generates the specified Ore (Block) in the world
	 *
	 * @param block       The block to generate
	 * @param world       The current world
	 * @param random      Random number
	 * @param chunkX      Chunk X coordinate
	 * @param chunkZ      Chunk Z coordinate
	 * @param maxVeinSize The maximum vein size the ore can generate
	 * @param chance      The amount of chances the ore has to generate
	 * @param maxY        The maximum Y value the ore can generate at
	 */
	private void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int maxVeinSize, int chance, int maxY) {
		int radius = 16;

		for (int i = 0; i <= chance; i++) {
			int veinSize = 1 + random.nextInt(maxVeinSize);
			int posX = chunkX + random.nextInt(radius);
			int posZ = chunkZ + random.nextInt(radius);
			int posY = random.nextInt(maxY);

			BlockPos blockPosition = new BlockPos(posX, posY, posZ);
			WorldGenMinable worldGen = new WorldGenMinable(block.getDefaultState(), veinSize);
			worldGen.generate(world, random, blockPosition);
		}
	}
}