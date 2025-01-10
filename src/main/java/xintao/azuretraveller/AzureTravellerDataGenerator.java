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
		
		pack.addProvider(AtBlockTagProvider::new);
		pack.addProvider(AtItemTagProvider::new);
		pack.addProvider(AtLangEnProvider::new);
		pack.addProvider(AtLangZhProvider::new);
		pack.addProvider(AtLootTableProvider::new);
		pack.addProvider(AtModelProvider::new);
		pack.addProvider(AtRecipeProvider::new);
	}
}
