package net.luckystudio;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.luckystudio.client.ModRenderLayers;

@Environment(EnvType.CLIENT)
public class LuckysPaletteClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModRenderLayers.registerBlockRenderLayers();
	}
}