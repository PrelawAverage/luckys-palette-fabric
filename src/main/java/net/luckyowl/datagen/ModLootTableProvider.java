package net.luckyowl.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.luckyowl.common.block.ModBlocks;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        // PLANKED WALLS
        addDrop(ModBlocks.OAK_PLANKED_WALL);
        addDrop(ModBlocks.SPRUCE_PLANKED_WALL);
        addDrop(ModBlocks.BIRCH_PLANKED_WALL);
        addDrop(ModBlocks.JUNGLE_PLANKED_WALL);
        addDrop(ModBlocks.ACACIA_PLANKED_WALL);
        addDrop(ModBlocks.DARK_OAK_PLANKED_WALL);
        addDrop(ModBlocks.MANGROVE_PLANKED_WALL);
        addDrop(ModBlocks.CHERRY_PLANKED_WALL);
        addDrop(ModBlocks.BAMBOO_PLANKED_WALL);
        addDrop(ModBlocks.CRIMSON_PLANKED_WALL);
        addDrop(ModBlocks.WARPED_PLANKED_WALL);

        // TIMBERPLATE
        addDrop(ModBlocks.OAK_TIMBERPLATE);
        addDrop(ModBlocks.SPRUCE_TIMBERPLATE);
        addDrop(ModBlocks.BIRCH_TIMBERPLATE);
        addDrop(ModBlocks.JUNGLE_TIMBERPLATE);
        addDrop(ModBlocks.ACACIA_TIMBERPLATE);
        addDrop(ModBlocks.DARK_OAK_TIMBERPLATE);
        addDrop(ModBlocks.MANGROVE_TIMBERPLATE);
        addDrop(ModBlocks.CHERRY_TIMBERPLATE);
        addDrop(ModBlocks.BAMBOO_TIMBERPLATE);
        addDrop(ModBlocks.CRIMSON_TIMBERPLATE);
        addDrop(ModBlocks.WARPED_TIMBERPLATE);

        // BOOKSHELF
        addDrop(ModBlocks.BOOKSHELF_STAIRS, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(1.0F)));
        addDrop(ModBlocks.BOOKSHELF_SLAB, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(1.0F)));
        addDropWithSilkTouch(ModBlocks.GLASS_STAIRS);
        addDropWithSilkTouch(ModBlocks.GLASS_SLAB);

        addDrop(ModBlocks.AUTUMN_STAINED_GLASS);
        addDrop(ModBlocks.AUTUMN_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.AUTUMN_STAINED_GLASS_SLAB);
        addDrop(ModBlocks.AUTUMN_STAINED_GLASS_PANE);

        addDrop(ModBlocks.GOLD_FRAME);
        addDrop(ModBlocks.GOLD_FRAME_STAIRS);
        addDrop(ModBlocks.GOLD_FRAME_SLAB);
        addDrop(ModBlocks.GOLD_FRAME_PANE);
        addDrop(ModBlocks.IRON_FRAME);
        addDrop(ModBlocks.IRON_FRAME_STAIRS);
        addDrop(ModBlocks.IRON_FRAME_SLAB);
        addDrop(ModBlocks.IRON_FRAME_PANE);

        // BEAMS
        addDrop(ModBlocks.OAK_BEAM);
        addDrop(ModBlocks.SPRUCE_BEAM);
        addDrop(ModBlocks.BIRCH_BEAM);
        addDrop(ModBlocks.JUNGLE_BEAM);
        addDrop(ModBlocks.ACACIA_BEAM);
        addDrop(ModBlocks.DARK_OAK_BEAM);
        addDrop(ModBlocks.MANGROVE_BEAM);
        addDrop(ModBlocks.CHERRY_BEAM);
        addDrop(ModBlocks.BAMBOO_BEAM);
        addDrop(ModBlocks.CRIMSON_BEAM);
        addDrop(ModBlocks.WARPED_BEAM);
        addDrop(ModBlocks.STRIPPED_OAK_BEAM);
        addDrop(ModBlocks.STRIPPED_SPRUCE_BEAM);
        addDrop(ModBlocks.STRIPPED_BIRCH_BEAM);
        addDrop(ModBlocks.STRIPPED_JUNGLE_BEAM);
        addDrop(ModBlocks.STRIPPED_ACACIA_BEAM);
        addDrop(ModBlocks.STRIPPED_DARK_OAK_BEAM);
        addDrop(ModBlocks.STRIPPED_MANGROVE_BEAM);
        addDrop(ModBlocks.STRIPPED_CHERRY_BEAM);
        addDrop(ModBlocks.STRIPPED_BAMBOO_BEAM);
        addDrop(ModBlocks.STRIPPED_CRIMSON_BEAM);
        addDrop(ModBlocks.STRIPPED_WARPED_BEAM);

        // LATTICE BLOCKS
        addDrop(ModBlocks.OAK_LOG_LATTICE);
        addDrop(ModBlocks.SPRUCE_LOG_LATTICE);
        addDrop(ModBlocks.BIRCH_LOG_LATTICE);
        addDrop(ModBlocks.JUNGLE_LOG_LATTICE);
        addDrop(ModBlocks.ACACIA_LOG_LATTICE);
        addDrop(ModBlocks.DARK_OAK_LOG_LATTICE);
        addDrop(ModBlocks.MANGROVE_LOG_LATTICE);
        addDrop(ModBlocks.CHERRY_LOG_LATTICE);
        addDrop(ModBlocks.BAMBOO_LATTICE);
        addDrop(ModBlocks.CRIMSON_STEM_LATTICE);
        addDrop(ModBlocks.WARPED_STEM_LATTICE);
        addDrop(ModBlocks.STRIPPED_OAK_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_BIRCH_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_ACACIA_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_CHERRY_LOG_LATTICE);
        addDrop(ModBlocks.STRIPPED_BAMBOO_LATTICE);
        addDrop(ModBlocks.STRIPPED_CRIMSON_STEM_LATTICE);
        addDrop(ModBlocks.STRIPPED_WARPED_STEM_LATTICE);
    }
}
