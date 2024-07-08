package com.youat0m.quarz;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuarzCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "QuarzCraft");

        BlastingRecipe recipe = new BlastingRecipe(key, new ItemStack(Material.QUARTZ), Material.DIORITE, 1, 60);
        ShapelessRecipe recipe1 = new ShapelessRecipe(new NamespacedKey(this, "ChernitCraft"),
                new ItemStack(Material.BLACKSTONE, 3));
        recipe1.addIngredient(2, Material.COBBLESTONE);
        recipe1.addIngredient(2, Material.COAL);
        getServer().addRecipe(recipe);
        getServer().addRecipe(recipe1);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
