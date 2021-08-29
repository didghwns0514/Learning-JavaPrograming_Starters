package com.main.Chapter2.array;

public class BookArray {
    String bookName;
    String writer;

    public BookArray() {
        this("Dummy Book", "Dummy writer");
    }

    public BookArray(String bookName, String writer) {
        this.bookName = bookName;
        this.writer = writer;
    }

    public static void main(String[] args) {
        BookArray bookArray = new BookArray();
        bookArray.createNullArrayForBooks();
        bookArray.createBookArrayForBooks();
    }

    Book[] createNullArrayForBooks() {
        Book[] library = new Book[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.println("library[i] = " + library[i]);
        }

        return library;
    }

    Book[] createBookArrayForBooks() {
        Book[] library = new Book[5];

        for (int i = 0; i < 5; i++) {
            library[i] = new Book();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("library[i] = " + library[i]);
        }

        return library;
    }

}
