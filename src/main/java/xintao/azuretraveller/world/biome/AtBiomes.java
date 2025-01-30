package xintao.azuretraveller.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import xintao.azuretraveller.AzureTraveller;

public class AtBiomes
{
    public static final RegistryKey<Biome> FRUIT_FOREST = RegistryKey.of(RegistryKeys.BIOME, 
            Identifier.of(AzureTraveller.MOD_ID, "fruit_forest"));

    // 全局主世界生物群系生成特征
    private static void modGlobalOverWorldBiomeGeneration(GenerationSettings.LookupBackedBuilder lookupBackedBuilder) 
    {
        DefaultBiomeFeatures.addLandCarvers(lookupBackedBuilder);
        DefaultBiomeFeatures.addSprings(lookupBackedBuilder);
        DefaultBiomeFeatures.addMineables(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultOres(lookupBackedBuilder);
        DefaultBiomeFeatures.addDungeons(lookupBackedBuilder);
        DefaultBiomeFeatures.addAmethystGeodes(lookupBackedBuilder);
        DefaultBiomeFeatures.addFrozenTopLayer(lookupBackedBuilder);
    }
    
    private static Biome addFruitForestBiome(Registerable<Biome> biomeRegisterable)
    {
        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = 
                new GenerationSettings
                        .LookupBackedBuilder(biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE), 
                biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 2, 1, 2));

        modGlobalOverWorldBiomeGeneration(lookupBackedBuilder);
        
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
        
        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(lookupBackedBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects(new BiomeEffects.Builder()
                        .skyColor(0x79a6ff)
                        .fogColor(0xc0d8ff)
                        .waterColor(0x3f76e4)
                        .waterFogColor(0x050533)
                        .build())
                .build();
    }
    
    public static void bootstrap(Registerable<Biome> biomeRegisterable)
    {
        
    }
}
