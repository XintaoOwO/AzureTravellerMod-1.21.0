package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.AtItem;

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
        
        translationBuilder.add(AtItem.SILVER_INGOT, "银锭");
        translationBuilder.add(AtItem.MYTHRIL_INGOT, "秘银锭");
        translationBuilder.add(AtItem.CELESTITE_INGOT, "天蓝矿锭");
        translationBuilder.add(AtItem.RAW_SILVER, "粗银");
        translationBuilder.add(AtItem.RAW_MYTHRIL, "粗秘银");
        translationBuilder.add(AtItem.RAW_CELESTITE, "天蓝石");
        
        translationBuilder.add(AtItem.MYTHRIL_SWORD, "秘银剑");
        translationBuilder.add(AtItem.MYTHRIL_PICKAXE, "秘银镐");
        translationBuilder.add(AtItem.MYTHRIL_AXE, "秘银斧");
        translationBuilder.add(AtItem.MYTHRIL_SHOVEL, "秘银锹");
        translationBuilder.add(AtItem.MYTHRIL_HOE, "秘银锄");
        translationBuilder.add(AtItem.MYTHRIL_PICKAXE_AXE, "秘银镐斧");
        translationBuilder.add(AtItem.MYTHRIL_HELMET, "秘银头盔");
        translationBuilder.add(AtItem.MYTHRIL_CHESTPLATE, "秘银胸甲");
        translationBuilder.add(AtItem.MYTHRIL_LEGGINGS, "秘银护腿");
        translationBuilder.add(AtItem.MYTHRIL_BOOTS, "秘银靴子");
        translationBuilder.add(AtItem.OBSIDIAN_INGOT, "黑曜石锭");
        translationBuilder.add(AtItem.OBSIDIAN_SWORD, "黑曜石剑");
        translationBuilder.add(AtItem.OBSIDIAN_PICKAXE, "黑曜石镐");
        translationBuilder.add(AtItem.OBSIDIAN_AXE, "黑曜石斧");
        translationBuilder.add(AtItem.OBSIDIAN_SHOVEL, "黑曜石锹");
        translationBuilder.add(AtItem.OBSIDIAN_HOE, "黑曜石锄");
        translationBuilder.add(AtItem.OBSIDIAN_HELMET, "黑曜石头盔");
        translationBuilder.add(AtItem.OBSIDIAN_CHESTPLATE, "黑曜石胸甲");
        translationBuilder.add(AtItem.OBSIDIAN_LEGGINGS, "黑曜石护腿");
        translationBuilder.add(AtItem.OBSIDIAN_BOOTS, "黑曜石靴子");
        
        translationBuilder.add(AtItem.BLUEBERRY, "蓝莓");
        translationBuilder.add(AtItem.STRAWBERRY, "草莓");
        translationBuilder.add(AtItem.LUCKY_APPLE, "幸运果");
        translationBuilder.add(AtItem.STRAWBERRY_SEEDS, "草莓种子");

        translationBuilder.add(AtBlock.SILVER_ORE, "银矿石");
        translationBuilder.add(AtBlock.SILVER_BLOCK, "银块");
        translationBuilder.add(AtBlock.RAW_SILVER_BLOCK, "粗银块");
        translationBuilder.add(AtBlock.MYTHRIL_ORE, "秘银矿石");
        translationBuilder.add(AtBlock.MYTHRIL_BLOCK, "秘银块");
        translationBuilder.add(AtBlock.RAW_MYTHRIL_BLOCK, "粗秘银块");
        translationBuilder.add(AtBlock.CELESTITE_ORE, "天蓝矿石");
        translationBuilder.add(AtBlock.CELESTITE_BLOCK, "天蓝矿锭块");
        translationBuilder.add(AtBlock.CELESTE_LOG, "天蓝木原木");
        translationBuilder.add(AtBlock.CELESTE_WOOD, "天蓝木");
        translationBuilder.add(AtBlock.CELESTE_PLANKS, "天蓝木板");
        translationBuilder.add(AtBlock.CELESTE_LEAVES, "天蓝木树叶");
        translationBuilder.add(AtBlock.CELESTE_SAPLING, "天蓝木树苗");
        translationBuilder.add(AtBlock.STRIPPED_CELESTE_LOG, "去皮天蓝木原木");
        translationBuilder.add(AtBlock.STRIPPED_CELESTE_WOOD, "去皮天蓝木");
        translationBuilder.add(AtBlock.PEAR_LOG, "梨树原木");
        translationBuilder.add(AtBlock.PEAR_WOOD, "梨木");
        translationBuilder.add(AtBlock.PEAR_LEAVES, "梨树树叶");
        translationBuilder.add(AtBlock.PEAR_SAPLING, "梨树树苗");
        translationBuilder.add(AtBlock.STRIPPED_PEAR_LOG, "去皮梨树原木");
        translationBuilder.add(AtBlock.STRIPPED_PEAR_WOOD, "去皮梨木");
        translationBuilder.add(AtBlock.PEACH_LOG, "桃树原木");
        translationBuilder.add(AtBlock.PEACH_WOOD, "桃木");
        translationBuilder.add(AtBlock.PEACH_LEAVES, "桃树树叶");
        translationBuilder.add(AtBlock.PEACH_SAPLING, "桃树树苗");
        translationBuilder.add(AtBlock.STRIPPED_PEACH_LOG, "去皮桃树原木");
        translationBuilder.add(AtBlock.STRIPPED_PEACH_WOOD, "去皮桃木");
        
        translationBuilder.add(AtBlock.MYTHRIL_SLAB, "秘银台阶");
        translationBuilder.add(AtBlock.MYTHRIL_STAIRS, "秘银楼梯");
        translationBuilder.add(AtBlock.MYTHRIL_FENCE, "秘银栅栏");
        translationBuilder.add(AtBlock.MYTHRIL_FENCE_GATE, "秘银栅栏门");
        translationBuilder.add(AtBlock.MYTHRIL_WALL, "秘银墙");
        translationBuilder.add(AtBlock.MYTHRIL_BUTTON, "秘银按钮");
        translationBuilder.add(AtBlock.MYTHRIL_PRESSURE_PLATE, "秘银压力板");
        translationBuilder.add(AtBlock.MYTHRIL_DOOR, "秘银门");
        translationBuilder.add(AtBlock.MYTHRIL_TRAPDOOR, "秘银活板门");
        translationBuilder.add(AtBlock.CELESTE_WOOD_DOOR, "天蓝木门");
        
        translationBuilder.add(AtBlock.OBSIDIAN_CHEST, "黑曜石箱子");
    }
}
