package net.joltthewolf.cobblemonarmory;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(CobblemonArmory.MOD_ID)
public class CobblemonArmory {
    public static final String MOD_ID = "cobblemonarmory";
    public static final Logger LOGGER = LogUtils.getLogger();

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
