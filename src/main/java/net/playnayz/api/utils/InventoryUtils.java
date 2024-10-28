package net.playnayz.api.utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class InventoryUtils {

    public static Inventory createInventory(String title, int size) {
        return Bukkit.createInventory(null, size, title);
    }
}
