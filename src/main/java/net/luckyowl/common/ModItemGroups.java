package net.luckyowl.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.luckyowl.LuckysPalette;
import net.luckyowl.common.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COZY_HOME =
            Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LuckysPalette.MOD_ID, "luckys_palette"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.OAK_PLANKED_WALL))
                    .displayName(Text.translatable("itemgroup.luckys_palette.luckys_palette"))
                    .entries((displayContext, entries) -> {

                        // PLANKED WALLS
                        entries.add(ModBlocks.OAK_PLANKED_WALL);
                        entries.add(ModBlocks.SPRUCE_PLANKED_WALL);
                        entries.add(ModBlocks.BIRCH_PLANKED_WALL);
                        entries.add(ModBlocks.JUNGLE_PLANKED_WALL);
                        entries.add(ModBlocks.ACACIA_PLANKED_WALL);
                        entries.add(ModBlocks.DARK_OAK_PLANKED_WALL);
                        entries.add(ModBlocks.MANGROVE_PLANKED_WALL);
                        entries.add(ModBlocks.CHERRY_PLANKED_WALL);
                        entries.add(ModBlocks.BAMBOO_PLANKED_WALL);
                        entries.add(ModBlocks.CRIMSON_PLANKED_WALL);
                        entries.add(ModBlocks.WARPED_PLANKED_WALL);

                        // TIMBERPLATE
                        entries.add(ModBlocks.OAK_TIMBERPLATE);
                        entries.add(ModBlocks.SPRUCE_TIMBERPLATE);
                        entries.add(ModBlocks.BIRCH_TIMBERPLATE);
                        entries.add(ModBlocks.JUNGLE_TIMBERPLATE);
                        entries.add(ModBlocks.ACACIA_TIMBERPLATE);
                        entries.add(ModBlocks.DARK_OAK_TIMBERPLATE);
                        entries.add(ModBlocks.MANGROVE_TIMBERPLATE);
                        entries.add(ModBlocks.CHERRY_TIMBERPLATE);
                        entries.add(ModBlocks.BAMBOO_TIMBERPLATE);
                        entries.add(ModBlocks.CRIMSON_TIMBERPLATE);
                        entries.add(ModBlocks.WARPED_TIMBERPLATE);

                        // BEAMS
                        entries.add(ModBlocks.OAK_BEAM);
                        entries.add(ModBlocks.SPRUCE_BEAM);
                        entries.add(ModBlocks.BIRCH_BEAM);
                        entries.add(ModBlocks.JUNGLE_BEAM);
                        entries.add(ModBlocks.ACACIA_BEAM);
                        entries.add(ModBlocks.DARK_OAK_BEAM);
                        entries.add(ModBlocks.MANGROVE_BEAM);
                        entries.add(ModBlocks.CHERRY_BEAM);
                        entries.add(ModBlocks.BAMBOO_BEAM);
                        entries.add(ModBlocks.CRIMSON_BEAM);
                        entries.add(ModBlocks.WARPED_BEAM);
                        entries.add(ModBlocks.STRIPPED_OAK_BEAM);
                        entries.add(ModBlocks.STRIPPED_SPRUCE_BEAM);
                        entries.add(ModBlocks.STRIPPED_BIRCH_BEAM);
                        entries.add(ModBlocks.STRIPPED_JUNGLE_BEAM);
                        entries.add(ModBlocks.STRIPPED_ACACIA_BEAM);
                        entries.add(ModBlocks.STRIPPED_DARK_OAK_BEAM);
                        entries.add(ModBlocks.STRIPPED_MANGROVE_BEAM);
                        entries.add(ModBlocks.STRIPPED_CHERRY_BEAM);
                        entries.add(ModBlocks.STRIPPED_BAMBOO_BEAM);
                        entries.add(ModBlocks.STRIPPED_CRIMSON_BEAM);
                        entries.add(ModBlocks.STRIPPED_WARPED_BEAM);

                        // LATTICE BLOCKS
                        entries.add(ModBlocks.OAK_LOG_LATTICE);
                        entries.add(ModBlocks.SPRUCE_LOG_LATTICE);
                        entries.add(ModBlocks.BIRCH_LOG_LATTICE);
                        entries.add(ModBlocks.JUNGLE_LOG_LATTICE);
                        entries.add(ModBlocks.ACACIA_LOG_LATTICE);
                        entries.add(ModBlocks.DARK_OAK_LOG_LATTICE);
                        entries.add(ModBlocks.MANGROVE_LOG_LATTICE);
                        entries.add(ModBlocks.CHERRY_LOG_LATTICE);
                        entries.add(ModBlocks.BAMBOO_LATTICE);
                        entries.add(ModBlocks.CRIMSON_STEM_LATTICE);
                        entries.add(ModBlocks.WARPED_STEM_LATTICE);
                        entries.add(ModBlocks.STRIPPED_OAK_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_SPRUCE_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_BIRCH_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_JUNGLE_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_ACACIA_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_DARK_OAK_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_MANGROVE_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_CHERRY_LOG_LATTICE);
                        entries.add(ModBlocks.STRIPPED_BAMBOO_LATTICE);
                        entries.add(ModBlocks.STRIPPED_CRIMSON_STEM_LATTICE);
                        entries.add(ModBlocks.STRIPPED_WARPED_STEM_LATTICE);

                        // GLASS
                        entries.add(ModBlocks.AUTUMN_STAINED_GLASS);
                        entries.add(ModBlocks.AUTUMN_STAINED_GLASS_STAIRS);
                        entries.add(ModBlocks.AUTUMN_STAINED_GLASS_SLAB);
                        entries.add(ModBlocks.AUTUMN_STAINED_GLASS_PANE);
                        // FRAMES
                        entries.add(ModBlocks.GOLD_FRAME);
                        entries.add(ModBlocks.GOLD_FRAME_STAIRS);
                        entries.add(ModBlocks.GOLD_FRAME_SLAB);
                        entries.add(ModBlocks.GOLD_FRAME_PANE);
                        entries.add(ModBlocks.IRON_FRAME);
                        entries.add(ModBlocks.IRON_FRAME_STAIRS);
                        entries.add(ModBlocks.IRON_FRAME_SLAB);
                        entries.add(ModBlocks.IRON_FRAME_PANE);

                        // BOOKSHELF
                        entries.add(Blocks.BOOKSHELF);
                        entries.add(ModBlocks.BOOKSHELF_STAIRS);
                        entries.add(ModBlocks.BOOKSHELF_SLAB);

                        // GLASS
                        entries.add(Blocks.GLASS);
                        entries.add(ModBlocks.GLASS_STAIRS);
                        entries.add(ModBlocks.GLASS_SLAB);
                    }).build());

    public static void registerModItemGroups() {
        LuckysPalette.LOGGER.info("Registering Item Groups for " + LuckysPalette.MOD_ID);
    }
}
