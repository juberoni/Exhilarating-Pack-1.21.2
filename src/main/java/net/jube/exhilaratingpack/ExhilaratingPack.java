package net.jube.exhilaratingpack;

import net.fabricmc.api.ModInitializer;

import net.jube.exhilaratingpack.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExhilaratingPack implements ModInitializer {
	public static final String MOD_ID = "exhilaratingpack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}