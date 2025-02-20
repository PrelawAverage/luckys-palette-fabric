package net.luckystudio.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.luckystudio.LuckysPalette;
import net.luckystudio.common.block.ModBlocks;
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

                        // LUMBER BLOCKS
                        entries.add(ModBlocks.OAK_LUMBER);
                        entries.add(ModBlocks.SPRUCE_LUMBER);
                        entries.add(ModBlocks.BIRCH_LUMBER);
                        entries.add(ModBlocks.JUNGLE_LUMBER);
                        entries.add(ModBlocks.ACACIA_LUMBER);
                        entries.add(ModBlocks.DARK_OAK_LUMBER);
                        entries.add(ModBlocks.MANGROVE_LUMBER);
                        entries.add(ModBlocks.CHERRY_LUMBER);
                        entries.add(ModBlocks.BAMBOO_STALK);
                        entries.add(ModBlocks.CRIMSON_LUMBER);
                        entries.add(ModBlocks.WARPED_LUMBER);
                        entries.add(ModBlocks.STRIPPED_OAK_LUMBER);
                        entries.add(ModBlocks.STRIPPED_SPRUCE_LUMBER);
                        entries.add(ModBlocks.STRIPPED_BIRCH_LUMBER);
                        entries.add(ModBlocks.STRIPPED_JUNGLE_LUMBER);
                        entries.add(ModBlocks.STRIPPED_ACACIA_LUMBER);
                        entries.add(ModBlocks.STRIPPED_DARK_OAK_LUMBER);
                        entries.add(ModBlocks.STRIPPED_MANGROVE_LUMBER);
                        entries.add(ModBlocks.STRIPPED_CHERRY_LUMBER);
                        entries.add(ModBlocks.STRIPPED_BAMBOO_STALK);
                        entries.add(ModBlocks.STRIPPED_CRIMSON_LUMBER);
                        entries.add(ModBlocks.STRIPPED_WARPED_LUMBER);

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
