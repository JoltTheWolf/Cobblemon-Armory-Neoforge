package net.joltthewolf.cobblemonarmory.client.renderer.armor;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.SlowkingCrownArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SlowkingCrownArmorRenderer extends GeoArmorRenderer<SlowkingCrownArmorItem> {
    public SlowkingCrownArmorRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armor/slowking_crown")));
    }
}
