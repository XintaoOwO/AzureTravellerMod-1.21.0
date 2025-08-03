package xintao.azuretraveller.block.wood;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import xintao.azuretraveller.block.AtBlock;

public class AtWoodBlock
{
    public static void addModWood()
    {
        StrippableBlockRegistry.register(AtBlock.CELESTE_LOG, AtBlock.STRIPPED_CELESTE_LOG);
        StrippableBlockRegistry.register(AtBlock.CELESTE_WOOD, AtBlock.STRIPPED_CELESTE_WOOD);
        
        StrippableBlockRegistry.register(AtBlock.PEAR_LOG, AtBlock.STRIPPED_PEAR_LOG);
        StrippableBlockRegistry.register(AtBlock.PEAR_WOOD, AtBlock.STRIPPED_PEAR_WOOD);
        
        StrippableBlockRegistry.register(AtBlock.PEACH_LOG, AtBlock.STRIPPED_PEACH_LOG);
        StrippableBlockRegistry.register(AtBlock.PEACH_WOOD, AtBlock.STRIPPED_PEACH_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.CELESTE_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_CELESTE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_CELESTE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.CELESTE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.CELESTE_LEAVES, 30, 60);
        
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEAR_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_PEAR_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_PEAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEAR_LEAVES, 30, 60);
        
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEACH_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEACH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_PEACH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.STRIPPED_PEACH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(AtBlock.PEACH_LEAVES, 30, 60);
    }
}
