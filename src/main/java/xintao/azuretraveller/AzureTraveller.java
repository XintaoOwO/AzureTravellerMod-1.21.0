package xintao.azuretraveller;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xintao.azuretraveller.block.AtModBlocks;
import xintao.azuretraveller.item.AtModItemGroups;
import xintao.azuretraveller.item.AtModItems;

public class AzureTraveller implements ModInitializer
{
	public static final String MOD_ID = "azuretraveller";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AtModItems.registerModItem();
		AtModBlocks.registerModBlock();
		AtModItemGroups.registerModItemGroup();
		
		LOGGER.info("Hello Fabric world!");
	}
}