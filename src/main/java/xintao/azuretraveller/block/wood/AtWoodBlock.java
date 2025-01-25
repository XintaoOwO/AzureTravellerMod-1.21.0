package xintao.azuretraveller.block.wood;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import xintao.azuretraveller.block.AtBlocks;

public class AtWoodBlock 
{
    public static void registerModWood()
    {
        StrippableBlockRegistry.register(AtBlocks.CELESTE_LOG, AtBlocks.STRIPPED_CELESTE_LOG);
        StrippableBlockRegistry.register(AtBlocks.CELESTE_WOOD, AtBlocks.STRIPPED_CELESTE_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_CELESTE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_LEAVES, 30, 60);
    }
}
