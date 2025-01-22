package net.luckystudio.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.luckystudio.common.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class ModRenderLayers {

    public static void registerBlockRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                // Beams
                ModBlocks.OAK_BEAM,
                ModBlocks.SPRUCE_BEAM,
                ModBlocks.BIRCH_BEAM,
                ModBlocks.JUNGLE_BEAM,
                ModBlocks.ACACIA_BEAM,
                ModBlocks.DARK_OAK_BEAM,
                ModBlocks.MANGROVE_BEAM,
                ModBlocks.CHERRY_BEAM,
                ModBlocks.BAMBOO_BEAM,
                ModBlocks.CRIMSON_BEAM,
                ModBlocks.WARPED_BEAM,
                ModBlocks.STRIPPED_OAK_BEAM,
                ModBlocks.STRIPPED_SPRUCE_BEAM,
                ModBlocks.STRIPPED_BIRCH_BEAM,
                ModBlocks.STRIPPED_JUNGLE_BEAM,
                ModBlocks.STRIPPED_ACACIA_BEAM,
                ModBlocks.STRIPPED_DARK_OAK_BEAM,
                ModBlocks.STRIPPED_MANGROVE_BEAM,
                ModBlocks.STRIPPED_CHERRY_BEAM,
                ModBlocks.STRIPPED_BAMBOO_BEAM,
                ModBlocks.STRIPPED_CRIMSON_BEAM,
                ModBlocks.STRIPPED_WARPED_BEAM,

                // GLASS
                ModBlocks.GLASS_STAIRS,
                ModBlocks.GLASS_SLAB,

                // FRAMES
                ModBlocks.GOLD_FRAME,
                ModBlocks.GOLD_FRAME_STAIRS,
                ModBlocks.GOLD_FRAME_SLAB,
                ModBlocks.GOLD_FRAME_PANE,
                ModBlocks.IRON_FRAME,
                ModBlocks.IRON_FRAME_STAIRS,
                ModBlocks.IRON_FRAME_SLAB,
                ModBlocks.IRON_FRAME_PANE
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.AUTUMN_STAINED_GLASS,
                ModBlocks.AUTUMN_STAINED_GLASS_STAIRS,
                ModBlocks.AUTUMN_STAINED_GLASS_SLAB,
                ModBlocks.AUTUMN_STAINED_GLASS_PANE
        );
    }
}

