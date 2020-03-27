package com.company;

public class Room {

    public void toss(Human human) {
        System.out.println(human.name + " подбросился");
        System.out.println(human.name + " ударился о потолок");
        System.out.println(human.name + " упал на пол");
    }

    public void blowOff(Human human) {
        System.out.println(human.name + " подхватило ветром");
    }

    public void hitTheWall(Human human) {
        System.out.println(human.name + " ударился об стену");
    }
}
