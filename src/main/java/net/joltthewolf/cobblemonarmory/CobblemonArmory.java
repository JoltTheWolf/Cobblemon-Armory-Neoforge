package net.joltthewolf.cobblemonarmory;

import com.mojang.logging.LogUtils;
import net.joltthewolf.cobblemonarmory.command.ArmoryDebugCommand;
import net.joltthewolf.cobblemonarmory.drops.ArmoryDropHooks;
import net.joltthewolf.cobblemonarmory.drops.ArmoryDrops;
import net.joltthewolf.cobblemonarmory.drops.ArmoryDropsReload;
import net.joltthewolf.cobblemonarmory.recipe.ArmoryRecipeRegistry;
import net.joltthewolf.cobblemonarmory.registry.ArmorRegistry;
import net.joltthewolf.cobblemonarmory.registry.ArmorySignature;
import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.joltthewolf.cobblemonarmory.registry.ItemGroupRegistry;
import net.joltthewolf.cobblemonarmory.registry.ItemRegistry;
import net.joltthewolf.cobblemonarmory.registry.LootInjectorRegistry;
import net.joltthewolf.cobblemonarmory.registry.RightClickEntityRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import org.slf4j.Logger;

@Mod(CobblemonArmory.MOD_ID)
public class CobblemonArmory {
    public static final String MOD_ID = "cobblemonarmory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CobblemonArmory(IEventBus modBus) {
        verifySignature();

        ComponentRegistry.DATA_COMPONENTS.register(modBus);
        ArmorRegistry.ARMOR_MATERIALS.register(modBus);
        ItemRegistry.ITEMS.register(modBus);
        ItemGroupRegistry.CREATIVE_MODE_TABS.register(modBus);
        ArmoryRecipeRegistry.RECIPE_SERIALIZERS.register(modBus);

        modBus.addListener(ArmoryDropsReload::register);

        NeoForge.EVENT_BUS.addListener(ArmoryDropHooks::onAfterDeath);
        NeoForge.EVENT_BUS.addListener(RightClickEntityRegistry::onEntityInteract);
        NeoForge.EVENT_BUS.addListener(CobblemonArmory::registerCommands);

        ComponentRegistry.init();
        ArmorRegistry.init();
        ItemRegistry.init();
        ItemGroupRegistry.init();
        ArmoryRecipeRegistry.init();
        ArmoryDrops.init();
        ArmoryDropHooks.register();
        RightClickEntityRegistry.init();
        LootInjectorRegistry.init();
    }

    private static void registerCommands(RegisterCommandsEvent event) {
        ArmoryDebugCommand.register(event.getDispatcher());
    }

    private static void verifySignature() {
        final String expected = "JTWCA";
        try {
            String actual = ArmorySignature.SIGNATURE;
            if (!expected.equals(actual)) {
                LOGGER.warn("[{}] Signature mismatch.", MOD_ID);
            }
        } catch (Throwable t) {
            LOGGER.warn("[{}] Signature missing.", MOD_ID);
        }
    }
}