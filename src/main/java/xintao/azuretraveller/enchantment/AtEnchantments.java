package xintao.azuretraveller.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class AtEnchantments 
{
    public static final RegistryKey<Enchantment> CONTINUOUS_SHOOTING = of("continuous_shooting");
    
    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) 
    {
        registry.register(key, builder.build(key.getValue()));
    }

    private static RegistryKey<Enchantment> of(String id) 
    {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(AzureTraveller.MOD_ID, id));
    }
}
