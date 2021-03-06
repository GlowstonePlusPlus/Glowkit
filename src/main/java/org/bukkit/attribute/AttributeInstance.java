package org.bukkit.attribute;

import java.util.Collection;

/**
 * Represents a mutable instance of an attribute and its associated modifiers
 * and values.
 */
public interface AttributeInstance {

    /**
     * The attribute pertaining to this instance.
     *
     * @return the attribute
     */
    Attribute getAttribute();

    /**
     * Base value of this instance before modifiers are applied.
     *
     * @return base value
     */
    double getBaseValue();

    /**
     * Set the base value of this instance.
     *
     * @param value new base value
     */
    void setBaseValue(double value);

    /**
     * Get all modifiers present on this instance.
     *
     * @return a copied collection of all modifiers
     */
    Collection<AttributeModifier> getModifiers();

    /**
     * Add a modifier to this instance.
     *
     * @param modifier to add
     */
    void addModifier(AttributeModifier modifier);

    /**
     * Remove a modifier from this instance.
     *
     * @param modifier to remove
     */
    void removeModifier(AttributeModifier modifier);

    /**
     * Get the value of this instance after all associated modifiers have been
     * applied.
     *
     * @return the total attribute value
     */
    double getValue();
}
