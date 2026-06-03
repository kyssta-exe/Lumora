package org.dreeam.lumora.config.modules.gameplay;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

/**
 * Lumora Vanilla Fidelity Mode
 *
 * When enabled, disables all optimizations that could alter vanilla game behavior.
 * This includes:
 * - Mob spawning changes (uses pure vanilla spawning algorithm)
 * - TNT persistence (saves primed TNT entities like vanilla)
 * - Falling block persistence (saves falling blocks like vanilla)
 * - Tripwire dupe prevention (allows vanilla tripwire behavior)
 * - Mob despawn changes (uses vanilla despawn timer)
 * - Entity collision changes (uses vanilla collision)
 *
 * Use this if you need 100% vanilla compatibility for:
 * - Competitive redstone
 * - Vanilla-accurate mob farms
 * - Technical Minecraft servers
 * - Map makers who depend on exact vanilla behavior
 *
 * Note: Pure performance optimizations (memory, caching, async chunk sending)
 * are still active in fidelity mode since they don't change game behavior.
 */
public class VanillaFidelityMode extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.GAMEPLAY.getBaseKeyName();
    }

    public static boolean enabled = false;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath() + ".vanilla-fidelity-mode", enabled);

        if (enabled) {
            // Override behavior-altering configs to vanilla defaults
            org.dreeam.lumora.config.modules.opt.DontSaveEntity.dontSavePrimedTNT = false;
            org.dreeam.lumora.config.modules.opt.DontSaveEntity.dontSaveFallingBlock = false;
            org.dreeam.lumora.config.modules.gameplay.ConfigurableTripWireDupe.enabled = false;
            org.dreeam.lumora.config.modules.gameplay.SpawnerSettings.enabled = false;
            org.dreeam.lumora.config.modules.gameplay.OnlyPlayerPushable.enabled = false;
            org.dreeam.lumora.config.modules.gameplay.VanillaHopper.enabled = false;
            org.dreeam.lumora.config.modules.opt.OptimizeDespawn.enabled = false;
            org.dreeam.lumora.config.modules.opt.OptimizeMobSpawning.enabled = false;
            org.dreeam.lumora.config.modules.opt.OptimizeRandomTick.enabled = false;
            org.dreeam.lumora.config.modules.opt.DynamicActivationofBrain.enabled = false;
            org.dreeam.lumora.config.modules.gameplay.Knockback.snowballCanKnockback = false;
            org.dreeam.lumora.config.modules.gameplay.Knockback.eggCanKnockback = false;
            org.dreeam.lumora.config.modules.gameplay.Knockback.oldBlastProtectionKnockbackBehavior = false;

            org.apache.logging.log4j.LogManager.getLogger("Lumora").info("[Lumora] Vanilla Fidelity Mode enabled — behavior-altering optimizations disabled.");
        }
    }
}
