package xintao.azuretraveller.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModBlockTags 
{
    //public static final TagKey<Block> ORE_LIST = of("ore_list");
    //public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = of("needs_obsidian_tool");
    //public static final TagKey<Block> NEEDS_MYTHRIL_TOOL = of("needs_mythril_tool");
    public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = of("incorrect_for_obsidian");
    public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = of("incorrect_for_mythril_tool");
    
    private static TagKey<Block> of(String id) 
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AzureTraveller.MOD_ID, id));
    }
}
