package org.bukkit.inventory;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Represents a smelting recipe.
 */
public class FurnaceRecipe implements Recipe {
    private ItemStack output;
    private ItemStack ingredient;
    private float xp;

    /**
     * Create a furnace recipe to craft the specified ItemStack.
     *
     * @param result The item you want the recipe to create.
     * @param source The input material.
     */
    public FurnaceRecipe(ItemStack result, Material source) {
        this(result, source, 0, 0);
    }

    /**
     * Create a furnace recipe to craft the specified ItemStack.
     *
     * @param result The item you want the recipe to create.
     * @param source The input material.
     */
    public FurnaceRecipe(ItemStack result, MaterialData source) {
        this(result, source.getItemType(), source.getData(), 0);
    }
    
    /**
     * Create a furnace recipe to craft the specified ItemStack.
     *
     * @param result The item you want the recipe to create.
     * @param source The input material.
     * @param xp The xp
     */
    public FurnaceRecipe(ItemStack result, MaterialData source, float xp) {
        this(result, source.getItemType(), source.getData(), xp);
    }

    /**
     * Create a furnace recipe to craft the specified ItemStack.
     *
     * @param result The item you want the recipe to create.
     * @param source The input material.
     * @param data The data value. (Note: This is currently ignored by the
     *     CraftBukkit server.)
     * @deprecated Magic value
     */
    @Deprecated
    public FurnaceRecipe(ItemStack result, Material source, int data) {
        this(result, source, data, 0);
    }
    
    /**
     * Create a furnace recipe to craft the specified ItemStack.
     *
     * @param result The item you want the recipe to create.
     * @param source The input material.
     * @param data The data value. (Note: This is currently ignored by the
     *     CraftBukkit server.)
     * @param xp The xp
     * @deprecated Magic value
     */
    @Deprecated
    public FurnaceRecipe(ItemStack result, Material source, int data, float xp) {
        this.output = new ItemStack(result);
        this.ingredient = new ItemStack(source, 1, (short) data);
        this.xp = xp;
    }

    /**
     * Sets the input of this furnace recipe.
     *
     * @param input The input material.
     * @return The changed recipe, so you can chain calls.
     */
    public FurnaceRecipe setInput(MaterialData input) {
        return setInput(input.getItemType(), input.getData());
    }

    /**
     * Sets the input of this furnace recipe.
     *
     * @param input The input material.
     * @return The changed recipe, so you can chain calls.
     */
    public FurnaceRecipe setInput(Material input) {
        return setInput(input, 0);
    }

    /**
     * Sets the input of this furnace recipe.
     *
     * @param input The input material.
     * @param data The data value. (Note: This is currently ignored by the
     *     CraftBukkit server.)
     * @return The changed recipe, so you can chain calls.
     * @deprecated Magic value
     */
    @Deprecated
    public FurnaceRecipe setInput(Material input, int data) {
        this.ingredient = new ItemStack(input, 1, (short) data);
        return this;
    }
    
    /**
     * Sets the xp of this furnace recipe.
     * 
     * @param xp The xp
     */
    public void setXp(float xp) {
        this.xp = xp;
    }

    /**
     * Get the input material.
     *
     * @return The input material.
     */
    public ItemStack getInput() {
        return this.ingredient.clone();
    }

    /**
     * Get the result of this recipe.
     *
     * @return The resulting stack.
     */
    public ItemStack getResult() {
        return output.clone();
    }

    /**
     * Get the xp of this recipe
     * 
     * @return The xp
     */
    public float getXp() {
        return xp;
    }
}
