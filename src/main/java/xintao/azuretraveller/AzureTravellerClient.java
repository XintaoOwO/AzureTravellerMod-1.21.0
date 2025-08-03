package xintao.azuretraveller;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import xintao.azuretraveller.block.AtBlock;

public class AzureTravellerClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient() 
    {
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.MYTHRIL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.MYTHRIL_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.STRAWBERRY_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.PEAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.PEACH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlock.CELESTE_SAPLING, RenderLayer.getCutout());
    }
}
