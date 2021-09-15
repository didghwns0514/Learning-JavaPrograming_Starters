package com.main.Chapter2.interfaceEx.bookshelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getShelfItemSize() {

        return shelf.size();
    }
}
