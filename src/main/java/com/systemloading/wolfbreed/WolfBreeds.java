package com.systemloading.wolfbreed;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WolfBreeds implements ModInitializer {
	// For Version 24w10a (1.20.5 Snapshots)
	public static final String MOD_ID = "wolf-breeds";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod: " + WolfBreeds.MOD_ID);
	}
}