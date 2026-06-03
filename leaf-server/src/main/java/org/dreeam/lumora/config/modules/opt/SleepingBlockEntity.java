package org.dreeam.lumora.config.modules.opt;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

public class SleepingBlockEntity extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.PERF.getBaseKeyName();
    }

    public static boolean enabled = false;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath() + ".sleeping-block-entity", enabled);
    }
}
