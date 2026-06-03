package org.dreeam.lumora.async.world;

import org.dreeam.lumora.config.LumoraConfig;

import java.util.Locale;

public enum UnsafeReadPolicy {
    STRICT,
    BUFFERED,
    DISABLED;

    public static UnsafeReadPolicy fromString(String readPolicy) {
        try {
            return valueOf(readPolicy.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            LumoraConfig.LOGGER.warn("Invalid unsafe read policy: {}, falling back to {}.", readPolicy, DISABLED.toString());
            return DISABLED;
        }
    }
}
