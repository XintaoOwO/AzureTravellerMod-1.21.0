package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.MYTHRIL_BLOCK);
        addDrop(ModBlocks.RAW_MYTHRIL_BLOCK);
        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.RAW_SILVER_BLOCK);
        addDrop(ModBlocks.CELESTITE_BLOCK);
        //addDrop(ModBlocks.MYTHRIL_ORE, oreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL));
        addDrop(ModBlocks.SILVER_ORE, modOreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.MYTHRIL_ORE, modOreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL));
        addDrop(ModBlocks.CELESTITE_ORE, modOreDrops(ModBlocks.CELESTITE_ORE, ModItems.RAW_CELESTITE));
    }

    public LootTable.Builder modOreDrops(Block drop, Item dropItem) 
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
