package xintao.azuretraveller.world.tree;

import net.minecraft.block.SaplingGenerator;
import xintao.azuretraveller.AzureTraveller;

import java.util.Optional;

public class AtSaplingGenerator 
{
    public static final SaplingGenerator CELESTE_TREE_SAPLING = new SaplingGenerator(
            AzureTraveller.MOD_ID + ":" + "celeste_tree", 
            Optional.empty(), 
            Optional.of(AtTreeConfiguredFeatures.CELESTE_TREE_CONFIGURED), 
            Optional.empty()
    );
    public static final SaplingGenerator PEAR_TREE_SAPLING = new SaplingGenerator(
            AzureTraveller.MOD_ID + ":" + "pear_tree",
            Optional.empty(),
            Optional.of(AtTreeConfiguredFeatures.PEAR_TREE_CONFIGURED),
            Optional.empty()
    );
    public static final SaplingGenerator PEACH_TREE_SAPLING = new SaplingGenerator(
            AzureTraveller.MOD_ID + ":" + "peach_tree",
            Optional.empty(),
            Optional.of(AtTreeConfiguredFeatures.PEACH_TREE_CONFIGURED),
            Optional.empty()
    );
}
