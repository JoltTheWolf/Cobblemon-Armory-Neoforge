/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */


package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ComponentRegistry {
    private ComponentRegistry() {}

    public static final DeferredRegister.DataComponents DATA_COMPONENTS =
            DeferredRegister.createDataComponents(CobblemonArmory.MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<ResourceLocation>>
            ARMOR_SET_ID = DATA_COMPONENTS.registerComponentType("armor_set_id", builder -> builder
                    .persistent(ResourceLocation.CODEC)
                    .networkSynchronized(ResourceLocation.STREAM_CODEC));


public static final DeferredHolder<DataComponentType<?>, DataComponentType<ResourceLocation>>
        MATERIAL_ID = DATA_COMPONENTS.registerComponentType("material_id", builder -> builder
            .persistent(ResourceLocation.CODEC)
            .networkSynchronized(ResourceLocation.STREAM_CODEC));

    public static void init() {}
}

