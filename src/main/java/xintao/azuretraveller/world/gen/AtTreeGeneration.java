package xintao.azuretraveller.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import xintao.azuretraveller.world.tree.AtTreePlacedFeatures;

public class AtTreeGeneration 
{
    public static void modTreeGeneration()
    {
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST), 
                GenerationStep.Feature.VEGETAL_DECORATION, AtTreePlacedFeatures.CELESTE_TREE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST), 
                GenerationStep.Feature.VEGETAL_DECORATION, AtTreePlacedFeatures.PEAR_TREE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST), 
                GenerationStep.Feature.VEGETAL_DECORATION, AtTreePlacedFeatures.PEACH_TREE_PLACED);
    }
}
