package xintao.azuretraveller.enchantment.effect;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record ContinuousShootingEffect() implements EnchantmentEntityEffect
{
    public static final MapCodec<ContinuousShootingEffect> MAP_CODEC = 
            MapCodec.unit(ContinuousShootingEffect::new);
    
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
