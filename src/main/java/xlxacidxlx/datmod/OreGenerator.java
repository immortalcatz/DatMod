package xlxacidxlx.datmod;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import xlxacidxlx.datmod.block.ModBlocks;

import java.util.Random;

// TODO: The values for ore generation may need to be tinkered with..

/**
 * Created by Acid on 11/2/2016.
 */
public class OreGenerator implements IWorldGenerator {
	// Diamondium Settings
	private int oreDiamondiumChance = 2;
	private int oreDiamondiumMaxVein = 4;
	private int oreDiamondiumMaxY = 18;

	// Emeraldi Settings
	private int oreEmeraldiChance = 4;
	private int oreEmeraldiMaxVein = 2;
	private int oreEmeraldiMaxY = 32;

	// Goldirite Settings
	private int oreGoldiriteChance = 3;
	private int oreGoldiriteMaxVein = 3;
	private int oreGoldiriteMaxY = 32;

	// Ironium Settings
	private int oreIroniumChance = 8;
	private int oreIroniumMaxVein = 5;
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
		}

	}

	public void generateNether(World world, Random rand, int x, int z) {
	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(ModBlocks.diamondiumOre, world, rand, x, z, oreDiamondiumMaxVein, oreDiamondiumChance, oreDiamondiumMaxY);
		generateOre(ModBlocks.emeraldiOre, world, rand, x, z, oreEmeraldiMaxVein, oreEmeraldiChance, oreEmeraldiMaxY);
		generateOre(ModBlocks.goldiriteOre, world, rand, x, z, oreGoldiriteMaxVein, oreGoldiriteChance, oreGoldiriteMaxY);
		generateOre(ModBlocks.ironiumOre, world, rand, x, z, oreIroniumMaxVein, oreIroniumChance, oreIroniumMaxY);
	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int maxVienSize, int chance, int maxY) {
		int radius = 16;

		for (int i = 0; i <= chance; i++) {
			int veinSize = random.nextInt(maxVienSize);
			int posX = chunkX + random.nextInt(radius);
			int posZ = chunkZ + random.nextInt(radius);
			int posY = random.nextInt(maxY);
			BlockPos blockPosition = new BlockPos(posX, posY, posZ);

			WorldGenMinable worldGen = new WorldGenMinable(block.getDefaultState(), veinSize);
			worldGen.generate(world, random, blockPosition);

			// TODO: Uncomment this to help debug ore generation
			/*String position = " at (X: " + blockPosition.getX() + ", Y: " + blockPosition.getY() + ", Z: " + blockPosition.getZ() + ")";
			DatMod.logger.info("Generated ore: " + block.getLocalizedName() + position);*/
		}
	}
}