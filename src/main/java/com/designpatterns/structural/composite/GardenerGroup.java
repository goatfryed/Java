package com.designpatterns.structural.composite;

import java.util.List;

public class GardenerGroup implements Gardener {

    private final Gardener[] gardeners;

    public GardenerGroup(Gardener[] gardeners) {

        this.gardeners = gardeners;
    }

    @Override
    public void maintainGarden(List<String> garden) {
        for (Gardener gardener : gardeners) {
            gardener.maintainGarden(garden);
        }
    }
}
