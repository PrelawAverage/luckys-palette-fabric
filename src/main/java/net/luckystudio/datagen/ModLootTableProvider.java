package net.luckystudio.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.luckystudio.common.block.ModBlocks;
import net.luckystudio.common.block.util.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
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

        // LUMBER BLOCKS
        addLumberDrops(ModBlocks.OAK_LUMBER);
        addLumberDrops(ModBlocks.SPRUCE_LUMBER);
        addLumberDrops(ModBlocks.BIRCH_LUMBER);
        addLumberDrops(ModBlocks.JUNGLE_LUMBER);
        addLumberDrops(ModBlocks.ACACIA_LUMBER);
        addLumberDrops(ModBlocks.DARK_OAK_LUMBER);
        addLumberDrops(ModBlocks.MANGROVE_LUMBER);
        addLumberDrops(ModBlocks.CHERRY_LUMBER);
        addLumberDrops(ModBlocks.BAMBOO_STALK);
        addLumberDrops(ModBlocks.CRIMSON_LUMBER);
        addLumberDrops(ModBlocks.WARPED_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_OAK_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_SPRUCE_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_BIRCH_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_JUNGLE_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_ACACIA_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_DARK_OAK_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_MANGROVE_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_CHERRY_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_BAMBOO_STALK);
        addLumberDrops(ModBlocks.STRIPPED_CRIMSON_LUMBER);
        addLumberDrops(ModBlocks.STRIPPED_WARPED_LUMBER);
    }

    // Copied from candle block
    public LootTable.Builder addLumberDrops(Block lumber) {
        return LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                .with((LootPoolEntry.Builder)
                        this.applyExplosionDecay(lumber, ItemEntry.builder(lumber)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8), (stackable) ->
                                        SetCountLootFunction.builder(ConstantLootNumberProvider.create((float)stackable))
                                                .conditionally(BlockStatePropertyLootCondition.builder(lumber)
                                                .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(ModProperties.STACKABLE, stackable)))))));
    }
}
