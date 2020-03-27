package com.company;

public class Human {
    String name;

    private Furniture furniture;

    public void takeFurniture(Furniture furniture) {
        this.furniture = furniture;
        System.out.println(name + " взял " + furniture.name);
    }

    public  Furniture dropFurniture(Chair chair) {
        System.out.println(name + " выкинул " + furniture.name);
        return furniture;
    }

    public Human(String name) {
        this.name = name;
    }

    private Mood mood;

    public void setMood(Mood mood) {
        this.mood = mood;
        System.out.println(name + " чувствует " + mood);
    }

    private  boolean isSleep = true;
    private Thing things[] = new Thing[10];
    private int thingIndex = 0;
    public void clean(Furniture furniture){
        furniture.cleanness = true;
        System.out.println(name + " почистил " + furniture.name);
    };
    public void takeThing(Furniture furniture) throws hasNotThingException{
        things[thingIndex] = furniture.getThing();
        System.out.println(name + " взял " + things[thingIndex].name);
        thingIndex++;
    }
    public Thing getThing() {
        thingIndex--;
        System.out.println(name + " положил " + things[thingIndex].name);
        return things[thingIndex];
    }

    public void open(OpenClose furniture) {
        furniture.open();
        System.out.println(name + " открыл");
    };
    public void close(OpenClose furniture) {
        furniture.close();
        System.out.println(name + " закрыл");
    };

    public void stoop () {
        System.out.println(name + " нагнулся");
        setMood(mood.BAD);
    }

    public void wakeUp() {
        isSleep = false;
        System.out.println(name + " проснулся");
    }

    public void wallow(PlaceToWallow furniture) {
        System.out.println(name + " лежит");
    }

    public void doExercises() {
        for (int i =1; i < 4; i++)
            System.out.println(name + " делает " + i + " упражнение");
    }

    public void washFace() {
        System.out.println(name + " умыл лицо");
    }

    public void lookAround() {
        System.out.println(name + " огляделся");
    }

    public void straighten () {
        System.out.println(name + " выпрямился");
    }

    public void broke (Furniture furniture) {
        System.out.println(name + " ударил " + furniture.name + ", он(а) сломан(а)");
    }

    public void hit (Furniture furniture) {
        System.out.println(name + " ударил " + furniture.name + ", он(а) поврежден(а), содержимое разлетелось по комнате");
    }

}
