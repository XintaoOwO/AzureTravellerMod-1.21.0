package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItems;

import java.util.concurrent.CompletableFuture;

public class AtModLangEnProvider extends FabricLanguageProvider
{
    public AtModLangEnProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
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
        translationBuilder.add("itemGroup.at_food", "Azure Traveller Food");
        
        translationBuilder.add(AtModItems.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(AtModItems.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(AtModItems.CELESTITE_INGOT, "Celestite Ingot");
        translationBuilder.add(AtModItems.RAW_SILVER, "Raw Silver");
        translationBuilder.add(AtModItems.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(AtModItems.RAW_CELESTITE, "Raw Celestite");
        
        translationBuilder.add(AtModItems.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(AtModItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(AtModItems.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(AtModItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(AtModItems.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(AtModItems.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(AtModItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(AtModItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(AtModItems.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(AtModItems.OBSIDIAN_INGOT, "Obsidian Ingot");
        translationBuilder.add(AtModItems.OBSIDIAN_SWORD, "Obsidian Sword");
        translationBuilder.add(AtModItems.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        translationBuilder.add(AtModItems.OBSIDIAN_AXE, "Obsidian Axe");
        translationBuilder.add(AtModItems.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        translationBuilder.add(AtModItems.OBSIDIAN_HOE, "Obsidian Hoe");
        translationBuilder.add(AtModItems.OBSIDIAN_HELMET, "Obsidian Helmet");
        translationBuilder.add(AtModItems.OBSIDIAN_CHESTPLATE, "Obsidian Chestplate");
        translationBuilder.add(AtModItems.OBSIDIAN_LEGGINGS, "Obsidian Leggings");
        translationBuilder.add(AtModItems.OBSIDIAN_BOOTS, "Obsidian Boots");
        
        translationBuilder.add(AtModItems.BLUEBERRY, "Blueberry");
        translationBuilder.add(AtModItems.STRAWBERRY, "Strawberry");
        translationBuilder.add(AtModItems.LUCKY_APPLE, "Lucky Apple");
        
        translationBuilder.add(AtModBlocks.SILVER_ORE, "Silver Ore");
        translationBuilder.add(AtModBlocks.SILVER_BLOCK, "Silver Block");
        translationBuilder.add(AtModBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");
        translationBuilder.add(AtModBlocks.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(AtModBlocks.MYTHRIL_BLOCK, "Mythril Block");
        translationBuilder.add(AtModBlocks.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        translationBuilder.add(AtModBlocks.CELESTITE_ORE, "Celestite Ore");
        translationBuilder.add(AtModBlocks.CELESTITE_BLOCK, "Celestite Block");
        translationBuilder.add(AtModBlocks.CELESTE_LOG, "Celeste Log");
        translationBuilder.add(AtModBlocks.CELESTE_WOOD, "Celeste Wood");
        translationBuilder.add(AtModBlocks.CELESTE_PLANKS, "Celeste Planks");
        
        translationBuilder.add(AtModBlocks.MYTHRIL_SLAB, "Mythril Slab");
        translationBuilder.add(AtModBlocks.MYTHRIL_STAIRS, "Mythril Stairs");
        translationBuilder.add(AtModBlocks.MYTHRIL_FENCE, "Mythril Fence");
        translationBuilder.add(AtModBlocks.MYTHRIL_FENCE_GATE, "Mythril Fence Gate");
        translationBuilder.add(AtModBlocks.MYTHRIL_WALL, "Mythril Wall");
        translationBuilder.add(AtModBlocks.MYTHRIL_BUTTON, "Mythril Button");
        translationBuilder.add(AtModBlocks.MYTHRIL_PRESSURE_PLATE, "Mythril Pressure Plate");
        translationBuilder.add(AtModBlocks.MYTHRIL_DOOR, "Mythril Door");
        translationBuilder.add(AtModBlocks.MYTHRIL_TRAPDOOR, "Mythril Trapdoor");
        translationBuilder.add(AtModBlocks.CELESTE_WOOD_DOOR, "Celeste Wood Door");
    }
}
