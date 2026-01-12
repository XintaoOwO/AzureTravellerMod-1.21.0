package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;
import xintao.azuretraveller.block.AtBlockFamily;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.AtItem;

public class AtModelProvider extends FabricModelProvider
{

    public AtModelProvider(FabricDataOutput output) 
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) 
    {
        AtBlockFamily.getFamily()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(blockFamily ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily.getBaseBlock())
                                .family(blockFamily));
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.RAW_MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.CELESTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.CELESTITE_BLOCK);
        
        blockStateModelGenerator.registerLog(AtBlock.CELESTE_LOG)
                .log(AtBlock.CELESTE_LOG).wood(AtBlock.CELESTE_WOOD);
        blockStateModelGenerator.registerLog(AtBlock.STRIPPED_CELESTE_LOG)
                .log(AtBlock.STRIPPED_CELESTE_LOG).wood(AtBlock.STRIPPED_CELESTE_WOOD);
        blockStateModelGenerator.registerLog(AtBlock.PEAR_LOG)
                .log(AtBlock.PEAR_LOG).wood(AtBlock.PEAR_WOOD);
        blockStateModelGenerator.registerLog(AtBlock.STRIPPED_PEAR_LOG)
                .log(AtBlock.STRIPPED_PEAR_LOG).wood(AtBlock.STRIPPED_PEAR_WOOD);
        blockStateModelGenerator.registerLog(AtBlock.PEACH_LOG)
                .log(AtBlock.PEACH_LOG).wood(AtBlock.PEACH_WOOD);
        blockStateModelGenerator.registerLog(AtBlock.STRIPPED_PEACH_LOG)
                .log(AtBlock.STRIPPED_PEACH_LOG).wood(AtBlock.STRIPPED_PEACH_WOOD);
        
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.PEAR_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.PEACH_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(AtBlock.CELESTE_LEAVES);
        
        blockStateModelGenerator.registerTintableCross(AtBlock.PEAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(AtBlock.PEACH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(AtBlock.CELESTE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        
        blockStateModelGenerator.registerSimpleState(AtBlock.OBSIDIAN_CHEST);
        
        blockStateModelGenerator.registerCrop(AtBlock.STRAWBERRY_CROP, Properties.AGE_3, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(AtItem.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItem.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(AtItem.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItem.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItem.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(AtItem.CELESTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AtItem.RAW_CELESTITE, Models.GENERATED);
        
        itemModelGenerator.register(AtItem.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.MYTHRIL_BOW, Models.HANDHELD);
        
        itemModelGenerator.registerArmor((ArmorItem) AtItem.MYTHRIL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.MYTHRIL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.MYTHRIL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.MYTHRIL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.OBSIDIAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.OBSIDIAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.OBSIDIAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) AtItem.OBSIDIAN_BOOTS);
        
        itemModelGenerator.register(AtItem.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AtItem.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(AtItem.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AtItem.OBSIDIAN_HOE, Models.HANDHELD);
        
        itemModelGenerator.register(AtItem.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(AtItem.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(AtItem.LUCKY_APPLE, Models.GENERATED);
    }
}
