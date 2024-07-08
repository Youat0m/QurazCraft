package com.youat0m.quarz;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuarzCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "QuarzCraft");

        BlastingRecipe recipe = new BlastingRecipe(key, new ItemStack(Material.QUARTZ), Material.DIORITE, 1, 60);
        getServer().addRecipe(recipe);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
