package xintao.azuretraveller.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModItems 
{
    public static final Item RAW_SILVER = registerItems("raw_silver", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItems("raw_mythril", new Item(new Item.Settings()));
    public static final Item RAW_CELESTITE = registerItems("raw_celestite", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItems("mythril_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItems("silver_ingot", new Item(new Item.Settings()));
    public static final Item CELESTITE_INGOT = registerItems("celestite_ingot", new Item(new Item.Settings()));
    public static final Item MYTHRIL_SWORD = registerItems("mythril_sword", new Item(new Item.Settings()));
    public static final Item MYTHRIL_PICKAXE = registerItems("mythril_pickaxe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_AXE = registerItems("mythril_axe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_SHOVEL = registerItems("mythril_shovel", new Item(new Item.Settings()));
    public static final Item MYTHRIL_HOE = registerItems("mythril_hoe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_HELMET = registerItems("mythril_helmet", new Item(new Item.Settings()));
    public static final Item MYTHRIL_CHESTPLATE = registerItems("mythril_chestplate", new Item(new Item.Settings()));
    public static final Item MYTHRIL_LEGGINGS = registerItems("mythril_leggings", new Item(new Item.Settings()));
    public static final Item MYTHRIL_BOOTS = registerItems("mythril_boots", new Item(new Item.Settings()));
    // 以下物品尚未添加.json
    public static final Item OBSIDIAN_INGOT = registerItems("obsidian_ingot", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SWORD = registerItems("obsidian_sword", new Item(new Item.Settings()));
    public static final Item ONSIDIAN_PICKAXE = registerItems("obsidian_pickaxe", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_AXE = registerItems("obsidian_axe", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SHOVEL = registerItems("obsidian_shovel", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_HOE = registerItems("obsidian_hoe", new Item(new Item.Settings()));
    
    public static final Item LUCKY_APPLE = registerItems("lucky_apple", new Item(new Item.Settings()
            .food(ModFoodComponents.LUCKY_APPLE)));
    public static final Item STRAWBERRY = registerItems("strawberry", new Item(new Item.Settings()
            .food(ModFoodComponents.STRAWBERRY)));
    public static final Item BLUEBERRY = registerItems("blueberry", new Item(new Item.Settings()
            .food(ModFoodComponents.BLUEBERRY)));
    
    private static Item registerItems(String id, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AzureTraveller.MOD_ID, id), item);
    }

    public static void registerModItems()
    {
        AzureTraveller.LOGGER.info("Registering Items");
    }
}