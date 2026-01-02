package xintao.azuretraveller.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.item.armor.AtArmorItem;
import xintao.azuretraveller.item.tool.PickaxeAxeItem;

public class AtItem // 物品
{
    // 各种矿物锭
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));
    public static final Item RAW_CELESTITE = registerItem("raw_celestite", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item CELESTITE_INGOT = registerItem("celestite_ingot", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new Item.Settings()));

    // 食物
    public static final Item LUCKY_APPLE = registerItem("lucky_apple", new Item(new Item.Settings()
            .food(AtFoodComponent.LUCKY_APPLE)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings()
            .food(AtFoodComponent.STRAWBERRY)));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings()
            .food(AtFoodComponent.BLUEBERRY)));

    // 装备
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new SwordItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    3, -2.4f))));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new PickaxeItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    1.0f, -2.8f))));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe", new AxeItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    5.0f, -3.0f))));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel", new ShovelItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    1.5f, -3.0f))));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe", new HoeItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    -3.0f, 0.0f))));
    
    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet", new ArmorItem(AtArmorMaterial.MYTHRIL,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate", new AtArmorItem(AtArmorMaterial.MYTHRIL,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings", new ArmorItem(AtArmorMaterial.MYTHRIL,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots", new ArmorItem(AtArmorMaterial.MYTHRIL,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ArmorItem(AtArmorMaterial.OBSIDIAN,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(AtArmorMaterial.OBSIDIAN,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(AtArmorMaterial.OBSIDIAN,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(AtArmorMaterial.OBSIDIAN,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));
    
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(AtToolMaterial.OBSIDIAN,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AtToolMaterial.OBSIDIAN,
                    3, -2.4f))));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(AtToolMaterial.OBSIDIAN,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AtToolMaterial.OBSIDIAN,
                    1.0f, -2.8f))));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(AtToolMaterial.OBSIDIAN,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AtToolMaterial.OBSIDIAN,
                    5.0f, -3.0f))));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(AtToolMaterial.OBSIDIAN,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AtToolMaterial.OBSIDIAN,
                    1.5f, -3.0f))));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(AtToolMaterial.OBSIDIAN,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AtToolMaterial.OBSIDIAN,
                    -3.0f, 0.0f))));
    
    public static final Item MYTHRIL_PICKAXE_AXE = registerItem("mythril_pickaxe_axe", new PickaxeAxeItem(AtToolMaterial.MYTHRIL,
            new Item.Settings().attributeModifiers(PickaxeAxeItem.createAttributeModifiers(AtToolMaterial.MYTHRIL,
                    3.0f, -3.0f))));
    
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds", 
            new AliasedBlockItem(AtBlock.STRAWBERRY_CROP, new Item.Settings()));

    private static Item registerItem(String id, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AzureTraveller.MOD_ID, id), item);
    }

    public static void init()
    {
        
    }
}