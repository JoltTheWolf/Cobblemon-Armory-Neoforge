/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import java.lang.reflect.Method;

public final class RightClickEntityRegistry {
    private RightClickEntityRegistry() {}

    public static void init() {}

    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        // Only main-hand interactions
        if (event.getHand() != InteractionHand.MAIN_HAND) return;

        // Must be holding smithing upgrade
        ItemStack held = event.getEntity().getItemInHand(event.getHand());
        if (held.isEmpty() || held.getItem() != ItemRegistry.COBBLEMON_SMITHING_UPGRADE.get()) return;

        Player player = event.getEntity();
        Entity target = event.getTarget();

        // Must be a Cobblemon Pokemon entity
        String typeKey = String.valueOf(BuiltInRegistries.ENTITY_TYPE.getKey(target.getType()));
        if (!"cobblemon:pokemon".equals(typeKey)) return;

        ResourceLocation speciesId = tryGetCobblemonSpeciesId(target);
        if (speciesId == null) return;

        if (speciesId.equals(ResourceLocation.fromNamespaceAndPath("cobblemon", "charizard"))) {
            spawnDrop((ServerLevel) player.level(), target, new ItemStack(ItemRegistry.CHARIZARD_SCALES.get()));
            held.shrink(1);
            event.setCanceled(true);
            event.setCancellationResult(InteractionResult.SUCCESS);
        }
    }

    private static void spawnDrop(ServerLevel level, Entity target, ItemStack stack) {
        ItemEntity drop = new ItemEntity(level, target.getX(), target.getY(), target.getZ(), stack);
        level.addFreshEntity(drop);
    }

    private static ResourceLocation tryGetCobblemonSpeciesId(Entity target) {
        try {
            Class<?> pokemonEntityClz = Class.forName("com.cobblemon.mod.common.entity.pokemon.PokemonEntity");
            if (!pokemonEntityClz.isInstance(target)) return null;

            Object pokemon = invokeNoArgs(target, "getPokemon");
            if (pokemon == null) return null;

            Object species = invokeNoArgs(pokemon, "getSpecies");
            if (species == null) return null;

            Object id = invokeNoArgs(species, "getResourceIdentifier");
            if (id == null) id = invokeNoArgs(species, "getIdentifier");
            if (id == null) id = invokeNoArgs(species, "getId");
            if (id == null) return null;

            return ResourceLocation.parse(id.toString());
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static Object invokeNoArgs(Object target, String methodName) {
        try {
            Method method = target.getClass().getMethod(methodName);
            return method.invoke(target);
        } catch (Throwable ignored) {
            return null;
        }
    }
}