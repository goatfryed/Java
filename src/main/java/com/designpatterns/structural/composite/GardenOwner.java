package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GardenOwner {

    private final List<String> garden = new ArrayList<>();

    public void accept(Gardener gardener) {
        gardener.maintainGarden(garden);
    }

    public List<String> getGarden() {
        return garden;
    }
}
