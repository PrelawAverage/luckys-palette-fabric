package net.luckyowl;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.luckyowl.client.ModRenderLayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuckysPaletteClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModRenderLayers.registerBlockRenderLayers();
	}
}