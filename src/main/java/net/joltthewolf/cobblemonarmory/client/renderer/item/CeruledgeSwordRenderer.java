package net.joltthewolf.cobblemonarmory.client.renderer.item;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.CeruledgeSwordItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class CeruledgeSwordRenderer extends GeoItemRenderer<CeruledgeSwordItem> {
    public CeruledgeSwordRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "ceruledge_sword")));
    }
}