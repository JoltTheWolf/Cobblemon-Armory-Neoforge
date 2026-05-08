/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public final class ArmorRegistry {

    private ArmorRegistry() {}

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, CobblemonArmory.MOD_ID);

    // === All materials share the same stats ===
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CHARIZARD_ARMOR_MATERIAL = reg("charizard");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_CHARIZARD_ARMOR_MATERIAL = reg("shiny_charizard");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> TORTERRA_ARMOR_MATERIAL = reg("torterra");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_TORTERRA_ARMOR_MATERIAL = reg("shiny_torterra");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BLAZIKEN_ARMOR_MATERIAL = reg("blaziken");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_BLAZIKEN_ARMOR_MATERIAL = reg("shiny_blaziken");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CORVIKNIGHT_ARMOR_MATERIAL = reg("corviknight");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_CORVIKNIGHT_ARMOR_MATERIAL = reg("shiny_corviknight");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ARMAROUGE_ARMOR_MATERIAL = reg("armarouge");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CERULEDGE_ARMOR_MATERIAL = reg("ceruledge");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> EEVEE_ARMOR_MATERIAL = reg("eevee");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ESPEON_ARMOR_MATERIAL = reg("espeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> FLAREON_ARMOR_MATERIAL = reg("flareon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GLACEON_ARMOR_MATERIAL = reg("glaceon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HAXORUS_ARMOR_MATERIAL = reg("haxorus");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> JOLTEON_ARMOR_MATERIAL = reg("jolteon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LEAFEON_ARMOR_MATERIAL = reg("leafeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> METAGROSS_ARMOR_MATERIAL = reg("metagross");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> RAYQUAZA_ARMOR_MATERIAL = reg("rayquaza");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_EEVEE_ARMOR_MATERIAL = reg("shiny_eevee");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_ESPEON_ARMOR_MATERIAL = reg("shiny_espeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_FLAREON_ARMOR_MATERIAL = reg("shiny_flareon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_GLACEON_ARMOR_MATERIAL = reg("shiny_glaceon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_HAXORUS_ARMOR_MATERIAL = reg("shiny_haxorus");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_JOLTEON_ARMOR_MATERIAL = reg("shiny_jolteon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_LEAFEON_ARMOR_MATERIAL = reg("shiny_leafeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_METAGROSS_ARMOR_MATERIAL = reg("shiny_metagross");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_RAYQUAZA_ARMOR_MATERIAL = reg("shiny_rayquaza");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_SYLVEON_ARMOR_MATERIAL = reg("shiny_sylveon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_UMBREON_ARMOR_MATERIAL = reg("shiny_umbreon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_VAPOREON_ARMOR_MATERIAL = reg("shiny_vaporeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SYLVEON_ARMOR_MATERIAL = reg("sylveon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> UMBREON_ARMOR_MATERIAL = reg("umbreon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> VAPOREON_ARMOR_MATERIAL = reg("vaporeon");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GALARIAN_WEEZING_HAT_ARMOR_MATERIAL = reg("galarian_weezing_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SQUIRTLE_GLASSES_ARMOR_MATERIAL = reg("squirtle_glasses");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SLOWKING_CROWN_ARMOR_MATERIAL = reg("slowking_crown");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GRENINJA_SCARF_ARMOR_MATERIAL = reg("greninja_scarf");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MIMIKYU_ARMOR_MATERIAL = reg("mimikyu");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SHINY_MIMIKYU_ARMOR_MATERIAL = reg("shiny_mimikyu");


    // Trainer Hats
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> REDS_HAT_ARMOR_MATERIAL = regLeather("reds_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ETHANS_HAT_ARMOR_MATERIAL = regLeather("ethans_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> KRISS_HAT_ARMOR_MATERIAL = regLeather("kriss_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MAYS_HAT_ARMOR_MATERIAL = regLeather("mays_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DAWNS_HAT_ARMOR_MATERIAL = regLeather("dawns_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LEAFS_HAT_ARMOR_MATERIAL = regLeather("leafs_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LYRAS_HAT_ARMOR_MATERIAL = regLeather("lyras_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NATES_HAT_ARMOR_MATERIAL = regLeather("nates_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CALEMS_HAT_ARMOR_MATERIAL = regLeather("calems_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRENDANS_HAT_ARMOR_MATERIAL = regLeather("brendans_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LUCASS_HAT_ARMOR_MATERIAL = regLeather("lucass_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HILBERTS_HAT_ARMOR_MATERIAL = regLeather("hilbertss_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HILDAS_HAT_ARMOR_MATERIAL = regLeather("hildas_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ROSAS_HAT_ARMOR_MATERIAL = regLeather("rosas_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SERENAS_HAT_ARMOR_MATERIAL = regLeather("serenas_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SELENES_HAT_ARMOR_MATERIAL = regLeather("selenes_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ELIOS_HAT_ARMOR_MATERIAL = regLeather("elios_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GLORIAS_HAT_ARMOR_MATERIAL = regLeather("glorias_hat");
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> VICTORS_HAT_ARMOR_MATERIAL = regLeather("victors_hat");

    // - Helpers -
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ARMOR_BASE_MATERIAL =
            registerArmorMaterial("armor_base", createArmorMaterialFor("armor_base"));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> REG_LEATHER_MATERIAL =
            registerArmorMaterial("leather_base", createLeatherArmorMaterialFor("leather_base"));

    public static void init() {
        CobblemonArmory.LOGGER.info("Registering armor materials for {}", CobblemonArmory.MOD_ID);

        // Touch the holders so the fields stay referenced like the Fabric version did
        DeferredHolder<ArmorMaterial, ArmorMaterial> _a = ARMOR_BASE_MATERIAL;
        DeferredHolder<ArmorMaterial, ArmorMaterial> _b = REG_LEATHER_MATERIAL;
    }

    // - Datapack Support -
    public static Holder<ArmorMaterial> resolveDatapackMaterial(String key) {
        return switch (key) {
            case "armor_base" -> ARMOR_BASE_MATERIAL;
            case "leather_base" -> REG_LEATHER_MATERIAL;
            default -> ARMOR_BASE_MATERIAL;
        };
    }

    // Regular Armor Stats
    private static DeferredHolder<ArmorMaterial, ArmorMaterial> reg(String key) {
        return registerArmorMaterial(key, createArmorMaterialFor(key));
    }

    // Leather Armor Stats
    private static DeferredHolder<ArmorMaterial, ArmorMaterial> regLeather(String key) {
        return registerArmorMaterial(key, createLeatherArmorMaterialFor(key));
    }

    private static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, path);
    }

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> registerArmorMaterial(String path, ArmorMaterial material) {
        return ARMOR_MATERIALS.register(path, () -> material);
    }

    private static ArmorMaterial createArmorMaterialFor(String layerKey) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);

        // Armor Base
        defense.put(ArmorItem.Type.HELMET, 3);
        defense.put(ArmorItem.Type.CHESTPLATE, 8);
        defense.put(ArmorItem.Type.LEGGINGS, 6);
        defense.put(ArmorItem.Type.BOOTS, 3);
        defense.put(ArmorItem.Type.BODY, 8);

        Supplier<Ingredient> repairSupplier = () -> Ingredient.of(Items.DIAMOND);

        return new ArmorMaterial(
                defense,
                12, // enchantability
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                repairSupplier,
                List.of(new ArmorMaterial.Layer(id(layerKey))),
                2.5F, // toughness
                0.0F // knockback resistance
        );
    }

    private static ArmorMaterial createLeatherArmorMaterialFor(String layerKey) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);

        // Vanilla leather-ish values
        defense.put(ArmorItem.Type.HELMET, 1);
        defense.put(ArmorItem.Type.CHESTPLATE, 3);
        defense.put(ArmorItem.Type.LEGGINGS, 2);
        defense.put(ArmorItem.Type.BOOTS, 1);
        defense.put(ArmorItem.Type.BODY, 3);

        Supplier<Ingredient> repairSupplier = () -> Ingredient.of(Items.LEATHER);

        return new ArmorMaterial(
                defense,
                15, // enchantability
                SoundEvents.ARMOR_EQUIP_LEATHER,
                repairSupplier,
                List.of(new ArmorMaterial.Layer(id(layerKey))),
                0.0F, // toughness
                0.0F // knockback resistance
        );
    }

    // - Durability helper (used when registering items) -
    // Vanilla base health per slot: HELMET=11, CHEST=16, LEGS=15, BOOTS=13
    private static final int HELMET_BASE = 11;
    private static final int CHEST_BASE = 16;
    private static final int LEGS_BASE = 15;
    private static final int BOOTS_BASE = 13;

    /* 35x durability per slot */
    public static Item.Properties commonProps(ArmorItem.Type type) {
        int base = switch (type) {
            case HELMET -> HELMET_BASE;
            case CHESTPLATE, BODY -> CHEST_BASE;
            case LEGGINGS -> LEGS_BASE;
            case BOOTS -> BOOTS_BASE;
        };
        return new Item.Properties().stacksTo(1).durability(base * 35);
    }

    /* 5x durability per slot */
    public static Item.Properties commonHatProps(ArmorItem.Type type) {
        int base = switch (type) {
            case HELMET -> HELMET_BASE;
            case CHESTPLATE, BODY -> CHEST_BASE;
            case LEGGINGS -> LEGS_BASE;
            case BOOTS -> BOOTS_BASE;
        };
        return new Item.Properties().stacksTo(1).durability(base * 5);
    }
}