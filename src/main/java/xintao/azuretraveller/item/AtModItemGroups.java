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
import xintao.azuretraveller.block.AtModBlocks;

public class AtModItemGroups 
{
    public static final RegistryKey<ItemGroup> AT_Materials = register("at_materials");
    public static final RegistryKey<ItemGroup> AT_Building_Blocks = register("at_building_blocks");
    public static final RegistryKey<ItemGroup> AT_Decorative_Blocks = register("at_decorative_blocks");
    public static final RegistryKey<ItemGroup> AT_Tools_Armors = register("at_tools_armors");
    public static final RegistryKey<ItemGroup> AT_Food = register("at_food");
    
    private static RegistryKey<ItemGroup> register(String id) 
    {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModItemGroup()
    {
        Registry.register(Registries.ITEM_GROUP, AT_Materials, 
                ItemGroup.create(null, -3)
                        .displayName(Text.translatable("itemGroup.at_materials"))
                        .icon(() -> new ItemStack(AtModItems.CELESTITE_INGOT))
                        .entries((displayContext, entries) -> 
                         {
                             entries.add(AtModItems.RAW_SILVER);
                             entries.add(AtModItems.RAW_MYTHRIL);
                             entries.add(AtModItems.RAW_CELESTITE);
                             entries.add(AtModItems.SILVER_INGOT);
                             entries.add(AtModItems.OBSIDIAN_INGOT);
                             entries.add(AtModItems.MYTHRIL_INGOT);
                             entries.add(AtModItems.CELESTITE_INGOT);
                         }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Building_Blocks,
                ItemGroup.create(null, -5)
                        .displayName(Text.translatable("itemGroup.at_building_blocks"))
                        .icon(() -> new ItemStack(AtModBlocks.MYTHRIL_BLOCK))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtModBlocks.CELESTE_LOG);
                            entries.add(AtModBlocks.CELESTE_WOOD);
                            entries.add(AtModBlocks.CELESTE_PLANKS);
                            
                            entries.add(AtModBlocks.SILVER_ORE);
                            entries.add(AtModBlocks.MYTHRIL_ORE);
                            entries.add(AtModBlocks.CELESTITE_ORE);
                            entries.add(AtModBlocks.SILVER_BLOCK);
                            entries.add(AtModBlocks.MYTHRIL_BLOCK);
                            entries.add(AtModBlocks.CELESTITE_BLOCK);
                            entries.add(AtModBlocks.RAW_SILVER_BLOCK);
                            entries.add(AtModBlocks.RAW_MYTHRIL_BLOCK);
                            
                            entries.add(AtModBlocks.MYTHRIL_SLAB);
                            entries.add(AtModBlocks.MYTHRIL_STAIRS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Decorative_Blocks, 
                ItemGroup.create(null, -4)
                        .displayName(Text.translatable("itemGroup.at_decorative_blocks"))
                        .icon(() -> new ItemStack(AtModBlocks.MYTHRIL_FENCE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtModBlocks.CELESTE_WOOD_DOOR);
                            
                            entries.add(AtModBlocks.MYTHRIL_FENCE);
                            entries.add(AtModBlocks.MYTHRIL_FENCE_GATE);
                            entries.add(AtModBlocks.MYTHRIL_WALL);
                            entries.add(AtModBlocks.MYTHRIL_BUTTON);
                            entries.add(AtModBlocks.MYTHRIL_PRESSURE_PLATE);
                            entries.add(AtModBlocks.MYTHRIL_DOOR);
                            entries.add(AtModBlocks.MYTHRIL_TRAPDOOR);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Tools_Armors,
                ItemGroup.create(null, -2)
                        .displayName(Text.translatable("itemGroup.at_tools_armors"))
                        .icon(() -> new ItemStack(AtModItems.MYTHRIL_PICKAXE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtModItems.OBSIDIAN_SWORD);
                            entries.add(AtModItems.OBSIDIAN_PICKAXE);
                            entries.add(AtModItems.OBSIDIAN_AXE);
                            entries.add(AtModItems.OBSIDIAN_SHOVEL);
                            entries.add(AtModItems.OBSIDIAN_HOE);
                            
                            entries.add(AtModItems.MYTHRIL_SWORD);
                            entries.add(AtModItems.MYTHRIL_PICKAXE);
                            entries.add(AtModItems.MYTHRIL_AXE);
                            entries.add(AtModItems.MYTHRIL_SHOVEL);
                            entries.add(AtModItems.MYTHRIL_HOE);
                            
                            entries.add(AtModItems.OBSIDIAN_HELMET);
                            entries.add(AtModItems.OBSIDIAN_CHESTPLATE);
                            entries.add(AtModItems.OBSIDIAN_LEGGINGS);
                            entries.add(AtModItems.OBSIDIAN_BOOTS);
                            
                            entries.add(AtModItems.MYTHRIL_HELMET);
                            entries.add(AtModItems.MYTHRIL_CHESTPLATE);
                            entries.add(AtModItems.MYTHRIL_LEGGINGS);
                            entries.add(AtModItems.MYTHRIL_BOOTS);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Food, 
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.at_food"))
                        .icon(() -> new ItemStack(AtModItems.STRAWBERRY))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(AtModItems.BLUEBERRY);
                            entries.add(AtModItems.STRAWBERRY);
                            entries.add(AtModItems.LUCKY_APPLE);
                        }
                )
                .build()
        );
    
        AzureTraveller.LOGGER.info("Registering Item Groups");
        AzureTraveller.LOGGER.info("正在注册物品分类组");
    }
}
