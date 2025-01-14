package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;

import java.util.concurrent.CompletableFuture;

public class AtLangZhProvider extends FabricLanguageProvider
{
    public AtLangZhProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) 
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
        translationBuilder.add("itemGroup.at_food_crops", "蔚蓝旅行家 食物与农作物");
        
        translationBuilder.add(AtItems.SILVER_INGOT, "银锭");
        translationBuilder.add(AtItems.MYTHRIL_INGOT, "秘银锭");
        translationBuilder.add(AtItems.CELESTITE_INGOT, "天蓝矿锭");
        translationBuilder.add(AtItems.RAW_SILVER, "粗银");
        translationBuilder.add(AtItems.RAW_MYTHRIL, "粗秘银");
        translationBuilder.add(AtItems.RAW_CELESTITE, "天蓝石");
        
        translationBuilder.add(AtItems.MYTHRIL_SWORD, "秘银剑");
        translationBuilder.add(AtItems.MYTHRIL_PICKAXE, "秘银镐");
        translationBuilder.add(AtItems.MYTHRIL_AXE, "秘银斧");
        translationBuilder.add(AtItems.MYTHRIL_SHOVEL, "秘银锹");
        translationBuilder.add(AtItems.MYTHRIL_HOE, "秘银锄");
        translationBuilder.add(AtItems.MYTHRIL_HELMET, "秘银头盔");
        translationBuilder.add(AtItems.MYTHRIL_CHESTPLATE, "秘银胸甲");
        translationBuilder.add(AtItems.MYTHRIL_LEGGINGS, "秘银护腿");
        translationBuilder.add(AtItems.MYTHRIL_BOOTS, "秘银靴子");
        translationBuilder.add(AtItems.OBSIDIAN_INGOT, "黑曜石锭");
        translationBuilder.add(AtItems.OBSIDIAN_SWORD, "黑曜石剑");
        translationBuilder.add(AtItems.OBSIDIAN_PICKAXE, "黑曜石镐");
        translationBuilder.add(AtItems.OBSIDIAN_AXE, "黑曜石斧");
        translationBuilder.add(AtItems.OBSIDIAN_SHOVEL, "黑曜石锹");
        translationBuilder.add(AtItems.OBSIDIAN_HOE, "黑曜石锄");
        translationBuilder.add(AtItems.OBSIDIAN_HELMET, "黑曜石头盔");
        translationBuilder.add(AtItems.OBSIDIAN_CHESTPLATE, "黑曜石胸甲");
        translationBuilder.add(AtItems.OBSIDIAN_LEGGINGS, "黑曜石护腿");
        translationBuilder.add(AtItems.OBSIDIAN_BOOTS, "黑曜石靴子");
        
        translationBuilder.add(AtItems.BLUEBERRY, "蓝莓");
        translationBuilder.add(AtItems.STRAWBERRY, "草莓");
        translationBuilder.add(AtItems.LUCKY_APPLE, "幸运果");
        translationBuilder.add(AtItems.STRAWBERRY_SEEDS, "草莓种子");

        translationBuilder.add(AtBlocks.SILVER_ORE, "银矿石");
        translationBuilder.add(AtBlocks.SILVER_BLOCK, "银块");
        translationBuilder.add(AtBlocks.RAW_SILVER_BLOCK, "粗银块");
        translationBuilder.add(AtBlocks.MYTHRIL_ORE, "秘银矿石");
        translationBuilder.add(AtBlocks.MYTHRIL_BLOCK, "秘银块");
        translationBuilder.add(AtBlocks.RAW_MYTHRIL_BLOCK, "粗秘银块");
        translationBuilder.add(AtBlocks.CELESTITE_ORE, "天蓝矿石");
        translationBuilder.add(AtBlocks.CELESTITE_BLOCK, "天蓝矿锭块");
        translationBuilder.add(AtBlocks.CELESTE_LOG, "天蓝木原木");
        translationBuilder.add(AtBlocks.CELESTE_WOOD, "天蓝木");
        translationBuilder.add(AtBlocks.CELESTE_PLANKS, "天蓝木板");
        
        translationBuilder.add(AtBlocks.MYTHRIL_SLAB, "秘银台阶");
        translationBuilder.add(AtBlocks.MYTHRIL_STAIRS, "秘银楼梯");
        translationBuilder.add(AtBlocks.MYTHRIL_FENCE, "秘银栅栏");
        translationBuilder.add(AtBlocks.MYTHRIL_FENCE_GATE, "秘银栅栏门");
        translationBuilder.add(AtBlocks.MYTHRIL_WALL, "秘银墙");
        translationBuilder.add(AtBlocks.MYTHRIL_BUTTON, "秘银按钮");
        translationBuilder.add(AtBlocks.MYTHRIL_PRESSURE_PLATE, "秘银压力板");
        translationBuilder.add(AtBlocks.MYTHRIL_DOOR, "秘银门");
        translationBuilder.add(AtBlocks.MYTHRIL_TRAPDOOR, "秘银活板门");
        translationBuilder.add(AtBlocks.CELESTE_WOOD_DOOR, "天蓝木门");
    }
}
