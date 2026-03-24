package net.joltthewolf.cobblemonarmory.client.renderer.item;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.BastiodonShieldItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BastiodonShieldRenderer extends GeoItemRenderer<BastiodonShieldItem> {
    public BastiodonShieldRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(
                CobblemonArmory.MOD_ID, "bastiodon_shield")));
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext ctx, PoseStack poseStack,
                             MultiBufferSource buffer, int light, int overlay) {

        // Apply a first-person blocking transform when the player is actively using the shield
        if (ctx == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND || ctx == ItemDisplayContext.FIRST_PERSON_LEFT_HAND) {
            LocalPlayer player = Minecraft.getInstance().player;
            boolean isUsing = player != null && player.isUsingItem() && player.getUseItem() == stack;

            if (isUsing) {
                boolean rightHand = (ctx == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND);
                applyFirstPersonBlockTransform(poseStack, rightHand);
            }
        }

        super.renderByItem(stack, ctx, poseStack, buffer, light, overlay);
    }

    private static void applyFirstPersonBlockTransform(PoseStack poseStack, boolean rightHand) {
        if (rightHand) {
            // Right-hand block
            poseStack.translate(0.8f, -0.2f, 0.6f);
            poseStack.mulPose(Axis.YP.rotationDegrees(60f));
        } else {
            // Left-hand block
            poseStack.translate(-0.2f, -0.2f, -0.2f);
            poseStack.mulPose(Axis.YP.rotationDegrees(-60f));
        }
        poseStack.scale(1f, 1f, 1f);
    }
}
