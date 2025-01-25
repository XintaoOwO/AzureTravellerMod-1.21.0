package xintao.azuretraveller.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.crop.StrawberryCropBlock;
import xintao.azuretraveller.block.fn.ObsidianChestBlock;
import xintao.azuretraveller.entity.AtBlockEntities;

public class AtBlocks 
{
    public static final Block MYTHRIL_BLOCK = register("mythril_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block CELESTITE_BLOCK = register("celestite_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block SILVER_BLOCK = register("silver_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block MYTHRIL_ORE = register("mythril_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block CELESTITE_ORE = register("celestite_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block SILVER_ORE = register("silver_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block RAW_MYTHRIL_BLOCK = register("raw_mythril_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block RAW_SILVER_BLOCK = register("raw_silver_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    
    public static final Block CELESTE_LOG = register("celeste_log", createLogBlock());
    public static final Block CELESTE_WOOD = register("celeste_wood", 
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    
    public static final Block CELESTE_PLANKS = register("celeste_planks", 
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block STRIPPED_CELESTE_LOG = register("stripped_celeste_log",
            createLogBlock());
    public static final Block STRIPPED_CELESTE_WOOD = register("stripped_celeste_wood", 
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    
    public static final Block CELESTE_LEAVES = register("celeste_leaves", 
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    
    public static final Block MYTHRIL_SLAB = register("mythril_slab", 
            new SlabBlock(AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_FENCE = register("mythril_fence",
            new FenceBlock(AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_FENCE_GATE = register("mythril_fence_gate", 
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_WALL = register("mythril_wall",
            new WallBlock(AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_STAIRS = register("mythril_stairs", 
            new StairsBlock(MYTHRIL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_BUTTON = register("mythril_button", 
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_PRESSURE_PLATE = register("mythril_pressure_plate", 
            new PressurePlateBlock(BlockSetType.GOLD, AbstractBlock.Settings.copy(MYTHRIL_BLOCK)));
    public static final Block MYTHRIL_DOOR = register("mythril_door", 
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(MYTHRIL_BLOCK).nonOpaque()));
    public static final Block MYTHRIL_TRAPDOOR = register("mythril_trapdoor", 
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(MYTHRIL_BLOCK).nonOpaque()));
    public static final Block CELESTE_WOOD_DOOR = register("celeste_wood_door", 
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(CELESTE_PLANKS).nonOpaque().burnable()));
    
    public static final Block OBSIDIAN_CHEST = register("obsidian_chest", 
            new ObsidianChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST)
                    .nonOpaque().requiresTool().strength(50.0f, 1200.0f),
                    () -> AtBlockEntities.OBSIDIAN_CHEST_BLOCK_ENTITY));
    
    public static final Block STRAWBERRY_CROP = Registry.register(Registries.BLOCK, 
            Identifier.of(AzureTraveller.MOD_ID, "strawberry_crop"), 
            new StrawberryCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    
    
    public static void registerBlockItem(String id, Block block)
    {
        BlockItem item = Registry.register(Registries.ITEM, Identifier.of(AzureTraveller.MOD_ID, id), 
                new BlockItem(block, new Item.Settings()));
        
        if (item instanceof BlockItem) 
        {
            item.appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    
    public static Block register(String id, Block block) 
    {
        registerBlockItem(id, block);
        
        return Registry.register(Registries.BLOCK, Identifier.of(AzureTraveller.MOD_ID, id), block);
    }

    public static Block createLogBlock() 
    {
        return new PillarBlock(
                AbstractBlock.Settings.create()
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable()
        );
    }

    public static void registerModBlock()
    {
        
    }
}
