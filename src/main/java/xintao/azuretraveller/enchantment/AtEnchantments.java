package xintao.azuretraveller.enchantment;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class AtEnchantments
{
    public static final RegistryKey<Enchantment> CONTINUOUS_SHOOTING = of("continuous_shooting");
    public static final RegistryKey<Enchantment> TRACKING = of("tracking");
    
    public static void bootstrap(Registerable<Enchantment> registry)
    {
        RegistryEntryLookup<DamageType> damageTypeRegistryEntryLookup = registry.getRegistryLookup(RegistryKeys.DAMAGE_TYPE);
        RegistryEntryLookup<Enchantment> enchantmentRegistryEntryLookup = registry.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        RegistryEntryLookup<Item> itemRegistryEntryLookup = registry.getRegistryLookup(RegistryKeys.ITEM);
        RegistryEntryLookup<Block> blockRegistryEntryLookup = registry.getRegistryLookup(RegistryKeys.BLOCK);
    }
    
    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) 
    {
        registry.register(key, builder.build(key.getValue()));
    }

    private static RegistryKey<Enchantment> of(String id) 
    {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(AzureTraveller.MOD_ID, id));
    }
}
