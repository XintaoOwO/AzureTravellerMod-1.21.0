package xintao.azuretraveller.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class AtBlockFamily
{
    private static final Map<Block, BlockFamily> BASE_BLOCK_TO_FAMILY = Maps.newHashMap();
    
    public static final BlockFamily MYTHRIL = register(AtBlock.MYTHRIL_BLOCK)
            .slab(AtBlock.MYTHRIL_SLAB)
            .stairs(AtBlock.MYTHRIL_STAIRS)
            .fence(AtBlock.MYTHRIL_FENCE)
            .fenceGate(AtBlock.MYTHRIL_FENCE_GATE)
            .wall(AtBlock.MYTHRIL_WALL)
            .button(AtBlock.MYTHRIL_BUTTON)
            .pressurePlate(AtBlock.MYTHRIL_PRESSURE_PLATE)
            .door(AtBlock.MYTHRIL_DOOR)
            .trapdoor(AtBlock.MYTHRIL_TRAPDOOR)
            .unlockCriterionName("has_mythril_block")
            .build();
    
    public static final BlockFamily CELESTE_PLANKS = register(AtBlock.CELESTE_PLANKS)
            //.slab()
            //.stairs()
            //.fence()
            //.fenceGate()
            //.wall()
            //.button()
            //.pressurePlate()
            .door(AtBlock.CELESTE_WOOD_DOOR)
            //.trapdoor()
            .unlockCriterionName("has_celeste_planks")
            .build();

    private static BlockFamily.Builder register(Block baseBlock) 
    {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = BASE_BLOCK_TO_FAMILY.put(baseBlock, builder.build());
        if (blockFamily != null) 
        {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } 
        else 
        {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamily() 
    {
        return BASE_BLOCK_TO_FAMILY.values().stream();
    }
}
