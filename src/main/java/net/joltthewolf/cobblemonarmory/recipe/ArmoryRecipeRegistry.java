/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.recipe;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ArmoryRecipeRegistry {

    private ArmoryRecipeRegistry() {}

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, CobblemonArmory.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<?>> ARMORY_SMITHING =
            RECIPE_SERIALIZERS.register("armory_smithing", () -> ArmorySmithingSerializer.INSTANCE);

    public static void init() {}
}