package xintao.azuretraveller;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xintao.azuretraveller.block.AtBlock;
import xintao.azuretraveller.block.wood.AtWoodBlock;
import xintao.azuretraveller.entity.AtBlockEntity;
import xintao.azuretraveller.item.AtItemGroup;
import xintao.azuretraveller.item.AtItem;
import xintao.azuretraveller.world.gen.AtWorldGeneration;

public class AzureTraveller implements ModInitializer
{
	/**
	 * 这是整个模组的主类，在游戏启动时初始化。
	 * 模组使用 Java 21，基于 Fabric 和 Minecraft 1.21.1 开发。
	 */
	// 模组ID
	public static final String MOD_ID = "aztrvl";
	
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
		AtItem.init();
		AtBlock.init();
		AtItemGroup.registerModItemGroup();
		AtBlockEntity.init();
		AtWoodBlock.addModWood();
		AtWorldGeneration.loadModWorldGeneration();

		// 在控制台和日志文件中输出一条信息，表示模组已成功加载。
		LOGGER.info("Hello Fabric world!");

		// 这行代码会在控制台中输出一条信息，表示模组已成功加载。
		System.out.println("Hello Fabric world!");
	}
}