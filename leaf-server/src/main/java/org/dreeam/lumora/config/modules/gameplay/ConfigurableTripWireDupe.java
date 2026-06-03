package org.dreeam.lumora.config.modules.gameplay;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

public class ConfigurableTripWireDupe extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.GAMEPLAY.getBaseKeyName();
    }

    public static boolean enabled = false;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath() + ".allow-tripwire-dupe", enabled);
    }
}
