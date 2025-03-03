package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;
import xintao.azuretraveller.tag.AtItemTags;

import java.util.concurrent.CompletableFuture;

public class AtItemTagProvider extends FabricTagProvider.ItemTagProvider 
{
    public AtItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) 
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) 
    {
        getOrCreateTagBuilder(AtItemTags.SUGAR_REFINING_TAG)
                .add(Items.BEETROOT);
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(AtBlocks.CELESTE_LOG.asItem())
                .add(AtBlocks.CELESTE_WOOD.asItem())
                .add(AtBlocks.STRIPPED_CELESTE_LOG.asItem())
                .add(AtBlocks.STRIPPED_CELESTE_WOOD.asItem());
        
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(AtItems.OBSIDIAN_HELMET)
                .add(AtItems.OBSIDIAN_CHESTPLATE)
                .add(AtItems.OBSIDIAN_LEGGINGS)
                .add(AtItems.OBSIDIAN_BOOTS)
                .add(AtItems.MYTHRIL_HELMET)
                .add(AtItems.MYTHRIL_CHESTPLATE)
                .add(AtItems.MYTHRIL_LEGGINGS)
                .add(AtItems.MYTHRIL_BOOTS);
        
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(AtItems.OBSIDIAN_SWORD)
                .add(AtItems.MYTHRIL_SWORD);
        
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(AtItems.OBSIDIAN_PICKAXE)
                .add(AtItems.MYTHRIL_PICKAXE)
                .add(AtItems.MYTHRIL_PICKAXE_AXE);
        
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(AtItems.OBSIDIAN_AXE)
                .add(AtItems.MYTHRIL_AXE)
                .add(AtItems.MYTHRIL_PICKAXE_AXE);
        
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(AtItems.OBSIDIAN_SHOVEL)
                .add(AtItems.MYTHRIL_SHOVEL);
        
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(AtItems.OBSIDIAN_HOE)
                .add(AtItems.MYTHRIL_HOE);
        
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(AtItems.OBSIDIAN_HELMET)
                .add(AtItems.MYTHRIL_HELMET);
        
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(AtItems.OBSIDIAN_CHESTPLATE)
                .add(AtItems.MYTHRIL_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(AtItems.OBSIDIAN_LEGGINGS)
                .add(AtItems.MYTHRIL_LEGGINGS);
        
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(AtItems.OBSIDIAN_BOOTS)
                .add(AtItems.MYTHRIL_BOOTS);
    }
}
