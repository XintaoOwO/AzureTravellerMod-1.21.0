package xintao.azuretraveller.world.ore;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import xintao.azuretraveller.AzureTraveller;

import java.util.List;

public class AtOrePlacedFeatures
{
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED = of("silver_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable)
    {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable
                .getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        
        register(featureRegisterable, SILVER_ORE_PLACED, registryEntryLookup
                .getOrThrow(AtOreConfiguredFeatures.SILVER_ORE_CONFIGURED), 
                modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(48))));
    }
    
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) 
    {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) 
    {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) 
    {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    private static RegistryKey<PlacedFeature> of(String id)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(AzureTraveller.MOD_ID, id));
    }

    private static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            List<PlacementModifier> modifiers
    )
    {
        featureRegisterable.register(key, new PlacedFeature(feature, List.copyOf(modifiers)));
    }

    private static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            PlacementModifier... modifiers
    )
    {
        register(featureRegisterable, key, feature, List.of(modifiers));
    }
}
