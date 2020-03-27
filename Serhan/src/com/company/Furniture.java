package com.company;

abstract class Furniture {
    public Furniture (String name) {
        this.name = name;
    }
    String name;
    Thing[] things = new Thing[10];
    int thingIndex = 0;
    int size;
    boolean cleanness = false;

    public void putThing(Thing thing) {
        things[thingIndex] = thing;
        thingIndex++;
    }

    public Thing getThing() throws hasNotThingException {
        thingIndex--;
        if (thingIndex<0) throw new hasNotThingException("в " + name + " нет вещей");
        return things[thingIndex];
    }


}
