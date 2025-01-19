package net.luckyowl;

import net.fabricmc.api.ModInitializer;

import net.luckyowl.common.ModFlammableBlocks;
import net.luckyowl.common.ModFuels;
import net.luckyowl.common.ModItemGroups;
import net.luckyowl.common.block.ModBlocks;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuckysPalette implements ModInitializer {
	public static final String MOD_ID = "luckys_palette";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
		ModFlammableBlocks.registerFlammables();
		ModFuels.registerFuels();
	}

	public static Identifier ofMod(String path) {
		return Identifier.of(MOD_ID, path);
	}
}