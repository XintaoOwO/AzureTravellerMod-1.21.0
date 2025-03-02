package xintao.azuretraveller.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class AtFoodComponents
{
    // 幸运果，提供1分钟幸运效果，alwaysEdible()方法可以让食物在任何时候都可以吃（即饥饿值满的时候也可以吃）
    public static final FoodComponent LUCKY_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200), 1.0f)
            .alwaysEdible().build();
    // 草莓，5秒生命恢复
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1.0f)
            .alwaysEdible().build();
    // 蓝莓，30秒夜视
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600), 1.0f)
            .alwaysEdible().build();
}
