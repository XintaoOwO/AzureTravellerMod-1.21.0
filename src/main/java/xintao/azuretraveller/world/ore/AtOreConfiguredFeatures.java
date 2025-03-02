package xintao.azuretraveller.world.ore;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlocks;

import java.util.List;

public class AtOreConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_CONFIGURED = of("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_MYTHRIL_ORE_CONFIGURED = of("nether_mythril_ore");
    
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable)
    {
        RuleTest stoneReplace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplace = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endStoneReplace = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overWorldTarget = List.of(
                OreFeatureConfig.createTarget(stoneReplace, AtBlocks.SILVER_ORE.getDefaultState())
            );
        List<OreFeatureConfig.Target> netherTarget = List.of();
        List<OreFeatureConfig.Target> endTarget = List.of();
        
        // 银矿。size参数为矿脉最大矿物数量
        register(featureRegisterable, SILVER_ORE_CONFIGURED, Feature.ORE, new OreFeatureConfig(overWorldTarget, 8));
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
