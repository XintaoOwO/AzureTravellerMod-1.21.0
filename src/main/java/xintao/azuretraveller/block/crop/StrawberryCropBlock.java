package xintao.azuretraveller.block.crop;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import xintao.azuretraveller.item.AtItems;

public class StrawberryCropBlock extends CropBlock 
{
    private static final int max_age = 3;
    private static final IntProperty AGE = Properties.AGE_3;
    
    public StrawberryCropBlock(Settings settings) 
    {
        super(settings);
    }

    protected IntProperty getAgeProperty()
    {
        return AGE;
    }
    
    @Override
    public int getMaxAge() 
    {
        return max_age;
    }

    @Override
    public int getAge(BlockState state) 
    {
        return state.get(this.getAgeProperty());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) 
    {
        builder.add(AGE);
    }
    
    @Override
    protected ItemConvertible getSeedsItem() 
    {
        return AtItems.STRAWBERRY_SEEDS;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) 
    {
        return floor.isIn(BlockTags.DIRT) || floor.isOf(Blocks.FARMLAND);
    }
}