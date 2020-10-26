package com.designpatterns.structural.composite;

import java.util.List;

public class SingleSkillGardener implements Gardener{

    private final String skill;

    public SingleSkillGardener(String skill) {
        this.skill = skill;
    }

    @Override
    public void maintainGarden(List<String> garden) {
        garden.add(skill);
    }
}
