package org.bukkit.material;

import org.bukkit.StoneType;
import org.bukkit.Material;

/**
 * Represents the different types of stone.
 */
public class Stone extends MaterialData {

    public Stone() {
        super(Material.STONE);
    }

    /**
     * @param stone type
     */
    public Stone(StoneType stone) {
        this();
        setType(stone);
    }

    /**
     * @param type type
     * @deprecated Magic value
     */
    @Deprecated
    public Stone(final int type) {
        super(type);
    }

    /**
     * @param type type
     */
    public Stone(final Material type) {
        super(type);
    }

    /**
     * @param type type
     * @param data data
     * @deprecated Magic value
     */
    @Deprecated
    public Stone(final int type, final byte data) {
        super(type, data);
    }

    /**
     * @param type type
     * @param data data
     * @deprecated Magic value
     */
    @Deprecated
    public Stone(final Material type, final byte data) {
        super(type, data);
    }

    /**
     * Gets the current type of this stone.
     *
     * @return StoneType of this stone
     */
    public StoneType getType() {
        return StoneType.getByData(getData());
    }

    /**
     * Sets the type of this stone.
     *
     * @param stone New type of this stone
     */
    public void setType(StoneType stone) {
        setData(stone.getData());
    }

    @Override
    public String toString() {
        return getType() + " " + super.toString();
    }

    @Override
    public Stone clone() {
        return (Stone) super.clone();
    }
}
