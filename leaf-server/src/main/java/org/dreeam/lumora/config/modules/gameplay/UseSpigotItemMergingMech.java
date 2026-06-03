package org.dreeam.lumora.config.modules.gameplay;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

public class UseSpigotItemMergingMech extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.GAMEPLAY.getBaseKeyName() + ".use-spigot-item-merging-mechanism";
    }

    public static boolean enabled = false;

    @Override
    public void onLoaded() {
        enabled = config.getBoolean(getBasePath(), enabled);
    }
}
