package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.AtItem;

import java.util.concurrent.CompletableFuture;

public class AtLangEnProvider extends FabricLanguageProvider
{
    public AtLangEnProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder)
    {
        translationBuilder.add("itemGroup.at_building_blocks", "Azure Traveller Building Blocks");
        translationBuilder.add("itemGroup.at_decorative_blocks", "Azure Traveller Decorative Blocks");
        translationBuilder.add("itemGroup.at_materials", "Azure Traveller Materials");
        translationBuilder.add("itemGroup.at_tools_armors", "Azure Traveller Tools & Armors");
        translationBuilder.add("itemGroup.at_food_crops", "Azure Traveller Food & Crops");
        
        translationBuilder.add(AtItem.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(AtItem.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(AtItem.CELESTITE_INGOT, "Celestite Ingot");
        translationBuilder.add(AtItem.RAW_SILVER, "Raw Silver");
        translationBuilder.add(AtItem.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(AtItem.RAW_CELESTITE, "Raw Celestite");
        
        translationBuilder.add(AtItem.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(AtItem.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(AtItem.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(AtItem.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(AtItem.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(AtItem.MYTHRIL_PICKAXE_AXE, "Mythril Pickaxe Axe");
        translationBuilder.add(AtItem.MYTHRIL_BOW, "Mythril Bow");
        translationBuilder.add(AtItem.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(AtItem.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(AtItem.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(AtItem.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(AtItem.OBSIDIAN_INGOT, "Obsidian Ingot");
        translationBuilder.add(AtItem.OBSIDIAN_SWORD, "Obsidian Sword");
        translationBuilder.add(AtItem.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        translationBuilder.add(AtItem.OBSIDIAN_AXE, "Obsidian Axe");
        translationBuilder.add(AtItem.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        translationBuilder.add(AtItem.OBSIDIAN_HOE, "Obsidian Hoe");
        translationBuilder.add(AtItem.OBSIDIAN_HELMET, "Obsidian Helmet");
        translationBuilder.add(AtItem.OBSIDIAN_CHESTPLATE, "Obsidian Chestplate");
        translationBuilder.add(AtItem.OBSIDIAN_LEGGINGS, "Obsidian Leggings");
        translationBuilder.add(AtItem.OBSIDIAN_BOOTS, "Obsidian Boots");
        
        translationBuilder.add(AtItem.BLUEBERRY, "Blueberry");
        translationBuilder.add(AtItem.STRAWBERRY, "Strawberry");
        translationBuilder.add(AtItem.LUCKY_APPLE, "Lucky Apple");
        translationBuilder.add(AtItem.STRAWBERRY_SEEDS, "Strawberry Seeds");
        
        translationBuilder.add(AtBlock.SILVER_ORE, "Silver Ore");
        translationBuilder.add(AtBlock.SILVER_BLOCK, "Silver Block");
        translationBuilder.add(AtBlock.RAW_SILVER_BLOCK, "Raw Silver Block");
        translationBuilder.add(AtBlock.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(AtBlock.MYTHRIL_BLOCK, "Mythril Block");
        translationBuilder.add(AtBlock.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        translationBuilder.add(AtBlock.CELESTITE_ORE, "Celestite Ore");
        translationBuilder.add(AtBlock.CELESTITE_BLOCK, "Celestite Block");
        translationBuilder.add(AtBlock.CELESTE_LOG, "Celeste Log");
        translationBuilder.add(AtBlock.CELESTE_WOOD, "Celeste Wood");
        translationBuilder.add(AtBlock.CELESTE_PLANKS, "Celeste Planks");
        translationBuilder.add(AtBlock.CELESTE_LEAVES, "Celeste Leaves");
        translationBuilder.add(AtBlock.CELESTE_SAPLING, "Celeste Sapling");
        translationBuilder.add(AtBlock.STRIPPED_CELESTE_LOG, "Stripped Celeste Log");
        translationBuilder.add(AtBlock.STRIPPED_CELESTE_WOOD, "Stripped Celeste Wood");
        translationBuilder.add(AtBlock.PEAR_LOG, "Pear Log");
        translationBuilder.add(AtBlock.PEAR_WOOD, "Pear Wood");
        translationBuilder.add(AtBlock.PEAR_LEAVES, "Pear Leaves");
        translationBuilder.add(AtBlock.PEAR_SAPLING, "Pear Sapling");
        translationBuilder.add(AtBlock.STRIPPED_PEAR_LOG, "Stripped Pear Log");
        translationBuilder.add(AtBlock.STRIPPED_PEAR_WOOD, "Stripped Pear Wood");
        translationBuilder.add(AtBlock.PEACH_LOG, "Peach Log");
        translationBuilder.add(AtBlock.PEACH_WOOD, "Peach Wood");
        translationBuilder.add(AtBlock.PEACH_LEAVES, "Peach Leaves");
        translationBuilder.add(AtBlock.PEACH_SAPLING, "Peach Sapling");
        translationBuilder.add(AtBlock.STRIPPED_PEACH_LOG, "Stripped Peach Log");
        translationBuilder.add(AtBlock.STRIPPED_PEACH_WOOD, "Stripped Peach Wood");
        
        translationBuilder.add(AtBlock.MYTHRIL_SLAB, "Mythril Slab");
        translationBuilder.add(AtBlock.MYTHRIL_STAIRS, "Mythril Stairs");
        translationBuilder.add(AtBlock.MYTHRIL_FENCE, "Mythril Fence");
        translationBuilder.add(AtBlock.MYTHRIL_FENCE_GATE, "Mythril Fence Gate");
        translationBuilder.add(AtBlock.MYTHRIL_WALL, "Mythril Wall");
        translationBuilder.add(AtBlock.MYTHRIL_BUTTON, "Mythril Button");
        translationBuilder.add(AtBlock.MYTHRIL_PRESSURE_PLATE, "Mythril Pressure Plate");
        translationBuilder.add(AtBlock.MYTHRIL_DOOR, "Mythril Door");
        translationBuilder.add(AtBlock.MYTHRIL_TRAPDOOR, "Mythril Trapdoor");
        translationBuilder.add(AtBlock.CELESTE_WOOD_DOOR, "Celeste Wood Door");
        
        translationBuilder.add(AtBlock.OBSIDIAN_CHEST, "Obsidian Chest");
    }
}
