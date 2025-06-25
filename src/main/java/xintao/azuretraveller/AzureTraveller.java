package xintao.azuretraveller;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xintao.azuretraveller.block.AtBlocks;
import xintao.azuretraveller.block.wood.AtWoodBlock;
import xintao.azuretraveller.entity.AtBlockEntities;
import xintao.azuretraveller.item.AtItemGroup;
import xintao.azuretraveller.item.AtItems;
import xintao.azuretraveller.world.gen.AtWorldGeneration;

public class AzureTraveller implements ModInitializer
{
	/**
	 * 这是整个模组的主类，在游戏启动时初始化。
	 * 模组使用 Java 21，基于 Fabric 和 Minecraft 1.21 开发，兼容 1.21 和 1.21.1 两个版本。
	 */
	// 模组ID
	public static final String MOD_ID = "azuretraveller";
	
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// 主类的初始化方法
	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AtItems.load();
		AtBlocks.load();
		AtItemGroup.registerModItemGroup();
		AtBlockEntities.load();
		AtWoodBlock.addModWood();
		AtWorldGeneration.modWorldGeneration();
		//AtEnchantmentEffects.registerModEnchantmentEffect();
		
		LOGGER.info("Hello Fabric world!");
	}
}