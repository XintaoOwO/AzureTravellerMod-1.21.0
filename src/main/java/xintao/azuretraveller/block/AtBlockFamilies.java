package xintao.azuretraveller.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class AtBlockFamilies 
{
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();
    
    public static final BlockFamily MYTHRIL = register(AtBlocks.MYTHRIL_BLOCK)
            .slab(AtBlocks.MYTHRIL_SLAB)
            .stairs(AtBlocks.MYTHRIL_STAIRS)
            .fence(AtBlocks.MYTHRIL_FENCE)
            .fenceGate(AtBlocks.MYTHRIL_FENCE_GATE)
            .wall(AtBlocks.MYTHRIL_WALL)
            .button(AtBlocks.MYTHRIL_BUTTON)
            .pressurePlate(AtBlocks.MYTHRIL_PRESSURE_PLATE)
            .door(AtBlocks.MYTHRIL_DOOR)
            .trapdoor(AtBlocks.MYTHRIL_TRAPDOOR)
            .unlockCriterionName("has_mythril_block")
            .build();
    
    public static final BlockFamily CELESTE_PLANKS = register(AtBlocks.CELESTE_PLANKS)
            //.slab()
            //.stairs()
            //.fence()
            //.fenceGate()
            //.wall()
            //.button()
            //.pressurePlate()
            .door(AtBlocks.CELESTE_WOOD_DOOR)
            //.trapdoor()
            .unlockCriterionName("has_celeste_planks")
            .build();

    public static BlockFamily.Builder register(Block baseBlock) 
    {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) 
        {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } 
        else 
        {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies() 
    {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
