package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
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

        LootCondition.Builder builderStrawberry = BlockStatePropertyLootCondition.builder(AtBlocks.STRAWBERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 3));
        addDrop(AtBlocks.STRAWBERRY_CROP, 
                cropDrops(AtBlocks.STRAWBERRY_CROP, AtItems.STRAWBERRY, AtItems.STRAWBERRY_SEEDS, builderStrawberry));
    }

    public LootTable.Builder modOreDrop(Block drop, Item dropItem) 
    {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                /*(LootPoolEntry.Builder<?>)*/this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
