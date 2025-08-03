package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import xintao.azuretraveller.block.AtBlock;

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
                .add(AtBlock.SILVER_ORE)
                .add(AtBlock.SILVER_BLOCK)
                .add(AtBlock.RAW_SILVER_BLOCK)
                .add(AtBlock.MYTHRIL_ORE)
                .add(AtBlock.MYTHRIL_BLOCK)
                .add(AtBlock.RAW_MYTHRIL_BLOCK)
                .add(AtBlock.CELESTITE_ORE)
                .add(AtBlock.CELESTITE_BLOCK)
                .add(AtBlock.OBSIDIAN_CHEST);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AtBlock.SILVER_ORE)
                .add(AtBlock.SILVER_BLOCK)
                .add(AtBlock.RAW_SILVER_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(AtBlock.OBSIDIAN_CHEST);
        
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
        
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(AtBlock.CELESTE_LOG)
                .add(AtBlock.CELESTE_WOOD)
                .add(AtBlock.STRIPPED_CELESTE_LOG)
                .add(AtBlock.STRIPPED_CELESTE_WOOD);
        
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(AtBlock.MYTHRIL_FENCE);
        /*
        // 这个标签决定模组添加的栅栏能否与木质的栅栏相连接。如果不添加此标签，那么栅栏将会与地狱砖栅栏相连。
        // 因为在游戏里，木质栅栏作为一个整体，共用Wooden_Fences这个属性标签。
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MYTHRIL_FENCE);
        */
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(AtBlock.MYTHRIL_FENCE_GATE);
        
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(AtBlock.MYTHRIL_WALL);
        
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(AtBlock.MYTHRIL_BUTTON);
    }
}
