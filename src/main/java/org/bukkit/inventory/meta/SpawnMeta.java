package org.bukkit.inventory.meta;

import org.bukkit.entity.EntityType;

public interface SpawnMeta extends ItemMeta {

    /**
     * Checks if an Entity type is attributed to the spawn egg.
     *
     * @return true if an Entity type is attributed to the spawn egg
     */
    boolean hasEntityType();

    /**
     * Gets the Entity type attributed to the spawn egg.
     *
     * @return The entity type attributed to the spawn egg
     */
    EntityType getEntityType();

    /**
     * Sets the Entity type attributed to the spawn egg.
     *
     * @param type The Entity type to attribute to the spawn egg
     */
    void setEntityType(EntityType type);

    SpawnMeta clone();
}
