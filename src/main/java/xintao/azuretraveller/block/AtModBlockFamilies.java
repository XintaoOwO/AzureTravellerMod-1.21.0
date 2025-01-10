package xintao.azuretraveller.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;
import java.util.Map;
import java.util.stream.Stream;

public class AtModBlockFamilies 
{
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();
    
    public static final BlockFamily MYTHRIL = register(AtModBlocks.MYTHRIL_BLOCK)
            .slab(AtModBlocks.MYTHRIL_SLAB)
            .stairs(AtModBlocks.MYTHRIL_STAIRS)
            .fence(AtModBlocks.MYTHRIL_FENCE)
            .fenceGate(AtModBlocks.MYTHRIL_FENCE_GATE)
            .wall(AtModBlocks.MYTHRIL_WALL)
            .button(AtModBlocks.MYTHRIL_BUTTON)
            .pressurePlate(AtModBlocks.MYTHRIL_PRESSURE_PLATE)
            .door(AtModBlocks.MYTHRIL_DOOR)
            .trapdoor(AtModBlocks.MYTHRIL_TRAPDOOR)
            .unlockCriterionName("has_mythril_block")
            .build();
    
    public static final BlockFamily CELESTE_PLANKS = register(AtModBlocks.CELESTE_PLANKS)
            //.slab()
            //.stairs()
            //.fence()
            //.fenceGate()
            //.wall()
            //.button()
            //.pressurePlate()
            .door(AtModBlocks.CELESTE_WOOD_DOOR)
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
