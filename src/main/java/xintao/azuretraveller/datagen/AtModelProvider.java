package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;
import xintao.azuretraveller.block.AtBlockFamilies;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;

public class AtModelProvider extends FabricModelProvider
{

    public AtModelProvider(FabricDataOutput output) 
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) 
    {
        AtBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(blockFamily ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily.getBaseBlock())
                                .family(blockFamily));
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.RAW_MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.CELESTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.CELESTITE_BLOCK);
        
        blockStateModelGenerator.registerLog(AtBlocks.CELESTE_LOG).log(AtBlocks.CELESTE_LOG).wood(AtBlocks.CELESTE_WOOD);
        blockStateModelGenerator.registerLog(AtBlocks.STRIPPED_CELESTE_LOG).log(AtBlocks.STRIPPED_CELESTE_LOG).wood(AtBlocks.STRIPPED_CELESTE_WOOD);
        blockStateModelGenerator.registerLog(AtBlocks.PEAR_LOG).log(AtBlocks.PEAR_LOG).wood(AtBlocks.PEAR_WOOD);
        blockStateModelGenerator.registerLog(AtBlocks.PEACH_LOG).log(AtBlocks.PEACH_LOG).wood(AtBlocks.PEACH_WOOD);
        
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.PEAR_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.PEACH_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlocks.CELESTE_LEAVES);
        
        blockStateModelGenerator.registerTintableCross(AtBlocks.PEAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(AtBlocks.PEACH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(AtBlocks.CELESTE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        
        blockStateModelGenerator.registerSimpleState(AtBlocks.OBSIDIAN_CHEST);
        
        blockStateModelGenerator.registerCrop(AtBlocks.STRAWBERRY_CROP, Properties.AGE_3, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(AtItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(AtItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(AtItems.CELESTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItems.RAW_CELESTITE, Models.GENERATED);
        
        itemModelGenerator.register(AtItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtItems.MYTHRIL_HOE, Models.HANDHELD);
        
        itemModelGenerator.registerArmor((ArmorItem) AtItems.MYTHRIL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.MYTHRIL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.MYTHRIL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.MYTHRIL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.OBSIDIAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.OBSIDIAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.OBSIDIAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtItems.OBSIDIAN_BOOTS);
        
        itemModelGenerator.register(AtItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtItems.OBSIDIAN_HOE, Models.HANDHELD);
        
        itemModelGenerator.register(AtItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(AtItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(AtItems.LUCKY_APPLE, Models.GENERATED);
    }
}
