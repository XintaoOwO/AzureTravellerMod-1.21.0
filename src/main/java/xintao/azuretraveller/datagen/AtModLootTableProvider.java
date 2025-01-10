package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItems;

import java.util.concurrent.CompletableFuture;

public class AtModLootTableProvider extends FabricBlockLootTableProvider
{

    public AtModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(AtModBlocks.MYTHRIL_BLOCK);
        addDrop(AtModBlocks.RAW_MYTHRIL_BLOCK);
        addDrop(AtModBlocks.SILVER_BLOCK);
        addDrop(AtModBlocks.RAW_SILVER_BLOCK);
        addDrop(AtModBlocks.CELESTITE_BLOCK);
        addDrop(AtModBlocks.SILVER_ORE, modOreDrop(AtModBlocks.SILVER_ORE, AtModItems.RAW_SILVER));
        addDrop(AtModBlocks.MYTHRIL_ORE, modOreDrop(AtModBlocks.MYTHRIL_ORE, AtModItems.RAW_MYTHRIL));
        addDrop(AtModBlocks.CELESTITE_ORE, modOreDrop(AtModBlocks.CELESTITE_ORE, AtModItems.RAW_CELESTITE));
    }

    public LootTable.Builder modOreDrop(Block drop, Item dropItem) 
    {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
