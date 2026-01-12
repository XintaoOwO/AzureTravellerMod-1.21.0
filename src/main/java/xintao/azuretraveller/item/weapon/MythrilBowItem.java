package xintao.azuretraveller.item.weapon;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BowItem;
import net.minecraft.registry.entry.RegistryEntry;

public class MythrilBowItem extends BowItem
{
    public static final int TICKS_PER_SECOND = 20;
    public static final int RANGE = 15;

    public MythrilBowItem(Settings settings)
    {
        super(settings);
    }
}
