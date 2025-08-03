package xintao.azuretraveller.entity.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import xintao.azuretraveller.entity.AtBlockEntity;

public class ObsidianChestBlockEntity extends LootableContainerBlockEntity 
{
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(27, ItemStack.EMPTY);
    
    public ObsidianChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) 
    {
        super(blockEntityType, blockPos, blockState);
    }
    
    public ObsidianChestBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        this(AtBlockEntity.OBSIDIAN_CHEST_BLOCK_ENTITY, blockPos, blockState);
    }

    @Override
    protected Text getContainerName() 
    {
        return Text.translatable("container.chest");
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

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) 
    {
        super.readNbt(nbt, registryLookup);
        
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        
        if (!this.readLootTable(nbt))
        {
            Inventories.readNbt(nbt, this.inventory, registryLookup);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) 
    {
        super.writeNbt(nbt, registryLookup);
        
        if (!this.writeLootTable(nbt))
        {
            Inventories.writeNbt(nbt, this.inventory, registryLookup);
        }
    }
}
