package net.joltthewolf.cobblemonarmory.client.renderer.armor;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.EliosHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EliosHatArmorRenderer extends GeoArmorRenderer<EliosHatArmorItem> {
    public EliosHatArmorRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armor/elios_hat")));
    }
}
