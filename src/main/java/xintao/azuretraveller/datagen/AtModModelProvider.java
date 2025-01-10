package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import xintao.azuretraveller.block.AtModBlockFamilies;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItems;

public class AtModModelProvider extends FabricModelProvider
{

    public AtModModelProvider(FabricDataOutput output) 
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) 
    {
        AtModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(blockFamily ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily.getBaseBlock())
                                .family(blockFamily));
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.RAW_MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.CELESTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.CELESTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtModBlocks.CELESTE_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(AtModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(AtModItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(AtModItems.CELESTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtModItems.RAW_CELESTITE, Models.GENERATED);
        
        itemModelGenerator.register(AtModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.MYTHRIL_HOE, Models.HANDHELD);
        
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.MYTHRIL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.MYTHRIL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.MYTHRIL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.MYTHRIL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.OBSIDIAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.OBSIDIAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.OBSIDIAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtModItems.OBSIDIAN_BOOTS);
        
        itemModelGenerator.register(AtModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtModItems.OBSIDIAN_HOE, Models.HANDHELD);
        
        itemModelGenerator.register(AtModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(AtModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(AtModItems.LUCKY_APPLE, Models.GENERATED);
    }
}
