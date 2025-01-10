package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import xintao.azuretraveller.item.AtModItems;
import xintao.azuretraveller.tag.AtModItemTags;
import java.util.concurrent.CompletableFuture;

public class AtModItemTagProvider extends FabricTagProvider.ItemTagProvider 
{
    public AtModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) 
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) 
    {
        getOrCreateTagBuilder(AtModItemTags.SUGAR_REFINING_TAG)
                .add(Items.BEETROOT);
        
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(AtModItems.OBSIDIAN_HELMET)
                .add(AtModItems.OBSIDIAN_CHESTPLATE)
                .add(AtModItems.OBSIDIAN_LEGGINGS)
                .add(AtModItems.OBSIDIAN_BOOTS)
                .add(AtModItems.MYTHRIL_HELMET)
                .add(AtModItems.MYTHRIL_CHESTPLATE)
                .add(AtModItems.MYTHRIL_LEGGINGS)
                .add(AtModItems.MYTHRIL_BOOTS);
    }
}
