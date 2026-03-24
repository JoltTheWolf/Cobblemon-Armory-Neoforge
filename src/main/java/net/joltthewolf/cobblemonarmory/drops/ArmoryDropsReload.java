/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.drops;

import net.neoforged.neoforge.event.AddReloadListenerEvent;

public final class ArmoryDropsReload {
    private ArmoryDropsReload() {}

    public static void register(AddReloadListenerEvent event) {
        event.addListener(new ArmoryDrops.Loader());
    }
}