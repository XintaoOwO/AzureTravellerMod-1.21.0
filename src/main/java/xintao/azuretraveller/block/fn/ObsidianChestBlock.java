package xintao.azuretraveller.block.fn;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractChestBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoubleBlockProperties;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import xintao.azuretraveller.entity.AtBlockEntity;
import xintao.azuretraveller.entity.block.ObsidianChestBlockEntity;

import java.util.function.Supplier;

public class ObsidianChestBlock extends AbstractChestBlock<ObsidianChestBlockEntity>
{
    public static final MapCodec<ObsidianChestBlock> OBSIDIAN_CHEST_BLOCK_MAP_CODEC = createCodec(settings -> 
            new ObsidianChestBlock(settings, () -> AtBlockEntity.OBSIDIAN_CHEST_BLOCK_ENTITY));
    
    public ObsidianChestBlock(Settings settings, Supplier<BlockEntityType<? extends ObsidianChestBlockEntity>> blockEntityTypeSupplier) 
    {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    protected MapCodec<? extends AbstractChestBlock<ObsidianChestBlockEntity>> getCodec() 
    {
        return OBSIDIAN_CHEST_BLOCK_MAP_CODEC;
    }

    @Override
    public DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> getBlockEntitySource(BlockState state, World world, BlockPos pos, boolean ignoreBlocked) 
    {
        return null;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) 
    {
        return new ObsidianChestBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) 
    {
        return BlockRenderType.MODEL;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) 
    {
        if (!world.isClient())
        {
            NamedScreenHandlerFactory factory = this.createScreenHandlerFactory(state, world, pos);

            if (factory == null) 
            {
                player.openHandledScreen(factory);
                
                return ActionResult.SUCCESS;
            }
        }
        else
        {
            return ActionResult.CONSUME;
        }
        
        return ActionResult.CONSUME;
    }
}
