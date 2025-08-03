package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.AtItem;
import xintao.azuretraveller.tag.AtItemTag;

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
        getOrCreateTagBuilder(AtItemTag.SUGAR_REFINING_TAG)
                .add(Items.BEETROOT);
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(AtBlock.CELESTE_LOG.asItem())
                .add(AtBlock.CELESTE_WOOD.asItem())
                .add(AtBlock.STRIPPED_CELESTE_LOG.asItem())
                .add(AtBlock.STRIPPED_CELESTE_WOOD.asItem());
        
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(AtItem.OBSIDIAN_HELMET)
                .add(AtItem.OBSIDIAN_CHESTPLATE)
                .add(AtItem.OBSIDIAN_LEGGINGS)
                .add(AtItem.OBSIDIAN_BOOTS)
                .add(AtItem.MYTHRIL_HELMET)
                .add(AtItem.MYTHRIL_CHESTPLATE)
                .add(AtItem.MYTHRIL_LEGGINGS)
                .add(AtItem.MYTHRIL_BOOTS);
        
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(AtItem.OBSIDIAN_SWORD)
                .add(AtItem.MYTHRIL_SWORD);
        
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(AtItem.OBSIDIAN_PICKAXE)
                .add(AtItem.MYTHRIL_PICKAXE)
                .add(AtItem.MYTHRIL_PICKAXE_AXE);
        
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(AtItem.OBSIDIAN_AXE)
                .add(AtItem.MYTHRIL_AXE)
                .add(AtItem.MYTHRIL_PICKAXE_AXE);
        
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(AtItem.OBSIDIAN_SHOVEL)
                .add(AtItem.MYTHRIL_SHOVEL);
        
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(AtItem.OBSIDIAN_HOE)
                .add(AtItem.MYTHRIL_HOE);
        
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(AtItem.OBSIDIAN_HELMET)
                .add(AtItem.MYTHRIL_HELMET);
        
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(AtItem.OBSIDIAN_CHESTPLATE)
                .add(AtItem.MYTHRIL_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(AtItem.OBSIDIAN_LEGGINGS)
                .add(AtItem.MYTHRIL_LEGGINGS);
        
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(AtItem.OBSIDIAN_BOOTS)
                .add(AtItem.MYTHRIL_BOOTS);
    }
}
