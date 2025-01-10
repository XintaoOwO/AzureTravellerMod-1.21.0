package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItems;
import java.util.concurrent.CompletableFuture;

public class AtModLangZhProvider extends FabricLanguageProvider
{
    public AtModLangZhProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) 
    {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) 
    {
        translationBuilder.add("itemGroup.at_building_blocks", "蔚蓝旅行家 建筑方块");
        translationBuilder.add("itemGroup.at_decorative_blocks", "蔚蓝旅行家 装饰性方块");
        translationBuilder.add("itemGroup.at_materials", "蔚蓝旅行家 材料");
        translationBuilder.add("itemGroup.at_tools_armors", "蔚蓝旅行家 工具装备");
        translationBuilder.add("itemGroup.at_food", "蔚蓝旅行家 食物");
        
        translationBuilder.add(AtModItems.SILVER_INGOT, "银锭");
        translationBuilder.add(AtModItems.MYTHRIL_INGOT, "秘银锭");
        translationBuilder.add(AtModItems.CELESTITE_INGOT, "天蓝矿锭");
        translationBuilder.add(AtModItems.RAW_SILVER, "粗银");
        translationBuilder.add(AtModItems.RAW_MYTHRIL, "粗秘银");
        translationBuilder.add(AtModItems.RAW_CELESTITE, "天蓝石");
        
        translationBuilder.add(AtModItems.MYTHRIL_SWORD, "秘银剑");
        translationBuilder.add(AtModItems.MYTHRIL_PICKAXE, "秘银镐");
        translationBuilder.add(AtModItems.MYTHRIL_AXE, "秘银斧");
        translationBuilder.add(AtModItems.MYTHRIL_SHOVEL, "秘银锹");
        translationBuilder.add(AtModItems.MYTHRIL_HOE, "秘银锄");
        translationBuilder.add(AtModItems.MYTHRIL_HELMET, "秘银头盔");
        translationBuilder.add(AtModItems.MYTHRIL_CHESTPLATE, "秘银胸甲");
        translationBuilder.add(AtModItems.MYTHRIL_LEGGINGS, "秘银护腿");
        translationBuilder.add(AtModItems.MYTHRIL_BOOTS, "秘银靴子");
        translationBuilder.add(AtModItems.OBSIDIAN_INGOT, "黑曜石锭");
        translationBuilder.add(AtModItems.OBSIDIAN_SWORD, "黑曜石剑");
        translationBuilder.add(AtModItems.OBSIDIAN_PICKAXE, "黑曜石镐");
        translationBuilder.add(AtModItems.OBSIDIAN_AXE, "黑曜石斧");
        translationBuilder.add(AtModItems.OBSIDIAN_SHOVEL, "黑曜石锹");
        translationBuilder.add(AtModItems.OBSIDIAN_HOE, "黑曜石锄");
        translationBuilder.add(AtModItems.OBSIDIAN_HELMET, "黑曜石头盔");
        translationBuilder.add(AtModItems.OBSIDIAN_CHESTPLATE, "黑曜石胸甲");
        translationBuilder.add(AtModItems.OBSIDIAN_LEGGINGS, "黑曜石护腿");
        translationBuilder.add(AtModItems.OBSIDIAN_BOOTS, "黑曜石靴子");
        
        translationBuilder.add(AtModItems.BLUEBERRY, "蓝莓");
        translationBuilder.add(AtModItems.STRAWBERRY, "草莓");
        translationBuilder.add(AtModItems.LUCKY_APPLE, "幸运果");

        translationBuilder.add(AtModBlocks.SILVER_ORE, "银矿石");
        translationBuilder.add(AtModBlocks.SILVER_BLOCK, "银块");
        translationBuilder.add(AtModBlocks.RAW_SILVER_BLOCK, "粗银块");
        translationBuilder.add(AtModBlocks.MYTHRIL_ORE, "秘银矿石");
        translationBuilder.add(AtModBlocks.MYTHRIL_BLOCK, "秘银块");
        translationBuilder.add(AtModBlocks.RAW_MYTHRIL_BLOCK, "粗秘银块");
        translationBuilder.add(AtModBlocks.CELESTITE_ORE, "天蓝矿石");
        translationBuilder.add(AtModBlocks.CELESTITE_BLOCK, "天蓝矿锭块");
        translationBuilder.add(AtModBlocks.CELESTE_LOG, "天蓝木原木");
        translationBuilder.add(AtModBlocks.CELESTE_WOOD, "天蓝木");
        translationBuilder.add(AtModBlocks.CELESTE_PLANKS, "天蓝木板");
        
        translationBuilder.add(AtModBlocks.MYTHRIL_SLAB, "秘银台阶");
        translationBuilder.add(AtModBlocks.MYTHRIL_STAIRS, "秘银楼梯");
        translationBuilder.add(AtModBlocks.MYTHRIL_FENCE, "秘银栅栏");
        translationBuilder.add(AtModBlocks.MYTHRIL_FENCE_GATE, "秘银栅栏门");
        translationBuilder.add(AtModBlocks.MYTHRIL_WALL, "秘银墙");
        translationBuilder.add(AtModBlocks.MYTHRIL_BUTTON, "秘银按钮");
        translationBuilder.add(AtModBlocks.MYTHRIL_PRESSURE_PLATE, "秘银压力板");
        translationBuilder.add(AtModBlocks.MYTHRIL_DOOR, "秘银门");
        translationBuilder.add(AtModBlocks.MYTHRIL_TRAPDOOR, "秘银活板门");
        translationBuilder.add(AtModBlocks.CELESTE_WOOD_DOOR, "天蓝木门");
    }
}
