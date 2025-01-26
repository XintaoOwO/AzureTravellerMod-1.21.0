package xintao.azuretraveller;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import xintao.azuretraveller.datagen.*;
import xintao.azuretraveller.world.tree.AtTreeConfiguredFeatures;
import xintao.azuretraveller.world.tree.AtTreePlacedFeatures;

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

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) 
	{
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AtTreeConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AtTreePlacedFeatures::bootstrap);
	}
}
