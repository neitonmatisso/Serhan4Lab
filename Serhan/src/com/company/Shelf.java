package com.company;

public class Shelf {
    private int thingIndex;
    Thing[] things = new Thing[10];
    public Thing getThing () {return null;};
    public void addThing(Thing thing) {
        things[thingIndex] = thing;
        thingIndex++;
    };
}
