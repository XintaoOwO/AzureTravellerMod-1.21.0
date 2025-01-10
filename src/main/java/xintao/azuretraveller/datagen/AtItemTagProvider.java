package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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
        
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(AtItems.OBSIDIAN_HELMET)
                .add(AtItems.OBSIDIAN_CHESTPLATE)
                .add(AtItems.OBSIDIAN_LEGGINGS)
                .add(AtItems.OBSIDIAN_BOOTS)
                .add(AtItems.MYTHRIL_HELMET)
                .add(AtItems.MYTHRIL_CHESTPLATE)
                .add(AtItems.MYTHRIL_LEGGINGS)
                .add(AtItems.MYTHRIL_BOOTS);
    }
}
