package com.company;

public class Cupboard extends Furniture implements OpenClose {
    public Cupboard(String name) {
        super(name);
    }
    boolean isOpen = false;
    private int indexShelves = 0;
    Shelf[] shelves = new Shelf[10];
    public void addShelf(Shelf shelf) {
        shelves[indexShelves] = new Shelf();
        indexShelves++;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    public void close () {
        isOpen = false;
    }

}
