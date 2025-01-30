package xintao.azuretraveller.world.biome;

import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.world.gen.surfacebuilder.AtMaterialRules;

public class AtTerraBlenderApi implements TerraBlenderApi
{
    @Override
    public void onTerraBlenderInitialized() 
    {
        Regions.register(new AtOverworldRegion(Identifier.of(AzureTraveller.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, AzureTraveller.MOD_ID, AtMaterialRules.modMaterialRule());
    }
}
