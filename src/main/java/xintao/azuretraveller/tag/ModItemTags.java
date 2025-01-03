package xintao.azuretraveller.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModItemTags 
{
    public static final TagKey<Item> SUGAR_REFINING_TAG = of("sugar_refining_tag");
    public static final TagKey<Item> MINERAL_BASIC_ITEM = of("mineral_basic_item");
    
    private static TagKey<Item> of(String id) 
    {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModItemTag()
    {
        AzureTraveller.LOGGER.info("Registering Item Tags");
    }
}
