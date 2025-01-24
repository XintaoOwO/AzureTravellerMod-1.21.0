package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;

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
        
        translationBuilder.add(AtItems.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(AtItems.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(AtItems.CELESTITE_INGOT, "Celestite Ingot");
        translationBuilder.add(AtItems.RAW_SILVER, "Raw Silver");
        translationBuilder.add(AtItems.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(AtItems.RAW_CELESTITE, "Raw Celestite");
        
        translationBuilder.add(AtItems.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(AtItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(AtItems.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(AtItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(AtItems.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(AtItems.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(AtItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(AtItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(AtItems.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(AtItems.OBSIDIAN_INGOT, "Obsidian Ingot");
        translationBuilder.add(AtItems.OBSIDIAN_SWORD, "Obsidian Sword");
        translationBuilder.add(AtItems.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        translationBuilder.add(AtItems.OBSIDIAN_AXE, "Obsidian Axe");
        translationBuilder.add(AtItems.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        translationBuilder.add(AtItems.OBSIDIAN_HOE, "Obsidian Hoe");
        translationBuilder.add(AtItems.OBSIDIAN_HELMET, "Obsidian Helmet");
        translationBuilder.add(AtItems.OBSIDIAN_CHESTPLATE, "Obsidian Chestplate");
        translationBuilder.add(AtItems.OBSIDIAN_LEGGINGS, "Obsidian Leggings");
        translationBuilder.add(AtItems.OBSIDIAN_BOOTS, "Obsidian Boots");
        
        translationBuilder.add(AtItems.BLUEBERRY, "Blueberry");
        translationBuilder.add(AtItems.STRAWBERRY, "Strawberry");
        translationBuilder.add(AtItems.LUCKY_APPLE, "Lucky Apple");
        translationBuilder.add(AtItems.STRAWBERRY_SEEDS, "Strawberry Seeds");
        
        translationBuilder.add(AtBlocks.SILVER_ORE, "Silver Ore");
        translationBuilder.add(AtBlocks.SILVER_BLOCK, "Silver Block");
        translationBuilder.add(AtBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");
        translationBuilder.add(AtBlocks.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(AtBlocks.MYTHRIL_BLOCK, "Mythril Block");
        translationBuilder.add(AtBlocks.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        translationBuilder.add(AtBlocks.CELESTITE_ORE, "Celestite Ore");
        translationBuilder.add(AtBlocks.CELESTITE_BLOCK, "Celestite Block");
        translationBuilder.add(AtBlocks.CELESTE_LOG, "Celeste Log");
        translationBuilder.add(AtBlocks.CELESTE_WOOD, "Celeste Wood");
        translationBuilder.add(AtBlocks.CELESTE_PLANKS, "Celeste Planks");
        
        translationBuilder.add(AtBlocks.MYTHRIL_SLAB, "Mythril Slab");
        translationBuilder.add(AtBlocks.MYTHRIL_STAIRS, "Mythril Stairs");
        translationBuilder.add(AtBlocks.MYTHRIL_FENCE, "Mythril Fence");
        translationBuilder.add(AtBlocks.MYTHRIL_FENCE_GATE, "Mythril Fence Gate");
        translationBuilder.add(AtBlocks.MYTHRIL_WALL, "Mythril Wall");
        translationBuilder.add(AtBlocks.MYTHRIL_BUTTON, "Mythril Button");
        translationBuilder.add(AtBlocks.MYTHRIL_PRESSURE_PLATE, "Mythril Pressure Plate");
        translationBuilder.add(AtBlocks.MYTHRIL_DOOR, "Mythril Door");
        translationBuilder.add(AtBlocks.MYTHRIL_TRAPDOOR, "Mythril Trapdoor");
        translationBuilder.add(AtBlocks.CELESTE_WOOD_DOOR, "Celeste Wood Door");
        
        translationBuilder.add(AtBlocks.OBSIDIAN_CHEST, "Obsidian Chest");
    }
}
