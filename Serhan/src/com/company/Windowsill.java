package com.company;

public class Windowsill extends Furniture implements PlaceToWallow {
    Human human;
    public Windowsill(String name) {
        super(name);
    }

    @Override
    public Human getHuman() {
        System.out.println(human.name + " вскочил");
        return human;
    }

    @Override
    public void takeHuman(Human human) {
        System.out.println(human + " лежит в " + name);
        this.human = human;
    }
}
