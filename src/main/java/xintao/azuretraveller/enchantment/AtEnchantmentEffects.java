package xintao.azuretraveller.enchantment;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.enchantment.effect.ContinuousShootingEffect;
import xintao.azuretraveller.enchantment.effect.SoulBindEffect;

public class AtEnchantmentEffects
{
    public static final MapCodec<? extends EnchantmentEntityEffect> CONTINUOUS_SHOOTING = register("continuous_shooting", ContinuousShootingEffect.MAP_CODEC);
    public static final MapCodec<? extends EnchantmentEntityEffect> SOUL_BIND = register("soul_bind", SoulBindEffect.MAP_CODEC);
    
    private static MapCodec<? extends EnchantmentEntityEffect> register(String name, MapCodec<? extends EnchantmentEntityEffect> mapCodec)
    {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(AzureTraveller.MOD_ID, name), mapCodec);
    }
    
    public static void registerModEnchantmentEffect()
    {
        
    }
}
