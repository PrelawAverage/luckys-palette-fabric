package net.luckyowl.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.luckyowl.LuckysPalette;
import net.luckyowl.common.block.ModBlocks;
import net.luckyowl.common.block.util.ModProperties;
import net.luckyowl.common.block.util.enums.VerticalLinearConnectionBlock;
import net.luckyowl.datagen.util.ModModels;
import net.minecraft.block.Block;
import net.minecraft.block.enums.SlabType;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // Even though it states "blockstate", these will generate blockstates, models, and item models.
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerPlankedWall(blockStateModelGenerator, ModBlocks.OAK_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.SPRUCE_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.BIRCH_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.JUNGLE_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.ACACIA_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.DARK_OAK_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.MANGROVE_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.CHERRY_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.BAMBOO_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.CRIMSON_PLANKED_WALL);
        registerPlankedWall(blockStateModelGenerator, ModBlocks.WARPED_PLANKED_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAMBOO_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_TIMBERPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_TIMBERPLATE);

        blockStateModelGenerator.registerGlassPane(ModBlocks.AUTUMN_STAINED_GLASS, ModBlocks.AUTUMN_STAINED_GLASS_PANE);
        registerCustomStair(blockStateModelGenerator, ModBlocks.AUTUMN_STAINED_GLASS_STAIRS,
                LuckysPalette.ofMod("block/autumn_stained_glass"),
                LuckysPalette.ofMod("block/autumn_stained_glass_side"));
        registerCustomSlab(blockStateModelGenerator, ModBlocks.AUTUMN_STAINED_GLASS_SLAB,
                LuckysPalette.ofMod("block/autumn_stained_glass"),
                LuckysPalette.ofMod("block/autumn_stained_glass_side"));

        blockStateModelGenerator.registerGlassPane(ModBlocks.GOLD_FRAME, ModBlocks.GOLD_FRAME_PANE);
        registerCustomStair(blockStateModelGenerator, ModBlocks.GOLD_FRAME_STAIRS,
                LuckysPalette.ofMod("block/gold_frame"),
                LuckysPalette.ofMod("block/gold_frame_side"));
        registerCustomSlab(blockStateModelGenerator, ModBlocks.GOLD_FRAME_SLAB,
                LuckysPalette.ofMod("block/gold_frame"),
                LuckysPalette.ofMod("block/gold_frame_side"));

        blockStateModelGenerator.registerGlassPane(ModBlocks.IRON_FRAME, ModBlocks.IRON_FRAME_PANE);
        registerCustomStair(blockStateModelGenerator, ModBlocks.IRON_FRAME_STAIRS,
                LuckysPalette.ofMod("block/iron_frame"),
                LuckysPalette.ofMod("block/iron_frame_side"));
        registerCustomSlab(blockStateModelGenerator, ModBlocks.IRON_FRAME_SLAB,
                LuckysPalette.ofMod("block/iron_frame"),
                LuckysPalette.ofMod("block/iron_frame_side"));

        registerCustomStair(blockStateModelGenerator, ModBlocks.BOOKSHELF_STAIRS,
                Identifier.ofVanilla("block/oak_planks"),
                Identifier.ofVanilla("block/bookshelf"));
        registerCustomSlab(blockStateModelGenerator, ModBlocks.BOOKSHELF_SLAB,
                Identifier.ofVanilla("block/oak_planks"),
                Identifier.ofVanilla("block/bookshelf"));
        registerCustomStair(blockStateModelGenerator, ModBlocks.GLASS_STAIRS,
                Identifier.ofVanilla("block/glass"),
                Identifier.of(LuckysPalette.MOD_ID, "block/glass_side"));
        registerCustomSlab(blockStateModelGenerator, ModBlocks.GLASS_SLAB,
                Identifier.ofVanilla("block/glass"),
                Identifier.of(LuckysPalette.MOD_ID, "block/glass_side"));

        registerLatticeBlock(blockStateModelGenerator, ModBlocks.OAK_LOG_LATTICE,
                Identifier.ofVanilla("block/oak_log"),
                Identifier.ofVanilla("block/oak_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.SPRUCE_LOG_LATTICE,
                Identifier.ofVanilla("block/spruce_log"),
                Identifier.ofVanilla("block/spruce_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.BIRCH_LOG_LATTICE,
                Identifier.ofVanilla("block/birch_log"),
                Identifier.ofVanilla("block/birch_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.JUNGLE_LOG_LATTICE,
                Identifier.ofVanilla("block/jungle_log"),
                Identifier.ofVanilla("block/jungle_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.ACACIA_LOG_LATTICE,
                Identifier.ofVanilla("block/acacia_log"),
                Identifier.ofVanilla("block/acacia_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_LOG_LATTICE,
                Identifier.ofVanilla("block/dark_oak_log"),
                Identifier.ofVanilla("block/dark_oak_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.MANGROVE_LOG_LATTICE,
                Identifier.ofVanilla("block/mangrove_log"),
                Identifier.ofVanilla("block/mangrove_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.CHERRY_LOG_LATTICE,
                Identifier.ofVanilla("block/cherry_log"),
                Identifier.ofVanilla("block/cherry_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.BAMBOO_LATTICE,
                Identifier.ofVanilla("block/bamboo_block"),
                LuckysPalette.ofMod("block/bamboo_block_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.CRIMSON_STEM_LATTICE,
                Identifier.ofVanilla("block/crimson_stem"),
                Identifier.ofVanilla("block/crimson_stem_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.WARPED_STEM_LATTICE,
                Identifier.ofVanilla("block/warped_stem"),
                Identifier.ofVanilla("block/warped_stem_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_OAK_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_oak_log"),
                Identifier.ofVanilla("block/stripped_oak_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_SPRUCE_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_spruce_log"),
                Identifier.ofVanilla("block/stripped_spruce_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_BIRCH_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_birch_log"),
                Identifier.ofVanilla("block/stripped_birch_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_JUNGLE_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_jungle_log"),
                Identifier.ofVanilla("block/stripped_jungle_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_ACACIA_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_acacia_log"),
                Identifier.ofVanilla("block/stripped_acacia_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_DARK_OAK_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_dark_oak_log"),
                Identifier.ofVanilla("block/stripped_dark_oak_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_MANGROVE_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_mangrove_log"),
                Identifier.ofVanilla("block/stripped_mangrove_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_CHERRY_LOG_LATTICE,
                Identifier.ofVanilla("block/stripped_cherry_log"),
                Identifier.ofVanilla("block/stripped_cherry_log_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_BAMBOO_LATTICE,
                Identifier.ofVanilla("block/stripped_bamboo_block"),
                LuckysPalette.ofMod("block/stripped_bamboo_block_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_CRIMSON_STEM_LATTICE,
                Identifier.ofVanilla("block/stripped_crimson_stem"),
                Identifier.ofVanilla("block/stripped_crimson_stem_top"));
        registerLatticeBlock(blockStateModelGenerator, ModBlocks.STRIPPED_WARPED_STEM_LATTICE,
                Identifier.ofVanilla("block/stripped_warped_stem"),
                Identifier.ofVanilla("block/stripped_warped_stem_top"));
    }

    public final BlockStateModelGenerator.BlockTexturePool registerCustomStair(
            BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture) {
        // Create a texture map dynamically without directly invoking Blocks.BOOKSHELF model states
        TexturedModel texturedModel = TexturedModel.CUBE_BOTTOM_TOP.get(block).textures(textureMap -> {
            // Use the texture path of the vanilla bookshelf, not its block state

            // Set textures dynamically
            textureMap.put(TextureKey.TOP, topTexture);
            textureMap.put(TextureKey.SIDE, sideTexture);
            textureMap.put(TextureKey.BOTTOM, topTexture);
        });
        // Register only the target block (not the base texture block)
        return blockStateModelGenerator.new BlockTexturePool(texturedModel.getTextures()).stairs(block);
    }

    public final void registerCustomSlab(
            BlockStateModelGenerator blockStateModelGenerator, Block newBlock, Identifier topTexture, Identifier sideTexture) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.BOTTOM, topTexture) // Custom bottom texture
                .put(TextureKey.SIDE, sideTexture)   // Custom side texture
                .put(TextureKey.TOP, topTexture); // Custom top texture

        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.SIDE), textureMap.getTexture(TextureKey.TOP));
        Identifier bottomModelId = Models.SLAB.upload(newBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier topModelId = Models.SLAB_TOP.upload(newBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier fullModelId = Models.CUBE_COLUMN.upload(newBlock, "_double", textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(newBlock)
                .coordinate(BlockStateVariantMap.create(Properties.SLAB_TYPE)
                        .register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId))
                        .register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId))
                        .register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullModelId)))
        );
    }

    public final void registerPlankedWall (
            BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TextureMap singleTextureMap = new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.END, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_end"));

        TextureMap headTextureMap = new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_head"))
                .put(TextureKey.END, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_end"));

        TextureMap middleTextureMap = new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_middle"))
                .put(TextureKey.END, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_end"));

        TextureMap tailTextureMap = new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_tail"))
                .put(TextureKey.END, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + Registries.BLOCK.getId(block).getPath() + "_end"));

        Identifier singleModelId = Models.CUBE_COLUMN.upload(block, singleTextureMap, blockStateModelGenerator.modelCollector);
        Identifier headModelId = ModModels.CUBE_COLUMN_HEAD.upload(block, headTextureMap, blockStateModelGenerator.modelCollector);
        Identifier middleModelId = ModModels.CUBE_COLUMN_MIDDLE.upload(block, middleTextureMap, blockStateModelGenerator.modelCollector);
        Identifier tailModelId = ModModels.CUBE_COLUMN_TAIL.upload(block, tailTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.AXIS, ModProperties.VERTICAL_CONNECTION)
                        .register(Direction.Axis.X, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, singleModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Y, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, singleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Z, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, singleModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.X, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, headModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Y, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, headModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Z, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, headModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.X, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, middleModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Y, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, middleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Z, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, middleModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.X, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, tailModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Y, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, tailModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Z, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, tailModelId)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90))
                ));
    }

    public final void registerLatticeBlock(
            BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.SIDE, topTexture)
                .put(TextureKey.TOP, sideTexture)
                .put(TextureKey.PARTICLE, sideTexture);

        Identifier modelId1 = ModModels.LATTICE.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId2 = ModModels.LATTICE_2.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId3 = ModModels.LATTICE_3.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId4 = ModModels.LATTICE_4.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId5 = ModModels.LATTICE_5.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId6 = ModModels.LATTICE_6.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId7 = ModModels.LATTICE_7.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier modelId8 = ModModels.LATTICE_8.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(ModProperties.ROTATED, ModProperties.STACKABLE)
                        .register(false, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId1))
                        .register(false, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId2))
                        .register(false, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId3))
                        .register(false, 4, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId4))
                        .register(false, 5, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId5))
                        .register(false, 6, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId6))
                        .register(false, 7, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId7))
                        .register(false, 8, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId8))
                        .register(true, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId1)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId2)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId3)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 4, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId4)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 5, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId5)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 6, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId6)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 7, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId7)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(true, 8, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, modelId8)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                ));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}