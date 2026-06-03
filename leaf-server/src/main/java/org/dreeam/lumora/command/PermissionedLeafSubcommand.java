package org.dreeam.lumora.command;

import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public abstract class PermissionedLumoraSubcommand implements LumoraSubcommand {

    private final Permission permission;

    protected PermissionedLumoraSubcommand(Permission permission) {
        this.permission = permission;
    }

    protected PermissionedLumoraSubcommand(String permission, PermissionDefault permissionDefault) {
        this(new Permission(permission, permissionDefault));
    }

    @Override
    public boolean testPermission(CommandSender sender) {
        return sender.hasPermission(this.permission);
    }

    @Override
    public Permission getPermission() {
        return this.permission;
    }
}
