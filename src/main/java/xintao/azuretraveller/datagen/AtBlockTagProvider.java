package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import xintao.azuretraveller.block.AtBlocks;

import java.util.concurrent.CompletableFuture;

public class AtBlockTagProvider extends FabricTagProvider.BlockTagProvider
{

    public AtBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AtBlocks.SILVER_ORE)
                .add(AtBlocks.SILVER_BLOCK)
                .add(AtBlocks.RAW_SILVER_BLOCK)
                .add(AtBlocks.MYTHRIL_ORE)
                .add(AtBlocks.MYTHRIL_BLOCK)
                .add(AtBlocks.RAW_MYTHRIL_BLOCK)
                .add(AtBlocks.CELESTITE_ORE)
                .add(AtBlocks.CELESTITE_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AtBlocks.SILVER_ORE)
                .add(AtBlocks.SILVER_BLOCK)
                .add(AtBlocks.RAW_SILVER_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);
        /*
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModBlockTags.INCORRECT_FOR_OBSIDIAN_TOOL);
                
        getOrCreateTagBuilder(ModBlockTags.NEEDS_OBSIDIAN_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.RAW_MYTHRIL_BLOCK)
                .add(ModBlocks.CELESTITE_ORE)
                .add(ModBlocks.CELESTITE_BLOCK);
        
        getOrCreateTagBuilder(ModBlockTags.INCORRECT_FOR_OBSIDIAN_TOOL)
                .addTag(ModBlockTags.INCORRECT_FOR_MYTHRIL_TOOL);
        
        getOrCreateTagBuilder(ModBlockTags.NEEDS_MYTHRIL_TOOL)
                .addTag(ModBlockTags.NEEDS_OBSIDIAN_TOOL);
        
        getOrCreateTagBuilder(ModBlockTags.INCORRECT_FOR_MYTHRIL_TOOL);
        
        getOrCreateTagBuilder(ModBlockTags.ORE_LIST)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.CELESTITE_ORE);
        */
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(AtBlocks.MYTHRIL_FENCE);
        /*
        // 这个标签决定模组添加的栅栏能否与木质的栅栏相连接。如果不添加此标签，那么栅栏将会与地狱砖栅栏相连。
        // 因为在游戏里，木质栅栏作为一个整体，共用Wooden_Fences这个属性标签。
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MYTHRIL_FENCE);
        */
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(AtBlocks.MYTHRIL_FENCE_GATE);
        
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(AtBlocks.MYTHRIL_WALL);
        
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(AtBlocks.MYTHRIL_BUTTON);
    }
}
