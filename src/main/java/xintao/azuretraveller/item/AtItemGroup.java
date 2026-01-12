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
import xintao.azuretraveller.block.AtBlock;

public class AtItemGroup // 物品栏  物品分类
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
                        .icon(() -> new ItemStack(AtItem.CELESTITE_INGOT))
                        .entries((displayContext, entries) -> 
                         {
                             entries.add(AtItem.RAW_SILVER);
                             entries.add(AtItem.RAW_MYTHRIL);
                             entries.add(AtItem.RAW_CELESTITE);
                             entries.add(AtItem.SILVER_INGOT);
                             entries.add(AtItem.OBSIDIAN_INGOT);
                             entries.add(AtItem.MYTHRIL_INGOT);
                             entries.add(AtItem.CELESTITE_INGOT);
                         }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Building_Blocks,
                ItemGroup.create(null, -5)
                        .displayName(Text.translatable("itemGroup.at_building_blocks"))
                        .icon(() -> new ItemStack(AtBlock.MYTHRIL_BLOCK))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtBlock.PEAR_LOG);
                            entries.add(AtBlock.PEACH_LOG);
                            entries.add(AtBlock.CELESTE_LOG);
                            entries.add(AtBlock.PEAR_WOOD);
                            entries.add(AtBlock.PEACH_WOOD);
                            entries.add(AtBlock.CELESTE_WOOD);
                            entries.add(AtBlock.CELESTE_PLANKS);
                            entries.add(AtBlock.STRIPPED_PEAR_LOG);
                            entries.add(AtBlock.STRIPPED_PEACH_LOG);
                            entries.add(AtBlock.STRIPPED_CELESTE_LOG);
                            entries.add(AtBlock.STRIPPED_PEAR_WOOD);
                            entries.add(AtBlock.STRIPPED_PEACH_WOOD);
                            entries.add(AtBlock.STRIPPED_CELESTE_WOOD);
                            
                            entries.add(AtBlock.SILVER_ORE);
                            entries.add(AtBlock.MYTHRIL_ORE);
                            entries.add(AtBlock.CELESTITE_ORE);
                            entries.add(AtBlock.SILVER_BLOCK);
                            entries.add(AtBlock.MYTHRIL_BLOCK);
                            entries.add(AtBlock.CELESTITE_BLOCK);
                            entries.add(AtBlock.RAW_SILVER_BLOCK);
                            entries.add(AtBlock.RAW_MYTHRIL_BLOCK);
                            
                            entries.add(AtBlock.MYTHRIL_SLAB);
                            entries.add(AtBlock.MYTHRIL_STAIRS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Decorative_Blocks, 
                ItemGroup.create(null, -4)
                        .displayName(Text.translatable("itemGroup.at_decorative_blocks"))
                        .icon(() -> new ItemStack(AtBlock.MYTHRIL_FENCE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtBlock.PEAR_SAPLING);
                            entries.add(AtBlock.PEACH_SAPLING);
                            entries.add(AtBlock.CELESTE_SAPLING);
                            entries.add(AtBlock.PEAR_LEAVES);
                            entries.add(AtBlock.PEACH_LEAVES);
                            entries.add(AtBlock.CELESTE_LEAVES);
                            
                            entries.add(AtBlock.CELESTE_WOOD_DOOR);
                            
                            entries.add(AtBlock.MYTHRIL_FENCE);
                            entries.add(AtBlock.MYTHRIL_FENCE_GATE);
                            entries.add(AtBlock.MYTHRIL_WALL);
                            entries.add(AtBlock.MYTHRIL_BUTTON);
                            entries.add(AtBlock.MYTHRIL_PRESSURE_PLATE);
                            entries.add(AtBlock.MYTHRIL_DOOR);
                            entries.add(AtBlock.MYTHRIL_TRAPDOOR);
                            
                            entries.add(AtBlock.OBSIDIAN_CHEST);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Tools_Armors,
                ItemGroup.create(null, -2)
                        .displayName(Text.translatable("itemGroup.at_tools_armors"))
                        .icon(() -> new ItemStack(AtItem.MYTHRIL_PICKAXE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtItem.OBSIDIAN_SWORD);
                            entries.add(AtItem.OBSIDIAN_PICKAXE);
                            entries.add(AtItem.OBSIDIAN_AXE);
                            entries.add(AtItem.OBSIDIAN_SHOVEL);
                            entries.add(AtItem.OBSIDIAN_HOE);
                            
                            entries.add(AtItem.MYTHRIL_SWORD);
                            entries.add(AtItem.MYTHRIL_PICKAXE);
                            entries.add(AtItem.MYTHRIL_AXE);
                            entries.add(AtItem.MYTHRIL_SHOVEL);
                            entries.add(AtItem.MYTHRIL_HOE);
                            entries.add(AtItem.MYTHRIL_PICKAXE_AXE);
                            entries.add(AtItem.MYTHRIL_BOW);
                            
                            entries.add(AtItem.OBSIDIAN_HELMET);
                            entries.add(AtItem.OBSIDIAN_CHESTPLATE);
                            entries.add(AtItem.OBSIDIAN_LEGGINGS);
                            entries.add(AtItem.OBSIDIAN_BOOTS);
                            
                            entries.add(AtItem.MYTHRIL_HELMET);
                            entries.add(AtItem.MYTHRIL_CHESTPLATE);
                            entries.add(AtItem.MYTHRIL_LEGGINGS);
                            entries.add(AtItem.MYTHRIL_BOOTS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Food_Crops, 
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.at_food_crops"))
                        .icon(() -> new ItemStack(AtItem.STRAWBERRY))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtItem.BLUEBERRY);
                            entries.add(AtItem.STRAWBERRY);
                            entries.add(AtItem.LUCKY_APPLE);
                            
                            entries.add(AtItem.STRAWBERRY_SEEDS);
                        }
                )
                .build()
        );
    }
}
