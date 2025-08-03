package xintao.azuretraveller.world.tree;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlock;

import java.util.List;

public class AtTreePlacedFeatures
{
    public static final RegistryKey<PlacedFeature> CELESTE_TREE_PLACED = of("celeste_tree_placed");
    public static final RegistryKey<PlacedFeature> PEAR_TREE_PLACED = of("pear_tree_placed");
    public static final RegistryKey<PlacedFeature> PEACH_TREE_PLACED = of("peach_tree_placed");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable)
    {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable
                .getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        
        register(featureRegisterable, CELESTE_TREE_PLACED, registryEntryLookup
                .getOrThrow(AtTreeConfiguredFeatures.CELESTE_TREE_CONFIGURED),
                    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), 
                        AtBlock.CELESTE_SAPLING
                    )
        );

        register(featureRegisterable, PEAR_TREE_PLACED, registryEntryLookup
                .getOrThrow(AtTreeConfiguredFeatures.PEAR_TREE_CONFIGURED),
                    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2),
                        AtBlock.PEAR_SAPLING
                )
        );

        register(featureRegisterable, PEACH_TREE_PLACED, registryEntryLookup
                .getOrThrow(AtTreeConfiguredFeatures.PEACH_TREE_CONFIGURED),
                    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2),
                        AtBlock.PEACH_SAPLING
                )
        );
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
