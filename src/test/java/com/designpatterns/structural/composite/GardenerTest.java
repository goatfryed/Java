package com.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class GardenerTest {

    @Test
    public void theOwnerCanAcceptMultipleGardenersWhenTreatedAsOne() {

        // the garden owner can manage only a single interact with a single gardener
        // the gardeners can only perform a single task
        // throw composition, we can perform multiple tasks with dedicated gardeners
        // while keeping the simple contract of the garden owner

        GardenOwner gardenOwner = new GardenOwner();

        Gardener gardener = new GardenerGroup(new Gardener[]{
            new SingleSkillGardener("beautiful roses"),
            new SingleSkillGardener("short cut grass"),
            new SingleSkillGardener("trimmed bushes"),
        });

        gardenOwner.accept(gardener);
        List<String> garden = gardenOwner.getGarden();

        assertArrayEquals(
            new Object[] {"beautiful roses", "short cut grass", "trimmed bushes"},
            garden.toArray()
        );
    }
}