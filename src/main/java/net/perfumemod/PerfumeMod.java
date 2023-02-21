package net.perfumemod;

import net.fabricmc.api.ModInitializer;

import net.perfumemod.Items.PerfumeItems;
import net.perfumemod.util.PerfumeLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerfumeMod implements ModInitializer {
  public static final String MOD_ID = "perfumemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
    PerfumeItems.registerPerfumeItems();
    PerfumeLootTableModifiers.modifyLootTable();
	}
}
