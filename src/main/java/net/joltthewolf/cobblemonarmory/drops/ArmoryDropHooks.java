/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.drops;

import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.joltthewolf.cobblemonarmory.registry.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomModelData;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

import java.lang.reflect.Method;

public final class ArmoryDropHooks {
    private ArmoryDropHooks() {}

    public static void register() {}

    public static void onAfterDeath(LivingDeathEvent event) {
        LivingEntity entity = event.getEntity();
        if (!(entity.level() instanceof ServerLevel level)) return;

        ResourceLocation speciesId = tryGetCobblemonSpeciesId(entity);
        if (speciesId == null) return;

        runDropTable(level, entity.blockPosition(), speciesId, level.random);
    }

    private static void runDropTable(ServerLevel level, BlockPos pos, ResourceLocation speciesId, RandomSource rand) {
        ArmoryDrops.DropTable table = ArmoryDrops.get(speciesId);
        if (table == null) return;

        int successes = 0;

        for (ArmoryDrops.Entry entry : table.entries) {
            if (successes >= table.amount) break;

            double roll = rand.nextDouble() * 100.0;
            if (roll > entry.percentage) continue;

            successes++;

            int count = entry.quantityRange.roll(rand);
            if (count <= 0) continue;

            ItemStack stack = new ItemStack(ItemRegistry.DP_ITEM.get(), count);
            stack.set(ComponentRegistry.MATERIAL_ID.get(), entry.materialId);

            if (entry.customModelData != 0) {
                stack.set(DataComponents.CUSTOM_MODEL_DATA, new CustomModelData(entry.customModelData));
            }

            ItemEntity it = new ItemEntity(level,
                    pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    stack);

            level.addFreshEntity(it);
        }
    }

    private static ResourceLocation tryGetCobblemonSpeciesId(LivingEntity entity) {
        try {
            Class<?> pokemonEntityClz =
                    Class.forName("com.cobblemon.mod.common.entity.pokemon.PokemonEntity");

            if (!pokemonEntityClz.isInstance(entity)) return null;

            Object pokemon = invokeNoArgs(entity, "getPokemon");
            if (pokemon == null) return null;

            Object species = invokeNoArgs(pokemon, "getSpecies");
            if (species == null) return null;

            Object id = invokeNoArgs(species, "getResourceIdentifier");

            if (id == null) id = invokeNoArgs(species, "getIdentifier");
            if (id == null) id = invokeNoArgs(species, "getId");
            if (id == null) return null;

            String s = id.toString();
            int colon = s.indexOf(':');
            if (colon <= 0) return null;

            String ns = s.substring(0, colon);
            String path = s.substring(colon + 1);
            return ResourceLocation.fromNamespaceAndPath(ns, path);

        } catch (Throwable ignored) {
            return null;
        }
    }

    private static Object invokeNoArgs(Object target, String methodName) {
        try {
            Method m = target.getClass().getMethod(methodName);
            return m.invoke(target);
        } catch (Throwable ignored) {
            return null;
        }
    }
}