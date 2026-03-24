package net.joltthewolf.cobblemonarmory.client.renderer.armor;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.ShinyJolteonArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShinyJolteonArmorRenderer extends GeoArmorRenderer<ShinyJolteonArmorItem> {
    public ShinyJolteonArmorRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armor/shiny_jolteon_armor")));
    }
}
