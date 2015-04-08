package org.bukkit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EffectTest {
    @Test
    public void getById() {
        /* TODO: re-enable these tests after adding names for all particles? are IDs still relevant?
        for (Effect effect : Effect.values()) {
            if (effect.getType() != Effect.Type.PARTICLE) {
                assertThat(Effect.getById(effect.getId()), is(effect));
            } else {
                assertThat(Effect.getByName(effect.getName()), is(effect));
            }
        }
        */
    }
}
