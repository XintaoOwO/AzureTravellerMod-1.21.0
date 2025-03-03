package xintao.azuretraveller.enchantment.effect;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record SoulBindEffect() implements EnchantmentEntityEffect
{
    public static final MapCodec<SoulBindEffect> MAP_CODEC =
            MapCodec.unit(SoulBindEffect::new);
    
    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos)
    {
        
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec()
    {
        return MAP_CODEC;
    }
}
