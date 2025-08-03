package xintao.azuretraveller.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import xintao.azuretraveller.world.ore.AtOrePlacedFeature;

public class AtOreGeneration
{
    public static void modOreGeneration()
    {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(), 
                GenerationStep.Feature.UNDERGROUND_ORES,
                AtOrePlacedFeature.SILVER_ORE_PLACED);
    }
}
