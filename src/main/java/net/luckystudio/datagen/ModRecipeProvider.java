package net.luckystudio.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.luckystudio.common.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

// Criterion is the necessary function needed to unlock the recipe.

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerPlankedWallRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                output, 3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerTimberplateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        output, 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerBeamRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        output, 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerLatticeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        output, 12)
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerFrameRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible input2) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        output, 6)
                .pattern("@#@")
                .pattern("# #")
                .pattern("@#@")
                .input('@', input)
                .input('#', input2)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerStairRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        output, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Planked Walls
        offerPlankedWallRecipe(exporter, ModBlocks.OAK_PLANKED_WALL, Blocks.OAK_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.SPRUCE_PLANKED_WALL, Blocks.SPRUCE_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.BIRCH_PLANKED_WALL, Blocks.BIRCH_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.JUNGLE_PLANKED_WALL, Blocks.JUNGLE_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.ACACIA_PLANKED_WALL, Blocks.ACACIA_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.DARK_OAK_PLANKED_WALL, Blocks.DARK_OAK_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.MANGROVE_PLANKED_WALL, Blocks.MANGROVE_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.BAMBOO_PLANKED_WALL, Blocks.BAMBOO_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.CRIMSON_PLANKED_WALL, Blocks.CRIMSON_PLANKS);
        offerPlankedWallRecipe(exporter, ModBlocks.WARPED_PLANKED_WALL, Blocks.WARPED_PLANKS);

        // Planked Walls to regular vanilla planks
        offerSingleOutputShapelessRecipe(exporter, Items.OAK_PLANKS, ModBlocks.OAK_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.SPRUCE_PLANKS, ModBlocks.SPRUCE_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.BIRCH_PLANKS, ModBlocks.BIRCH_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.JUNGLE_PLANKS, ModBlocks.JUNGLE_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.ACACIA_PLANKS, ModBlocks.ACACIA_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.MANGROVE_PLANKS, ModBlocks.MANGROVE_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.CHERRY_PLANKS, ModBlocks.CHERRY_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.BAMBOO_PLANKS, ModBlocks.BAMBOO_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.CRIMSON_PLANKS, ModBlocks.CRIMSON_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.WARPED_PLANKS, ModBlocks.WARPED_PLANKED_WALL, RecipeCategory.BUILDING_BLOCKS.getName());

        // Timberplate
        offerTimberplateRecipe(exporter, ModBlocks.OAK_TIMBERPLATE, Blocks.OAK_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.SPRUCE_TIMBERPLATE, Blocks.SPRUCE_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.BIRCH_TIMBERPLATE, Blocks.BIRCH_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.JUNGLE_TIMBERPLATE, Blocks.JUNGLE_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.ACACIA_TIMBERPLATE, Blocks.ACACIA_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.DARK_OAK_TIMBERPLATE, Blocks.DARK_OAK_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.MANGROVE_TIMBERPLATE, Blocks.MANGROVE_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.BAMBOO_TIMBERPLATE, Blocks.BAMBOO_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.CRIMSON_TIMBERPLATE, Blocks.CRIMSON_PLANKS);
        offerTimberplateRecipe(exporter, ModBlocks.WARPED_TIMBERPLATE, Blocks.WARPED_PLANKS);

        // Timberplate to regular vanilla planks
        offerSingleOutputShapelessRecipe(exporter, Items.OAK_PLANKS, ModBlocks.OAK_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.SPRUCE_PLANKS, ModBlocks.SPRUCE_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.BIRCH_PLANKS, ModBlocks.BIRCH_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.JUNGLE_PLANKS, ModBlocks.JUNGLE_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.ACACIA_PLANKS, ModBlocks.ACACIA_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.MANGROVE_PLANKS, ModBlocks.MANGROVE_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.CHERRY_PLANKS, ModBlocks.CHERRY_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.BAMBOO_PLANKS, ModBlocks.BAMBOO_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.CRIMSON_PLANKS, ModBlocks.CRIMSON_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Items.WARPED_PLANKS, ModBlocks.WARPED_TIMBERPLATE, RecipeCategory.BUILDING_BLOCKS.getName());

        // Beams
        offerBeamRecipe(exporter, ModBlocks.OAK_BEAM, Blocks.OAK_LOG);
        offerBeamRecipe(exporter, ModBlocks.SPRUCE_BEAM, Blocks.SPRUCE_LOG);
        offerBeamRecipe(exporter, ModBlocks.BIRCH_BEAM, Blocks.BIRCH_LOG);
        offerBeamRecipe(exporter, ModBlocks.JUNGLE_BEAM, Blocks.JUNGLE_LOG);
        offerBeamRecipe(exporter, ModBlocks.ACACIA_BEAM, Blocks.ACACIA_LOG);
        offerBeamRecipe(exporter, ModBlocks.DARK_OAK_BEAM, Blocks.DARK_OAK_LOG);
        offerBeamRecipe(exporter, ModBlocks.MANGROVE_BEAM, Blocks.MANGROVE_LOG);
        offerBeamRecipe(exporter, ModBlocks.BAMBOO_BEAM, Blocks.BAMBOO_BLOCK);
        offerBeamRecipe(exporter, ModBlocks.CRIMSON_BEAM, Blocks.CRIMSON_STEM);
        offerBeamRecipe(exporter, ModBlocks.WARPED_BEAM, Blocks.WARPED_STEM);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_OAK_BEAM, Blocks.STRIPPED_OAK_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_SPRUCE_BEAM, Blocks.STRIPPED_SPRUCE_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_BIRCH_BEAM, Blocks.STRIPPED_BIRCH_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_JUNGLE_BEAM, Blocks.STRIPPED_JUNGLE_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_ACACIA_BEAM, Blocks.STRIPPED_ACACIA_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_DARK_OAK_BEAM, Blocks.STRIPPED_DARK_OAK_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_MANGROVE_BEAM, Blocks.STRIPPED_MANGROVE_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_CHERRY_BEAM, Blocks.STRIPPED_CHERRY_LOG);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_BAMBOO_BEAM, Blocks.STRIPPED_BAMBOO_BLOCK);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_CRIMSON_BEAM, Blocks.STRIPPED_CRIMSON_STEM);
        offerBeamRecipe(exporter, ModBlocks.STRIPPED_WARPED_BEAM, Blocks.STRIPPED_WARPED_STEM);

        // Beams to regular vanilla planks
        offerShapelessRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.OAK_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.WARPED_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.STRIPPED_OAK_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.STRIPPED_SPRUCE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.STRIPPED_BIRCH_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.STRIPPED_JUNGLE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.STRIPPED_ACACIA_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.STRIPPED_DARK_OAK_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.STRIPPED_MANGROVE_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.STRIPPED_CHERRY_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.STRIPPED_BAMBOO_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.STRIPPED_CRIMSON_BEAM, "beam", 2);
        offerShapelessRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.STRIPPED_WARPED_BEAM, "beam", 2);

        // Lattice Blocks
        offerLatticeRecipe(exporter, ModBlocks.OAK_LUMBER, Blocks.OAK_LOG);
        offerLatticeRecipe(exporter, ModBlocks.SPRUCE_LUMBER, Blocks.SPRUCE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.BIRCH_LUMBER, Blocks.BIRCH_LOG);
        offerLatticeRecipe(exporter, ModBlocks.JUNGLE_LUMBER, Blocks.JUNGLE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.ACACIA_LUMBER, Blocks.ACACIA_LOG);
        offerLatticeRecipe(exporter, ModBlocks.DARK_OAK_LUMBER, Blocks.DARK_OAK_LOG);
        offerLatticeRecipe(exporter, ModBlocks.MANGROVE_LUMBER, Blocks.MANGROVE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.BAMBOO_STALK, Blocks.BAMBOO_BLOCK);
        offerLatticeRecipe(exporter, ModBlocks.CRIMSON_LUMBER, Blocks.CRIMSON_STEM);
        offerLatticeRecipe(exporter, ModBlocks.WARPED_LUMBER, Blocks.WARPED_STEM);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_OAK_LUMBER, Blocks.STRIPPED_OAK_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_SPRUCE_LUMBER, Blocks.STRIPPED_SPRUCE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_BIRCH_LUMBER, Blocks.STRIPPED_BIRCH_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_JUNGLE_LUMBER, Blocks.STRIPPED_JUNGLE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_ACACIA_LUMBER, Blocks.STRIPPED_ACACIA_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_DARK_OAK_LUMBER, Blocks.STRIPPED_DARK_OAK_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_MANGROVE_LUMBER, Blocks.STRIPPED_MANGROVE_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_CHERRY_LUMBER, Blocks.STRIPPED_CHERRY_LOG);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_BAMBOO_STALK, Blocks.STRIPPED_BAMBOO_BLOCK);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_CRIMSON_LUMBER, Blocks.STRIPPED_CRIMSON_STEM);
        offerLatticeRecipe(exporter, ModBlocks.STRIPPED_WARPED_LUMBER, Blocks.STRIPPED_WARPED_STEM);

        // Lumber Blocks to regular vanilla planks
        offerSingleOutputShapelessRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.OAK_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_STALK, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.WARPED_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.STRIPPED_OAK_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.STRIPPED_SPRUCE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.STRIPPED_BIRCH_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.STRIPPED_JUNGLE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.STRIPPED_ACACIA_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.STRIPPED_DARK_OAK_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.STRIPPED_MANGROVE_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.STRIPPED_CHERRY_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.STRIPPED_BAMBOO_STALK, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.STRIPPED_CRIMSON_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());
        offerSingleOutputShapelessRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.STRIPPED_WARPED_LUMBER, RecipeCategory.BUILDING_BLOCKS.getName());

        // Frames
        offerFrameRecipe(exporter, ModBlocks.IRON_FRAME, Items.IRON_INGOT, Items.IRON_NUGGET);
        offerStairRecipe(exporter, ModBlocks.IRON_FRAME_STAIRS, ModBlocks.IRON_FRAME);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_FRAME_SLAB, ModBlocks.IRON_FRAME);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.IRON_FRAME_PANE, ModBlocks.IRON_FRAME);
        offerFrameRecipe(exporter, ModBlocks.GOLD_FRAME, Items.GOLD_INGOT, Items.GOLD_NUGGET);
        offerStairRecipe(exporter, ModBlocks.GOLD_FRAME_STAIRS, ModBlocks.GOLD_FRAME);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_FRAME_SLAB, ModBlocks.GOLD_FRAME);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.GOLD_FRAME_PANE, ModBlocks.GOLD_FRAME);

        offerStairRecipe(exporter, ModBlocks.BOOKSHELF_STAIRS, Blocks.BOOKSHELF);
        offerStairRecipe(exporter, ModBlocks.GLASS_STAIRS, Blocks.GLASS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOOKSHELF_SLAB, Blocks.BOOKSHELF);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_SLAB, Blocks.GLASS);
    }
}
