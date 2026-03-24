/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.item;

import net.joltthewolf.cobblemonarmory.client.DatapackArmorRenderer;
import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class DatapackArmorItem extends ArmorItem implements GeoItem {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public DatapackArmorItem(Holder<ArmorMaterial> material, Type type, Properties props) {
        super(material, type, props);
    }

    public static ResourceLocation getSetId(ItemStack stack) {
        return stack.get(ComponentRegistry.ARMOR_SET_ID.get());
    }

    @Override
    public Component getName(ItemStack stack) {
        ResourceLocation setId = getSetId(stack);

        if (setId == null) {
            return super.getName(stack);
        }

        String piece = pieceSuffixFor(this.getType());
        String key = "armor_set." + setId.getNamespace() + "." + setId.getPath() + "." + piece;
        return Component.translatable(key);
    }

    public static String pieceSuffixFor(Type type) {
        return switch (type) {
            case HELMET -> "helmet";
            case CHESTPLATE -> "chestplate";
            case LEGGINGS -> "leggings";
            case BOOTS -> "boots";
            default -> "helmet";
        };
    }

    public static Type getArmorType(ItemStack stack) {
        if (stack.getItem() instanceof DatapackArmorItem item) {
            return item.getType();
        }
        return Type.HELMET;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        ResourceLocation id = getSetId(stack);
        if (id != null) {
            tooltip.add(Component.literal(id.toString()));
        }
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(
                this,
                "controller",
                0,
                state -> {
                    state.setAndContinue(RawAnimation.begin().thenLoop("idle"));
                    return PlayState.CONTINUE;
                }
        ));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private DatapackArmorRenderer renderer;

            @Override
            public HumanoidModel<?> getHumanoidArmorModel(
                    LivingEntity livingEntity,
                    ItemStack stack,
                    EquipmentSlot slot,
                    HumanoidModel<?> original
            ) {
                if (renderer == null) {
                    renderer = new DatapackArmorRenderer();
                }

                renderer.prepForRender(livingEntity, stack, slot, original);
                return renderer;
            }

            @Override
            public @Nullable BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null) {
                    renderer = new DatapackArmorRenderer();
                }

                return renderer;
            }
        });
    }
}