package com.main.Chapter3.objectEx;


class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        String tmp = "";
        tmp += "title = " + title + '\n';
        tmp += "author = " + author;
        return tmp;
    }
}


public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("두잇자바", "은종님");
        System.out.println(book);

        String str = new String("Test");
        System.out.println(str);
    }

}
