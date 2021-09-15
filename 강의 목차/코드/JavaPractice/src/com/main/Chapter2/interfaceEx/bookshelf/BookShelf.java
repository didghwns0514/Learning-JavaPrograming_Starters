package com.main.Chapter2.interfaceEx.bookshelf;

public class BookShelf extends Shelf implements Queue {


    public BookShelf() {
        super();

    }

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        if (shelf.isEmpty()) {
            return "IsEmpty";
        } else
            return shelf.remove(0);
    }


    @Override
    public int getBooksSize() {
        return getShelfItemSize();
    }
}
