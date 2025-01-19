package net.luckyowl;

import com.google.common.util.concurrent.Runnables;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.luckyowl.datagen.*;

public class LuckysPaletteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack PACK = fabricDataGenerator.createPack();
		PACK.addProvider(ModBlockTagProvider::new);
		PACK.addProvider(ModItemTagProvider::new);
		PACK.addProvider(ModLootTableProvider::new);
		PACK.addProvider(ModModelProvider::new);
		PACK.addProvider(ModRecipeProvider::new);
	}
}
