package xintao.azuretraveller.world.tree;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlocks;

public class AtTreeConfiguredFeatures 
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> CELESTE_TREE_CONFIGURED = of("celeste_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEAR_TREE_CONFIGURED = of("pear_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_TREE_CONFIGURED = of("peach_tree");
    
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable)
    {
        register(featureRegisterable, CELESTE_TREE_CONFIGURED, Feature.TREE, 
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(AtBlocks.CELESTE_LOG), 
                        new StraightTrunkPlacer(4, 2, 0), 
                        BlockStateProvider.of(AtBlocks.CELESTE_LEAVES),
                        // 半径，相对于树干的偏移量，高度
                        new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 2), 
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                .build()
        );
        
        register(featureRegisterable, PEAR_TREE_CONFIGURED, Feature.TREE, 
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(AtBlocks.PEAR_LOG), 
                        new StraightTrunkPlacer(4, 1, 0), 
                        BlockStateProvider.of(AtBlocks.PEAR_LEAVES), 
                        new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 2), 
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                .build()
        );

        register(featureRegisterable, PEACH_TREE_CONFIGURED, Feature.TREE, 
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(AtBlocks.PEACH_LOG),
                        new StraightTrunkPlacer(2, 1, 0),
                        BlockStateProvider.of(AtBlocks.PEACH_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 2), 
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                .build()
        );
    }
    
    private static RegistryKey<ConfiguredFeature<?, ?>> of(String id) 
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AzureTraveller.MOD_ID, id));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> registerable, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config
    ) 
    {
        registerable.register(key, new ConfiguredFeature<>(feature, config));
    }
}
