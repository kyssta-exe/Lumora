package org.dreeam.lumora.config.modules.opt;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

public class SkipAIForNonAwareMob extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.PERF.getBaseKeyName();
    }

    public static boolean enabled = true;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath() + ".skip-ai-for-non-aware-mob", enabled);
    }
}
