package net.joltthewolf.cobblemonarmory.client.renderer.armor;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.FlareonArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FlareonArmorRenderer extends GeoArmorRenderer<FlareonArmorItem> {
    public FlareonArmorRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armor/flareon_armor")));
    }
}
