package org.dreeam.lumora.config.modules.opt;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;
import org.dreeam.lumora.config.annotations.Experimental;
import org.dreeam.lumora.util.LumoraConstants;

public class OptimizeDespawn extends ConfigModules {
    public String getBasePath() {
        return EnumConfigCategory.PERF.getBaseKeyName() + ".optimize-mob-despawn";
    }

    @Experimental
    public static boolean enabled = false;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath(), enabled);
        if (enabled) {
            if (!LumoraConstants.ENABLE_FMA) {
                LOGGER.info("NOTE: Recommend enabling FMA to work with optimize-mob-despawn.");
            }
        }
    }
}
