package net.will.tutorialfabric;

import net.fabricmc.api.ModInitializer;

import net.will.tutorialfabric.block.ModBlocks;
import net.will.tutorialfabric.item.ModItemGroups;
import net.will.tutorialfabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialFabric implements ModInitializer {
	public static final String MOD_ID = "tutorialfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registeritemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}