package net.joltthewolf.cobblemonarmory.client.renderer.armor;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.ShinyEeveeArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShinyEeveeArmorRenderer extends GeoArmorRenderer<ShinyEeveeArmorItem> {
    public ShinyEeveeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armor/shiny_eevee_armor")));
    }
}
