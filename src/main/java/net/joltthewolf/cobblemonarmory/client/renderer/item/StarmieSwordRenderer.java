package net.joltthewolf.cobblemonarmory.client.renderer.item;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.StarmieSwordItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class StarmieSwordRenderer extends GeoItemRenderer<StarmieSwordItem> {
    public StarmieSwordRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "starmie_sword")));
    }
}