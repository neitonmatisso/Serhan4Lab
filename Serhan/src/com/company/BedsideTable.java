package com.company;

public class BedsideTable extends Furniture implements OpenClose {
    public BedsideTable(String name) {
        super(name);
    }
    private boolean isOpen = false;
    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }
}
