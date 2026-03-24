/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = CobblemonArmory.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = CobblemonArmory.MOD_ID, value = Dist.CLIENT)
public final class CobblemonArmoryClient {

    private CobblemonArmoryClient() {}

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
