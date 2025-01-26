package xintao.azuretraveller.world.tree;

import net.minecraft.block.SaplingGenerator;
import xintao.azuretraveller.AzureTraveller;

import java.util.Optional;

public class AtSaplingGenerator 
{
    public static final SaplingGenerator CELESTE_TREE = new SaplingGenerator(
            AzureTraveller.MOD_ID + ":" + "celeste_tree", 
            Optional.empty(), 
            Optional.of(AtTreeConfiguredFeatures.CELESTE_TREE_CONFIGURED), 
            Optional.empty()
    );
    
}
