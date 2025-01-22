package net.luckystudio;

import net.fabricmc.api.ClientModInitializer;
import net.luckystudio.client.ModRenderLayers;

public class LuckysPaletteClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModRenderLayers.registerBlockRenderLayers();
	}
}