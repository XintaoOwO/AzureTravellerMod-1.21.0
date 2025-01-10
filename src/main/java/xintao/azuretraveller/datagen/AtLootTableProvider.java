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
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;

import java.util.concurrent.CompletableFuture;

public class AtLootTableProvider extends FabricBlockLootTableProvider
{

    public AtLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(AtBlocks.MYTHRIL_BLOCK);
        addDrop(AtBlocks.RAW_MYTHRIL_BLOCK);
        addDrop(AtBlocks.SILVER_BLOCK);
        addDrop(AtBlocks.RAW_SILVER_BLOCK);
        addDrop(AtBlocks.CELESTITE_BLOCK);
        addDrop(AtBlocks.SILVER_ORE, modOreDrop(AtBlocks.SILVER_ORE, AtItems.RAW_SILVER));
        addDrop(AtBlocks.MYTHRIL_ORE, modOreDrop(AtBlocks.MYTHRIL_ORE, AtItems.RAW_MYTHRIL));
        addDrop(AtBlocks.CELESTITE_ORE, modOreDrop(AtBlocks.CELESTITE_ORE, AtItems.RAW_CELESTITE));
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
