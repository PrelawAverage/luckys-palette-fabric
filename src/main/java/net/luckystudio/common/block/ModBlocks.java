package net.luckystudio.common.block;

import net.luckystudio.LuckysPalette;
import net.luckystudio.common.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block createStairsBlock(Block base) {
        return new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base));
    }

    private static Block createSlabBlock(Block base) {
        return new SlabBlock(AbstractBlock.Settings.copy(base));
    }

    private static Block createTranslucentBlock(Block base) {
        return new TranslucentBlock(AbstractBlock.Settings.copy(base));
    }

    private static Block createTranslucentStairsBlock(Block base) {
        return new TranslucentStairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base));
    }

    private static Block createTranslucentSlabBlock(Block base) {
        return new TranslucentSlabBlock(AbstractBlock.Settings.copy(base));
    }

    private static Block createPlankedWallBlock(Block block) {
        return new PlankedWallBlock(AbstractBlock.Settings.copy(block));
    }

    private static Block createBeam(Block block) {
        return new BeamBlock(.25f, AbstractBlock.Settings.copy(block));
    }

    private static Block createLumberBlock(Block block) {
        return new LumberBlock(AbstractBlock.Settings.copy(block).nonOpaque());
    }

    public static final Block BOOKSHELF_STAIRS = registerBlock("bookshelf_stairs", createStairsBlock(Blocks.BOOKSHELF));
    public static final Block BOOKSHELF_SLAB = registerBlock("bookshelf_slab", createSlabBlock(Blocks.BOOKSHELF));

    public static final Block GLASS_STAIRS = registerBlock("glass_stairs", createStairsBlock(Blocks.GLASS));
    public static final Block GLASS_SLAB = registerBlock("glass_slab", createSlabBlock(Blocks.GLASS));

    // Add Blocks Here
    public static final Block OAK_PLANKED_WALL = registerBlock("oak_planked_wall", createPlankedWallBlock(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_PLANKED_WALL = registerBlock("spruce_planked_wall", createPlankedWallBlock(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_PLANKED_WALL = registerBlock("birch_planked_wall", createPlankedWallBlock(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_PLANKED_WALL = registerBlock("jungle_planked_wall", createPlankedWallBlock(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_PLANKED_WALL = registerBlock("acacia_planked_wall", createPlankedWallBlock(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_PLANKED_WALL = registerBlock("dark_oak_planked_wall", createPlankedWallBlock(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_PLANKED_WALL = registerBlock("mangrove_planked_wall", createPlankedWallBlock(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_PLANKED_WALL = registerBlock("cherry_planked_wall", createPlankedWallBlock(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_PLANKED_WALL = registerBlock("bamboo_planked_wall", createPlankedWallBlock(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_PLANKED_WALL = registerBlock("crimson_planked_wall", createPlankedWallBlock(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_PLANKED_WALL = registerBlock("warped_planked_wall", createPlankedWallBlock(Blocks.WARPED_PLANKS));

    // Timberplate
    public static final Block OAK_TIMBERPLATE = registerBlock("oak_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_TIMBERPLATE = registerBlock("spruce_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_TIMBERPLATE = registerBlock("birch_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_TIMBERPLATE = registerBlock("jungle_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_TIMBERPLATE = registerBlock("acacia_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_TIMBERPLATE = registerBlock("dark_oak_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_TIMBERPLATE = registerBlock("mangrove_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_TIMBERPLATE = registerBlock("cherry_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_TIMBERPLATE = registerBlock("bamboo_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_TIMBERPLATE = registerBlock("crimson_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_TIMBERPLATE = registerBlock("warped_timberplate", new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Beams
    public static final Block OAK_BEAM = registerBlock("oak_beam", createBeam(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_BEAM = registerBlock("spruce_beam", createBeam(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_BEAM = registerBlock("birch_beam", createBeam(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_BEAM = registerBlock("jungle_beam", createBeam(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_BEAM = registerBlock("acacia_beam", createBeam(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_BEAM = registerBlock("dark_oak_beam", createBeam(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_BEAM = registerBlock("mangrove_beam", createBeam(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_BEAM = registerBlock("cherry_beam", createBeam(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_BEAM = registerBlock("bamboo_beam", createBeam(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_BEAM = registerBlock("crimson_beam", createBeam(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_BEAM = registerBlock("warped_beam", createBeam(Blocks.WARPED_PLANKS));
    public static final Block STRIPPED_OAK_BEAM = registerBlock("stripped_oak_beam", createBeam(Blocks.OAK_PLANKS));
    public static final Block STRIPPED_SPRUCE_BEAM = registerBlock("stripped_spruce_beam", createBeam(Blocks.SPRUCE_PLANKS));
    public static final Block STRIPPED_BIRCH_BEAM = registerBlock("stripped_birch_beam", createBeam(Blocks.BIRCH_PLANKS));
    public static final Block STRIPPED_JUNGLE_BEAM = registerBlock("stripped_jungle_beam", createBeam(Blocks.JUNGLE_PLANKS));
    public static final Block STRIPPED_ACACIA_BEAM = registerBlock("stripped_acacia_beam", createBeam(Blocks.ACACIA_PLANKS));
    public static final Block STRIPPED_DARK_OAK_BEAM = registerBlock("stripped_dark_oak_beam", createBeam(Blocks.DARK_OAK_PLANKS));
    public static final Block STRIPPED_MANGROVE_BEAM = registerBlock("stripped_mangrove_beam", createBeam(Blocks.MANGROVE_PLANKS));
    public static final Block STRIPPED_CHERRY_BEAM = registerBlock("stripped_cherry_beam", createBeam(Blocks.CHERRY_PLANKS));
    public static final Block STRIPPED_BAMBOO_BEAM = registerBlock("stripped_bamboo_beam", createBeam(Blocks.BAMBOO_PLANKS));
    public static final Block STRIPPED_CRIMSON_BEAM = registerBlock("stripped_crimson_beam", createBeam(Blocks.CRIMSON_PLANKS));
    public static final Block STRIPPED_WARPED_BEAM = registerBlock("stripped_warped_beam", createBeam(Blocks.WARPED_PLANKS));

    // Lumber Blocks
    public static final Block OAK_LUMBER = registerBlock("oak_lumber", createLumberBlock(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_LUMBER = registerBlock("spruce_lumber", createLumberBlock(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_LUMBER = registerBlock("birch_lumber", createLumberBlock(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_LUMBER = registerBlock("jungle_lumber", createLumberBlock(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_LUMBER = registerBlock("acacia_lumber", createLumberBlock(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_LUMBER = registerBlock("dark_oak_lumber", createLumberBlock(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_LUMBER = registerBlock("mangrove_lumber", createLumberBlock(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_LUMBER = registerBlock("cherry_lumber", createLumberBlock(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_STALK = registerBlock("bamboo_stalk", createLumberBlock(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_LUMBER = registerBlock("crimson_lumber", createLumberBlock(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_LUMBER = registerBlock("warped_lumber", createLumberBlock(Blocks.WARPED_PLANKS));
    public static final Block STRIPPED_OAK_LUMBER = registerBlock("stripped_oak_lumber", createLumberBlock(Blocks.OAK_PLANKS));
    public static final Block STRIPPED_SPRUCE_LUMBER = registerBlock("stripped_spruce_lumber", createLumberBlock(Blocks.SPRUCE_PLANKS));
    public static final Block STRIPPED_BIRCH_LUMBER = registerBlock("stripped_birch_lumber", createLumberBlock(Blocks.BIRCH_PLANKS));
    public static final Block STRIPPED_JUNGLE_LUMBER = registerBlock("stripped_jungle_lumber", createLumberBlock(Blocks.JUNGLE_PLANKS));
    public static final Block STRIPPED_ACACIA_LUMBER = registerBlock("stripped_acacia_lumber", createLumberBlock(Blocks.ACACIA_PLANKS));
    public static final Block STRIPPED_DARK_OAK_LUMBER = registerBlock("stripped_dark_oak_lumber", createLumberBlock(Blocks.DARK_OAK_PLANKS));
    public static final Block STRIPPED_MANGROVE_LUMBER = registerBlock("stripped_mangrove_lumber", createLumberBlock(Blocks.MANGROVE_PLANKS));
    public static final Block STRIPPED_CHERRY_LUMBER = registerBlock("stripped_cherry_lumber", createLumberBlock(Blocks.CHERRY_PLANKS));
    public static final Block STRIPPED_BAMBOO_STALK = registerBlock("stripped_bamboo_stalk", createLumberBlock(Blocks.BAMBOO_PLANKS));
    public static final Block STRIPPED_CRIMSON_LUMBER = registerBlock("stripped_crimson_lumber", createLumberBlock(Blocks.CRIMSON_PLANKS));
    public static final Block STRIPPED_WARPED_LUMBER = registerBlock("stripped_warped_lumber", createLumberBlock(Blocks.WARPED_PLANKS));

    // Glass
    public static final Block AUTUMN_STAINED_GLASS = registerBlock("autumn_stained_glass", createTranslucentBlock(Blocks.BLACK_STAINED_GLASS));
    public static final Block AUTUMN_STAINED_GLASS_STAIRS = registerBlock("autumn_stained_glass_stairs", createTranslucentStairsBlock(Blocks.BLACK_STAINED_GLASS));
    public static final Block AUTUMN_STAINED_GLASS_SLAB = registerBlock("autumn_stained_glass_slab", createTranslucentSlabBlock(Blocks.BLACK_STAINED_GLASS));
    public static final Block AUTUMN_STAINED_GLASS_PANE = registerBlock("autumn_stained_glass_pane", new PaneBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE)));

    public static final Block GOLD_FRAME = registerBlock("gold_frame", new TransparentBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block GOLD_FRAME_STAIRS = registerBlock("gold_frame_stairs", new TranslucentStairsBlock(GOLD_FRAME.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block GOLD_FRAME_SLAB = registerBlock("gold_frame_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block GOLD_FRAME_PANE = registerBlock("gold_frame_pane", new PaneBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));

    public static final Block IRON_FRAME = registerBlock("iron_frame", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block IRON_FRAME_STAIRS = registerBlock("iron_frame_stairs", new TransparentStairsBlock(IRON_FRAME.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block IRON_FRAME_SLAB = registerBlock("iron_frame_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));
    public static final Block IRON_FRAME_PANE = registerBlock("iron_frame_pane", new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
            .nonOpaque()
            .requiresTool()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)));

    // Register Block Method
    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LuckysPalette.MOD_ID, name), block);
    }

    // Helper Method for Register Block Method (Handles rarity dynamically)
    private static void registerBlockItems(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LuckysPalette.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    // Registering Blocks
    public static void registerModBlocks(){
        LuckysPalette.LOGGER.info("Registering ModBlocks for " + LuckysPalette.MOD_ID);
    }
}