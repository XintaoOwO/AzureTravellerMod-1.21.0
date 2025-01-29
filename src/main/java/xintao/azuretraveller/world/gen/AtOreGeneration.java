package xintao.azuretraveller.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import xintao.azuretraveller.world.ore.AtOrePlacedFeatures;

public class AtOreGeneration 
{
    public static void modOreGeneration()
    {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(), 
                GenerationStep.Feature.UNDERGROUND_ORES,
                AtOrePlacedFeatures.SILVER_ORE_PLACED);
    }
}
