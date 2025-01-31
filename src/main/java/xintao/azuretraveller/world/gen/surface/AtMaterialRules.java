package xintao.azuretraveller.world.gen.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class AtMaterialRules 
{
    private static final MaterialRules.MaterialRule DIRT = materialRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = materialRule(Blocks.GRASS_BLOCK);
    
    private static MaterialRules.MaterialRule materialRule(Block block)
    {
        return MaterialRules.block(block.getDefaultState());
    }
    
    public static MaterialRules.MaterialRule modMaterialRule()
    {
        MaterialRules.MaterialCondition waterLevel = MaterialRules.water(0, 0);
        MaterialRules.MaterialRule grassBlockSurface = MaterialRules.sequence(MaterialRules.condition(waterLevel, GRASS_BLOCK), DIRT);
        
        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassBlockSurface)
        );
    }
}
