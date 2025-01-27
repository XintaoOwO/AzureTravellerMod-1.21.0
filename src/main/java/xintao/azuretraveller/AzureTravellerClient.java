package xintao.azuretraveller;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import xintao.azuretraveller.block.AtBlocks;

public class AzureTravellerClient implements ClientModInitializer 
{
    @Override
    public void onInitializeClient() 
    {
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.MYTHRIL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.MYTHRIL_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.STRAWBERRY_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.PEAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.PEACH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AtBlocks.CELESTE_SAPLING, RenderLayer.getCutout());
    }
}
