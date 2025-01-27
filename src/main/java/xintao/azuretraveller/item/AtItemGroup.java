package xintao.azuretraveller.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtBlocks;

public class AtItemGroup 
{
    private static final RegistryKey<ItemGroup> AT_Materials = register("at_materials");
    private static final RegistryKey<ItemGroup> AT_Building_Blocks = register("at_building_blocks");
    private static final RegistryKey<ItemGroup> AT_Decorative_Blocks = register("at_decorative_blocks");
    private static final RegistryKey<ItemGroup> AT_Tools_Armors = register("at_tools_armors");
    private static final RegistryKey<ItemGroup> AT_Food_Crops = register("at_food_crops");
    
    private static RegistryKey<ItemGroup> register(String id) 
    {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModItemGroup()
    {
        Registry.register(Registries.ITEM_GROUP, AT_Materials, 
                ItemGroup.create(null, -3)
                        .displayName(Text.translatable("itemGroup.at_materials"))
                        .icon(() -> new ItemStack(AtItems.CELESTITE_INGOT))
                        .entries((displayContext, entries) -> 
                         {
                             entries.add(AtItems.RAW_SILVER);
                             entries.add(AtItems.RAW_MYTHRIL);
                             entries.add(AtItems.RAW_CELESTITE);
                             entries.add(AtItems.SILVER_INGOT);
                             entries.add(AtItems.OBSIDIAN_INGOT);
                             entries.add(AtItems.MYTHRIL_INGOT);
                             entries.add(AtItems.CELESTITE_INGOT);
                         }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Building_Blocks,
                ItemGroup.create(null, -5)
                        .displayName(Text.translatable("itemGroup.at_building_blocks"))
                        .icon(() -> new ItemStack(AtBlocks.MYTHRIL_BLOCK))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtBlocks.PEAR_LOG);
                            entries.add(AtBlocks.PEACH_LOG);
                            entries.add(AtBlocks.CELESTE_LOG);
                            entries.add(AtBlocks.PEAR_WOOD);
                            entries.add(AtBlocks.PEACH_WOOD);
                            entries.add(AtBlocks.CELESTE_WOOD);
                            entries.add(AtBlocks.CELESTE_PLANKS);
                            entries.add(AtBlocks.STRIPPED_CELESTE_LOG);
                            entries.add(AtBlocks.STRIPPED_CELESTE_WOOD);
                            
                            entries.add(AtBlocks.SILVER_ORE);
                            entries.add(AtBlocks.MYTHRIL_ORE);
                            entries.add(AtBlocks.CELESTITE_ORE);
                            entries.add(AtBlocks.SILVER_BLOCK);
                            entries.add(AtBlocks.MYTHRIL_BLOCK);
                            entries.add(AtBlocks.CELESTITE_BLOCK);
                            entries.add(AtBlocks.RAW_SILVER_BLOCK);
                            entries.add(AtBlocks.RAW_MYTHRIL_BLOCK);
                            
                            entries.add(AtBlocks.MYTHRIL_SLAB);
                            entries.add(AtBlocks.MYTHRIL_STAIRS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Decorative_Blocks, 
                ItemGroup.create(null, -4)
                        .displayName(Text.translatable("itemGroup.at_decorative_blocks"))
                        .icon(() -> new ItemStack(AtBlocks.MYTHRIL_FENCE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtBlocks.CELESTE_SAPLING);
                            entries.add(AtBlocks.CELESTE_LEAVES);
                            
                            entries.add(AtBlocks.CELESTE_WOOD_DOOR);
                            
                            entries.add(AtBlocks.MYTHRIL_FENCE);
                            entries.add(AtBlocks.MYTHRIL_FENCE_GATE);
                            entries.add(AtBlocks.MYTHRIL_WALL);
                            entries.add(AtBlocks.MYTHRIL_BUTTON);
                            entries.add(AtBlocks.MYTHRIL_PRESSURE_PLATE);
                            entries.add(AtBlocks.MYTHRIL_DOOR);
                            entries.add(AtBlocks.MYTHRIL_TRAPDOOR);
                            
                            entries.add(AtBlocks.OBSIDIAN_CHEST);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Tools_Armors,
                ItemGroup.create(null, -2)
                        .displayName(Text.translatable("itemGroup.at_tools_armors"))
                        .icon(() -> new ItemStack(AtItems.MYTHRIL_PICKAXE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtItems.OBSIDIAN_SWORD);
                            entries.add(AtItems.OBSIDIAN_PICKAXE);
                            entries.add(AtItems.OBSIDIAN_AXE);
                            entries.add(AtItems.OBSIDIAN_SHOVEL);
                            entries.add(AtItems.OBSIDIAN_HOE);
                            
                            entries.add(AtItems.MYTHRIL_SWORD);
                            entries.add(AtItems.MYTHRIL_PICKAXE);
                            entries.add(AtItems.MYTHRIL_AXE);
                            entries.add(AtItems.MYTHRIL_SHOVEL);
                            entries.add(AtItems.MYTHRIL_HOE);
                            
                            entries.add(AtItems.OBSIDIAN_HELMET);
                            entries.add(AtItems.OBSIDIAN_CHESTPLATE);
                            entries.add(AtItems.OBSIDIAN_LEGGINGS);
                            entries.add(AtItems.OBSIDIAN_BOOTS);
                            
                            entries.add(AtItems.MYTHRIL_HELMET);
                            entries.add(AtItems.MYTHRIL_CHESTPLATE);
                            entries.add(AtItems.MYTHRIL_LEGGINGS);
                            entries.add(AtItems.MYTHRIL_BOOTS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Food_Crops, 
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.at_food_crops"))
                        .icon(() -> new ItemStack(AtItems.STRAWBERRY))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtItems.BLUEBERRY);
                            entries.add(AtItems.STRAWBERRY);
                            entries.add(AtItems.LUCKY_APPLE);
                            
                            entries.add(AtItems.STRAWBERRY_SEEDS);
                        }
                )
                .build()
        );
    }
}
