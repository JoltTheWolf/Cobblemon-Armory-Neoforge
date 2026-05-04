package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ItemGroupRegistry {
    private ItemGroupRegistry() {}

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobblemonArmory.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COBBLEMON_ARMORY_TAB =
            CREATIVE_MODE_TABS.register("cobblemon_armory", () -> CreativeModeTab.builder()
                    .title(Component.translatable("item." + CobblemonArmory.MOD_ID + ".cobblemon_armory"))
                    .icon(() -> new ItemStack(ItemRegistry.COBBLEMON_SMITHING_UPGRADE.get()))
                    .displayItems((parameters, output) -> {
                        //Items
                        output.accept(ItemRegistry.COBBLEMON_SMITHING_UPGRADE.get());
                        output.accept(ItemRegistry.CHARIZARD_SCALES.get());
                        output.accept(ItemRegistry.PRIMEAPE_FUR.get());
                        output.accept(ItemRegistry.BASTIODON_SKULL.get());
                        output.accept(ItemRegistry.EEVEE_FUR.get());
                        output.accept(ItemRegistry.HAXORUS_SHARD.get());
                        output.accept(ItemRegistry.STARMIE_PIECES.get());
                        output.accept(ItemRegistry.TINKATON_HAMMER_PIECE.get());
                        output.accept(ItemRegistry.TINKATON_HANDLE_PIECE.get());
                        output.accept(ItemRegistry.RAYQUAZA_SCALE.get());
                        output.accept(ItemRegistry.BLASTOISE_SHELL.get());
                        output.accept(ItemRegistry.BLAZIKEN_FEATHERS.get());
                        output.accept(ItemRegistry.CINDERACE_FUR.get());
                        output.accept(ItemRegistry.DECIDUEYE_FEATHERS.get());
                        output.accept(ItemRegistry.DELPHOX_FUR.get());
                        output.accept(ItemRegistry.EMBOAR_SKIN.get());
                        output.accept(ItemRegistry.EMPOLEON_HORNS.get());
                        output.accept(ItemRegistry.FERALIGATR_SCALE.get());
                        output.accept(ItemRegistry.INCINEROAR_FUR.get());
                        output.accept(ItemRegistry.INFERNAPE_PLATING.get());
                        output.accept(ItemRegistry.GRENINJA_SKIN.get());
                        output.accept(ItemRegistry.INTELEON_SHED.get());
                        output.accept(ItemRegistry.MEGANIUM_PETALS.get());
                        output.accept(ItemRegistry.SAMUROTT_PLATING.get());
                        output.accept(ItemRegistry.SCEPTILE_LEAVES.get());
                        output.accept(ItemRegistry.SERPERIOR_TAIL.get());
                        output.accept(ItemRegistry.SWAMPERT_SKIN.get());
                        output.accept(ItemRegistry.TORTERRA_SHELL.get());
                        output.accept(ItemRegistry.TYPHLOSION_FUR.get());
                        output.accept(ItemRegistry.VENUSAUR_FLOWER.get());
                        output.accept(ItemRegistry.METAGROSS_PLATE.get());
                        output.accept(ItemRegistry.CORVIKNIGHT_FEATHERS.get());

                        //Weapons
                        output.accept(ItemRegistry.TINKATON_HAMMER.get());
                        output.accept(ItemRegistry.STARMIE_SWORD.get());
                        output.accept(ItemRegistry.PRIMEAPE_GLOVES.get());
                        output.accept(ItemRegistry.SIRFETCHD_SWORD.get());
                        output.accept(ItemRegistry.BASTIODON_SHIELD.get());
                        output.accept(ItemRegistry.CERULEDGE_SWORD.get());
                        output.accept(ItemRegistry.ZACIAN_SWORD.get());
                        output.accept(ItemRegistry.METAGROSS_HAMMER.get());

                        //Trainer Hats
                        output.accept(ItemRegistry.REDS_HAT.get());
                        output.accept(ItemRegistry.LEAFS_HAT.get());
                        output.accept(ItemRegistry.ETHANS_HAT.get());
                        output.accept(ItemRegistry.KRISS_HAT.get());
                        output.accept(ItemRegistry.LYRAS_HAT.get());
                        output.accept(ItemRegistry.BRENDANS_HAT.get());
                        output.accept(ItemRegistry.MAYS_HAT.get());
                        output.accept(ItemRegistry.LUCASS_HAT.get());
                        output.accept(ItemRegistry.DAWNS_HAT.get());
                        output.accept(ItemRegistry.HILBERTS_HAT.get());
                        output.accept(ItemRegistry.HILDAS_HAT.get());
                        output.accept(ItemRegistry.NATES_HAT.get());
                        output.accept(ItemRegistry.ROSAS_HAT.get());
                        output.accept(ItemRegistry.CALEMS_HAT.get());
                        output.accept(ItemRegistry.SERENAS_HAT.get());
                        output.accept(ItemRegistry.ELIOS_HAT.get());
                        output.accept(ItemRegistry.SELENES_HAT.get());
                        output.accept(ItemRegistry.VICTORS_HAT.get());
                        output.accept(ItemRegistry.GLORIAS_HAT.get());

                        //Armors
                        output.accept(ItemRegistry.CHARIZARD_HELMET.get());
                        output.accept(ItemRegistry.CHARIZARD_CHESTPLATE.get());
                        output.accept(ItemRegistry.CHARIZARD_LEGGINGS.get());
                        output.accept(ItemRegistry.CHARIZARD_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_CHARIZARD_HELMET.get());
                        output.accept(ItemRegistry.SHINY_CHARIZARD_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_CHARIZARD_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_CHARIZARD_BOOTS.get());

                        output.accept(ItemRegistry.SQUIRTLE_GLASSES.get());

                        output.accept(ItemRegistry.BLAZIKEN_HELMET.get());
                        output.accept(ItemRegistry.BLAZIKEN_CHESTPLATE.get());
                        output.accept(ItemRegistry.BLAZIKEN_LEGGINGS.get());
                        output.accept(ItemRegistry.BLAZIKEN_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_BLAZIKEN_HELMET.get());
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_BOOTS.get());

                        output.accept(ItemRegistry.CORVIKNIGHT_HELMET.get());
                        output.accept(ItemRegistry.CORVIKNIGHT_CHESTPLATE.get());
                        output.accept(ItemRegistry.CORVIKNIGHT_LEGGINGS.get());
                        output.accept(ItemRegistry.CORVIKNIGHT_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_HELMET.get());
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_BOOTS.get());

                        output.accept(ItemRegistry.TORTERRA_HELMET.get());
                        output.accept(ItemRegistry.TORTERRA_CHESTPLATE.get());
                        output.accept(ItemRegistry.TORTERRA_LEGGINGS.get());
                        output.accept(ItemRegistry.TORTERRA_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_TORTERRA_HELMET.get());
                        output.accept(ItemRegistry.SHINY_TORTERRA_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_TORTERRA_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_TORTERRA_BOOTS.get());

                        output.accept(ItemRegistry.ARMAROUGE_HELMET.get());
                        output.accept(ItemRegistry.ARMAROUGE_CHESTPLATE.get());
                        output.accept(ItemRegistry.ARMAROUGE_LEGGINGS.get());
                        output.accept(ItemRegistry.ARMAROUGE_BOOTS.get());

                        output.accept(ItemRegistry.CERULEDGE_HELMET.get());
                        output.accept(ItemRegistry.CERULEDGE_CHESTPLATE.get());
                        output.accept(ItemRegistry.CERULEDGE_LEGGINGS.get());
                        output.accept(ItemRegistry.CERULEDGE_BOOTS.get());

                        output.accept(ItemRegistry.HAXORUS_HELMET.get());
                        output.accept(ItemRegistry.HAXORUS_CHESTPLATE.get());
                        output.accept(ItemRegistry.HAXORUS_LEGGINGS.get());
                        output.accept(ItemRegistry.HAXORUS_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_HAXORUS_HELMET.get());
                        output.accept(ItemRegistry.SHINY_HAXORUS_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_HAXORUS_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_HAXORUS_BOOTS.get());

                        output.accept(ItemRegistry.EEVEE_HELMET.get());
                        output.accept(ItemRegistry.EEVEE_CHESTPLATE.get());
                        output.accept(ItemRegistry.EEVEE_LEGGINGS.get());
                        output.accept(ItemRegistry.EEVEE_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_EEVEE_HELMET.get());
                        output.accept(ItemRegistry.SHINY_EEVEE_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_EEVEE_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_EEVEE_BOOTS.get());

                        output.accept(ItemRegistry.ESPEON_HELMET.get());
                        output.accept(ItemRegistry.ESPEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.ESPEON_LEGGINGS.get());
                        output.accept(ItemRegistry.ESPEON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_ESPEON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_ESPEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_ESPEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_ESPEON_BOOTS.get());

                        output.accept(ItemRegistry.FLAREON_HELMET.get());
                        output.accept(ItemRegistry.FLAREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.FLAREON_LEGGINGS.get());
                        output.accept(ItemRegistry.FLAREON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_FLAREON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_FLAREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_FLAREON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_FLAREON_BOOTS.get());

                        output.accept(ItemRegistry.GLACEON_HELMET.get());
                        output.accept(ItemRegistry.GLACEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.GLACEON_LEGGINGS.get());
                        output.accept(ItemRegistry.GLACEON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_GLACEON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_GLACEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_GLACEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_GLACEON_BOOTS.get());

                        output.accept(ItemRegistry.JOLTEON_HELMET.get());
                        output.accept(ItemRegistry.JOLTEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.JOLTEON_LEGGINGS.get());
                        output.accept(ItemRegistry.JOLTEON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_JOLTEON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_JOLTEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_JOLTEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_JOLTEON_BOOTS.get());

                        output.accept(ItemRegistry.LEAFEON_HELMET.get());
                        output.accept(ItemRegistry.LEAFEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.LEAFEON_LEGGINGS.get());
                        output.accept(ItemRegistry.LEAFEON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_LEAFEON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_LEAFEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_LEAFEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_LEAFEON_BOOTS.get());

                        output.accept(ItemRegistry.SYLVEON_HELMET.get());
                        output.accept(ItemRegistry.SYLVEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SYLVEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SYLVEON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_SYLVEON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_SYLVEON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_SYLVEON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_SYLVEON_BOOTS.get());

                        output.accept(ItemRegistry.UMBREON_HELMET.get());
                        output.accept(ItemRegistry.UMBREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.UMBREON_LEGGINGS.get());
                        output.accept(ItemRegistry.UMBREON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_UMBREON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_UMBREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_UMBREON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_UMBREON_BOOTS.get());

                        output.accept(ItemRegistry.VAPOREON_HELMET.get());
                        output.accept(ItemRegistry.VAPOREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.VAPOREON_LEGGINGS.get());
                        output.accept(ItemRegistry.VAPOREON_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_VAPOREON_HELMET.get());
                        output.accept(ItemRegistry.SHINY_VAPOREON_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_VAPOREON_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_VAPOREON_BOOTS.get());

                        output.accept(ItemRegistry.RAYQUAZA_HELMET.get());
                        output.accept(ItemRegistry.RAYQUAZA_CHESTPLATE.get());
                        output.accept(ItemRegistry.RAYQUAZA_LEGGINGS.get());
                        output.accept(ItemRegistry.RAYQUAZA_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_RAYQUAZA_HELMET.get());
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_BOOTS.get());

                        output.accept(ItemRegistry.METAGROSS_HELMET.get());
                        output.accept(ItemRegistry.METAGROSS_CHESTPLATE.get());
                        output.accept(ItemRegistry.METAGROSS_LEGGINGS.get());
                        output.accept(ItemRegistry.METAGROSS_BOOTS.get());

                        output.accept(ItemRegistry.SHINY_METAGROSS_HELMET.get());
                        output.accept(ItemRegistry.SHINY_METAGROSS_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_METAGROSS_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_METAGROSS_BOOTS.get());

                        output.accept(ItemRegistry.GALARIAN_WEEZING_HAT.get());

                        output.accept(ItemRegistry.SLOWKING_CROWN.get());

                        output.accept(ItemRegistry.GRENINJA_SCARF.get());
                    })
                    .build());

    public static void init() {}
}