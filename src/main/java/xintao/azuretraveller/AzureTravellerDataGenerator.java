package xintao.azuretraveller;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import xintao.azuretraveller.datagen.*;

public class AzureTravellerDataGenerator implements DataGeneratorEntrypoint 
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) 
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		
		pack.addProvider(AtModBlockTagProvider::new);
		pack.addProvider(AtModItemTagProvider::new);
		pack.addProvider(AtModLangEnProvider::new);
		pack.addProvider(AtModLangZhProvider::new);
		pack.addProvider(AtModLootTableProvider::new);
		pack.addProvider(AtModModelProvider::new);
		pack.addProvider(AtModRecipeProvider::new);
	}
}
