package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItems;
import xintao.azuretraveller.tag.AtModItemTags;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AtModRecipeProvider extends FabricRecipeProvider
{
    private static final List<ItemConvertible> MYTHRIL_INGOT = List.of(AtModItems.RAW_MYTHRIL);
    
    public AtModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) 
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) 
    {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtModItems.MYTHRIL_INGOT, 
                RecipeCategory.BUILDING_BLOCKS, AtModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtModItems.RAW_MYTHRIL, 
                RecipeCategory.BUILDING_BLOCKS, AtModBlocks.RAW_MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, AtModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtModItems.RAW_SILVER,
                RecipeCategory.BUILDING_BLOCKS, AtModBlocks.RAW_SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtModItems.CELESTITE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, AtModBlocks.CELESTITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.FLINT, 1)
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.GRAVEL))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.GRAVEL))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "gravel_to_flint"));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 1)
                .pattern("##")
                .input('#', AtModItemTags.SUGAR_REFINING_TAG)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "beetroot_to_sugar"));
        
        offerSmelting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, AtModItems.MYTHRIL_INGOT, 
                0.7f, 200, "mythril_ingot");
        
        offerBlasting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, AtModItems.MYTHRIL_INGOT, 
                0.7f, 100, "mythril_ingot");
    }
}
