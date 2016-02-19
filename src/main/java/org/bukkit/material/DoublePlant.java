package org.bukkit.material;

import org.bukkit.DoublePlantSpecies;
import org.bukkit.Material;

/**
 * Represents the different types of double plants.
 */
public class DoublePlant extends MaterialData {

    public DoublePlant() {
        super(Material.DOUBLE_PLANT);
    }

    /**
     * @param species type
     */
    public DoublePlant(DoublePlantSpecies species) {
        this();
        setSpecies(species);
    }

    /**
     * @param type type
     * @deprecated Magic value
     */
    @Deprecated
    public DoublePlant(final int type) {
        super(type);
    }

    /**
     * @param type type
     */
    public DoublePlant(final Material type) {
        super(type);
    }

    /**
     * @param type type
     * @param data data
     * @deprecated Magic value
     */
    @Deprecated
    public DoublePlant(final int type, final byte data) {
        super(type, data);
    }

    /**
     * @param type type
     * @param data data
     * @deprecated Magic value
     */
    @Deprecated
    public DoublePlant(final Material type, final byte data) {
        super(type, data);
    }

    /**
     * Gets the current species of this double plant.
     *
     * @return The DoublePlantSpecies of this double plant
     */
    public DoublePlantSpecies getSpecies() {
        return DoublePlantSpecies.getByData(getData());
    }

    /**
     * Sets the species of this double plant.
     *
     * @param species The new species of this double plant
     */
    public void setSpecies(DoublePlantSpecies species) {
        setData(species.getData());
    }

    @Override
    public String toString() {
        return getSpecies() + " " + super.toString();
    }

    @Override
    public DoublePlant clone() {
        return (DoublePlant) super.clone();
    }
}
