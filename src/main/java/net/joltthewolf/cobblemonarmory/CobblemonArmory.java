package net.joltthewolf.cobblemonarmory;

import net.joltthewolf.cobblemonarmory.recipe.ArmoryRecipeRegistry;
import net.joltthewolf.cobblemonarmory.registry.ArmorRegistry;
import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.joltthewolf.cobblemonarmory.registry.ItemGroupRegistry;
import net.joltthewolf.cobblemonarmory.registry.ItemRegistry;
import net.joltthewolf.cobblemonarmory.registry.ArmorySignature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

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
        ComponentRegistry.init();
        ArmorRegistry.init();
        ItemRegistry.init();
        ItemGroupRegistry.init();
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
