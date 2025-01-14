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
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.item.AtItems;
import xintao.azuretraveller.tag.AtItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AtRecipeProvider extends FabricRecipeProvider
{
    private static final List<ItemConvertible> MYTHRIL_INGOT = List.of(AtItems.RAW_MYTHRIL);
    
    public AtRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) 
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) 
    {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtItems.MYTHRIL_INGOT, 
                RecipeCategory.BUILDING_BLOCKS, AtBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtItems.RAW_MYTHRIL, 
                RecipeCategory.BUILDING_BLOCKS, AtBlocks.RAW_MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, AtBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtItems.RAW_SILVER,
                RecipeCategory.BUILDING_BLOCKS, AtBlocks.RAW_SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AtItems.CELESTITE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, AtBlocks.CELESTITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.FLINT, 1)
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.GRAVEL))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.GRAVEL))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "gravel_to_flint"));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 1)
                .pattern("##")
                .input('#', AtItemTags.SUGAR_REFINING_TAG)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "beetroot_to_sugar"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.MYTHRIL_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" * ")
                .input('#', AtItems.MYTHRIL_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "mythril_sword"));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.MYTHRIL_PICKAXE, 1)
                .pattern("###")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', AtItems.MYTHRIL_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "mythril_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.MYTHRIL_AXE, 1)
                .pattern("## ")
                .pattern("#* ")
                .pattern(" * ")
                .input('#', AtItems.MYTHRIL_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "mythril_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.MYTHRIL_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', AtItems.MYTHRIL_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "mythril_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.MYTHRIL_HOE, 1)
                .pattern("## ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', AtItems.MYTHRIL_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "mythril_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.OBSIDIAN_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" * ")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.OBSIDIAN_PICKAXE, 1)
                .pattern("###")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.OBSIDIAN_AXE, 1)
                .pattern("## ")
                .pattern("#* ")
                .pattern(" * ")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.OBSIDIAN_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, AtItems.OBSIDIAN_HOE, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" * ")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .input('*', Items.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.OBSIDIAN_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.OBSIDIAN_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.OBSIDIAN_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_leggings"));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AtItems.OBSIDIAN_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', AtItems.OBSIDIAN_INGOT)
                .criterion("has_item", RecipeProvider.conditionsFromItem(AtItems.OBSIDIAN_INGOT))
                .offerTo(exporter, Identifier.of(AzureTraveller.MOD_ID, "obsidian_boots"));
        
        offerSmelting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, AtItems.MYTHRIL_INGOT, 
                0.7f, 200, "mythril_ingot");
        
        offerBlasting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, AtItems.MYTHRIL_INGOT, 
                0.7f, 100, "mythril_ingot");
    }
}
