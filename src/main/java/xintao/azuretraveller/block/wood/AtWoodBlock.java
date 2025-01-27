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
        
        StrippableBlockRegistry.register(AtBlocks.PEAR_LOG, AtBlocks.STRIPPED_PEAR_LOG);
        StrippableBlockRegistry.register(AtBlocks.PEAR_WOOD, AtBlocks.STRIPPED_PEAR_WOOD);
        
        StrippableBlockRegistry.register(AtBlocks.PEACH_LOG, AtBlocks.STRIPPED_PEACH_LOG);
        StrippableBlockRegistry.register(AtBlocks.PEACH_WOOD, AtBlocks.STRIPPED_PEACH_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_CELESTE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.CELESTE_LEAVES, 30, 60);
        
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEAR_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_PEAR_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_PEAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEAR_LEAVES, 30, 60);
        
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEACH_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEACH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_PEACH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.STRIPPED_PEACH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlocks.PEACH_LEAVES, 30, 60);
    }
}
