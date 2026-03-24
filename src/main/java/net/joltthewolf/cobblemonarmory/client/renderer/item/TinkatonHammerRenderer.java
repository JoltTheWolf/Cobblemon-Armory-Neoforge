package net.joltthewolf.cobblemonarmory.client.renderer.item;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.TinkatonHammerItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class TinkatonHammerRenderer extends GeoItemRenderer<TinkatonHammerItem> {
    public TinkatonHammerRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "tinkaton_hammer")));
    }
}