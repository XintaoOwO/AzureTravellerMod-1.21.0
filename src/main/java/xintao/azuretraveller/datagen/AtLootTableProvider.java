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
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.AtItem;

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
        addDrop(AtBlock.MYTHRIL_BLOCK);
        addDrop(AtBlock.RAW_MYTHRIL_BLOCK);
        addDrop(AtBlock.SILVER_BLOCK);
        addDrop(AtBlock.RAW_SILVER_BLOCK);
        addDrop(AtBlock.CELESTITE_BLOCK);
        addDrop(AtBlock.SILVER_ORE, modOreDrop(AtBlock.SILVER_ORE, AtItem.RAW_SILVER));
        addDrop(AtBlock.MYTHRIL_ORE, modOreDrop(AtBlock.MYTHRIL_ORE, AtItem.RAW_MYTHRIL));
        addDrop(AtBlock.CELESTITE_ORE, modOreDrop(AtBlock.CELESTITE_ORE, AtItem.RAW_CELESTITE));

        LootCondition.Builder builderStrawberry = BlockStatePropertyLootCondition.builder(AtBlock.STRAWBERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 3));
        addDrop(AtBlock.STRAWBERRY_CROP,
                cropDrops(AtBlock.STRAWBERRY_CROP, AtItem.STRAWBERRY, AtItem.STRAWBERRY_SEEDS, builderStrawberry));
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
