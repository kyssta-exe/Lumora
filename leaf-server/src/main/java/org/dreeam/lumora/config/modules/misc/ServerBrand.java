package org.dreeam.lumora.config.modules.misc;

import org.dreeam.lumora.config.ConfigModules;
import org.dreeam.lumora.config.EnumConfigCategory;

public class ServerBrand extends ConfigModules {

    public String getBasePath() {
        return EnumConfigCategory.MISC.getBaseKeyName() + ".rebrand";
    }

    public static String serverModName = io.papermc.paper.ServerBuildInfo.buildInfo().brandName();
    public static String serverGUIName = io.papermc.paper.ServerBuildInfo.buildInfo().brandName() + " Console";

    @Override
    public void onLoaded() {
        serverModName = config.getString(getBasePath() + ".server-mod-name", serverModName);
        serverGUIName = config.getString(getBasePath() + ".server-gui-name", serverGUIName);
    }
}
