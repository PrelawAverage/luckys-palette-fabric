package net.luckyowl.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.luckyowl.common.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER).add(
                ModBlocks.BOOKSHELF_STAIRS,
                ModBlocks.BOOKSHELF_SLAB);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)

                // PLANKED WALLS
                .add(ModBlocks.OAK_PLANKED_WALL)
                .add(ModBlocks.SPRUCE_PLANKED_WALL)
                .add(ModBlocks.BIRCH_PLANKED_WALL)
                .add(ModBlocks.JUNGLE_PLANKED_WALL)
                .add(ModBlocks.ACACIA_PLANKED_WALL)
                .add(ModBlocks.DARK_OAK_PLANKED_WALL)
                .add(ModBlocks.MANGROVE_PLANKED_WALL)
                .add(ModBlocks.CHERRY_PLANKED_WALL)
                .add(ModBlocks.BAMBOO_PLANKED_WALL)
                .add(ModBlocks.CRIMSON_PLANKED_WALL)
                .add(ModBlocks.WARPED_PLANKED_WALL)

                // TIMBERPLATE
                .add(ModBlocks.OAK_TIMBERPLATE)
                .add(ModBlocks.SPRUCE_TIMBERPLATE)
                .add(ModBlocks.BIRCH_TIMBERPLATE)
                .add(ModBlocks.JUNGLE_TIMBERPLATE)
                .add(ModBlocks.ACACIA_TIMBERPLATE)
                .add(ModBlocks.DARK_OAK_TIMBERPLATE)
                .add(ModBlocks.MANGROVE_TIMBERPLATE)
                .add(ModBlocks.CHERRY_TIMBERPLATE)
                .add(ModBlocks.BAMBOO_TIMBERPLATE)
                .add(ModBlocks.CRIMSON_TIMBERPLATE)
                .add(ModBlocks.WARPED_TIMBERPLATE)

                // BEAMS
                .add(ModBlocks.OAK_BEAM)
                .add(ModBlocks.SPRUCE_BEAM)
                .add(ModBlocks.BIRCH_BEAM)
                .add(ModBlocks.JUNGLE_BEAM)
                .add(ModBlocks.ACACIA_BEAM)
                .add(ModBlocks.DARK_OAK_BEAM)
                .add(ModBlocks.MANGROVE_BEAM)
                .add(ModBlocks.CHERRY_BEAM)
                .add(ModBlocks.BAMBOO_BEAM)
                .add(ModBlocks.CRIMSON_BEAM)
                .add(ModBlocks.WARPED_BEAM)
                .add(ModBlocks.STRIPPED_OAK_BEAM)
                .add(ModBlocks.STRIPPED_SPRUCE_BEAM)
                .add(ModBlocks.STRIPPED_BIRCH_BEAM)
                .add(ModBlocks.STRIPPED_JUNGLE_BEAM)
                .add(ModBlocks.STRIPPED_ACACIA_BEAM)
                .add(ModBlocks.STRIPPED_DARK_OAK_BEAM)
                .add(ModBlocks.STRIPPED_MANGROVE_BEAM)
                .add(ModBlocks.STRIPPED_CHERRY_BEAM)
                .add(ModBlocks.STRIPPED_BAMBOO_BEAM)
                .add(ModBlocks.STRIPPED_CRIMSON_BEAM)
                .add(ModBlocks.STRIPPED_WARPED_BEAM)

                // LATTICE BLOCKS
                .add(ModBlocks.OAK_LOG_LATTICE)
                .add(ModBlocks.SPRUCE_LOG_LATTICE)
                .add(ModBlocks.BIRCH_LOG_LATTICE)
                .add(ModBlocks.JUNGLE_LOG_LATTICE)
                .add(ModBlocks.ACACIA_LOG_LATTICE)
                .add(ModBlocks.DARK_OAK_LOG_LATTICE)
                .add(ModBlocks.MANGROVE_LOG_LATTICE)
                .add(ModBlocks.CHERRY_LOG_LATTICE)
                .add(ModBlocks.BAMBOO_LATTICE)
                .add(ModBlocks.CRIMSON_STEM_LATTICE)
                .add(ModBlocks.WARPED_STEM_LATTICE)
                .add(ModBlocks.STRIPPED_OAK_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_BIRCH_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_ACACIA_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_DARK_OAK_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_CHERRY_LOG_LATTICE)
                .add(ModBlocks.STRIPPED_BAMBOO_LATTICE)
                .add(ModBlocks.STRIPPED_CRIMSON_STEM_LATTICE)
                .add(ModBlocks.STRIPPED_WARPED_STEM_LATTICE)

                // BOOKSHELF
                .add(ModBlocks.BOOKSHELF_STAIRS)
                .add(ModBlocks.BOOKSHELF_SLAB)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GOLD_FRAME)
                .add(ModBlocks.GOLD_FRAME_STAIRS)
                .add(ModBlocks.GOLD_FRAME_SLAB)
                .add(ModBlocks.GOLD_FRAME_PANE)
                .add(ModBlocks.IRON_FRAME)
                .add(ModBlocks.IRON_FRAME_STAIRS)
                .add(ModBlocks.IRON_FRAME_SLAB)
                .add(ModBlocks.IRON_FRAME_PANE)
        ;
    }
}
