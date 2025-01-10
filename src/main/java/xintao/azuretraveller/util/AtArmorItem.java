package xintao.azuretraveller.util;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import xintao.azuretraveller.item.AtArmorMaterials;

import java.util.Map;

public class AtArmorItem extends ArmorItem 
{
    private static final Map<ArmorMaterial, StatusEffectInstance> MAP = 
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(AtArmorMaterials.MYTHRIL.value(), 
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 10, 
                                    1, false, false, true)).build();
    
    
    public AtArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) 
    {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) 
    {
        if (!world.isClient() && entity instanceof PlayerEntity player && hasFullSuitArmor(player))
        {
            evaluateArmorSet(player);
        }
        
        super.inventoryTick(stack, world, entity, slot, selected);
    }
    
    private void evaluateArmorSet(PlayerEntity player) 
    {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MAP.entrySet())
        {
            ArmorMaterial material = entry.getKey();
            StatusEffectInstance effect = entry.getValue();

            if (hasCorrectArmorSet(player, material)) 
            {
                getArmorEffect(player, effect);
            }
        }
    }

    // 判断装备的装备情况状态
    private boolean hasFullSuitArmor(PlayerEntity player)
    {
        boolean state;

        ItemStack helmet = player.getInventory().getArmorStack(3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);

        state = !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();

        return state;
    }

    // 判断装备的装备情况状态
    private boolean hasCorrectArmorSet(PlayerEntity player, ArmorMaterial material) 
    {
        boolean stateBody, stateHelmet, stateChestplate, stateLeggings, stateBoots;
        
        for (ItemStack stack : player.getInventory().armor) 
        {
            if (!(stack.getItem() instanceof ArmorItem)) 
            {
                return false;
            }
        }
        // 鞘翅装备在胸甲的位置。由于鞘翅没有所谓的“材料”一说，如果不进行遍历检测，会导致游戏出现问题
        
        ArmorItem helmet = (ArmorItem) player.getInventory().getArmorStack(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();
        
        stateHelmet = helmet.getMaterial().value() == material;
        stateChestplate = chestplate.getMaterial().value() == material;
        stateLeggings = leggings.getMaterial().value() == material;
        stateBoots = boots.getMaterial().value() == material;
        
        stateBody = stateHelmet && stateChestplate && stateLeggings && stateBoots;
        
        return stateBody;
    }

    // 给予玩家装备效果
    private void getArmorEffect(PlayerEntity player, StatusEffectInstance effect) 
    {
        boolean hasEffect = player.hasStatusEffect(effect.getEffectType());
        
        if (!hasEffect)
        {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }
}
