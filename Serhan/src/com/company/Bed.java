package com.company;

public class Bed extends Furniture implements PlaceToWallow {
    Human human;
    public Bed(String name) {
        super(name);
    }

    @Override
    public Human getHuman() {
        System.out.println(human.name + " вскочил");
        return human;
    }

    @Override
    public void takeHuman(Human human) {
        System.out.println(human.name + " лежит в " + name);
        this.human = human;
    }
}
