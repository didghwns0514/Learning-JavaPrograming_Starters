package com.main.Chapter2.interfaceEx.bookshelf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BookshelfTest {

    @Test
    @DisplayName("Bookshelf test")
    void bookShelfTest() {

        BookShelf bookShelf = new BookShelf();
        ArrayList<String> books = new ArrayList<String>();
        books.add("book1");
        books.add("book2");
        books.add("book3");


        for (String book : books) {
            bookShelf.enQueue(book);
        }

        int i = 0;
        int totalNum = books.size();
        for (String book : books) {
            i += 1;
            Assertions.assertEquals(bookShelf.deQueue(), book);
            Assertions.assertEquals(bookShelf.getBooksSize(), totalNum - i);

        }

    }
}


