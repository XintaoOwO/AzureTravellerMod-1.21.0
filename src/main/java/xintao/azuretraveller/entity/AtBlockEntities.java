package xintao.azuretraveller.entity;

import com.mojang.datafixers.types.Type;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.entity.block.ObsidianChestBlockEntity;

public class AtBlockEntities 
{
    public static final BlockEntityType<ObsidianChestBlockEntity> OBSIDIAN_CHEST_BLOCK_ENTITY = create("obsidian_chest", 
            BlockEntityType.Builder.create(ObsidianChestBlockEntity::new, AtBlocks.OBSIDIAN_CHEST));
    
    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) 
    {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AzureTraveller.MOD_ID, id), builder.build(type));
    }
    
    public static void registerModBlockEntity()
    {
        
    }
}