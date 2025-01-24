package xintao.azuretraveller.entity.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import xintao.azuretraveller.entity.AtBlockEntities;

public class ObsidianChestBlockEntity extends LootableContainerBlockEntity 
{
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(27, ItemStack.EMPTY);
    
    public ObsidianChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) 
    {
        super(blockEntityType, blockPos, blockState);
    }
    
    public ObsidianChestBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        this(AtBlockEntities.OBSIDIAN_CHEST_BLOCK_ENTITY, blockPos, blockState);
    }

    @Override
    protected Text getContainerName() 
    {
        return Text.translatable("container.obsidian_chest");
    }

    @Override
    protected DefaultedList<ItemStack> getHeldStacks() 
    {
        return this.inventory;
    }

    @Override
    protected void setHeldStacks(DefaultedList<ItemStack> inventory) 
    {
        this.inventory = inventory;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) 
    {
        return GenericContainerScreenHandler.createGeneric9x3(syncId, playerInventory, this);
    }

    @Override
    public int size() 
    {
        return 27;
    }
}
