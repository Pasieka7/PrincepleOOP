package ksy.javatest.OOP;

import ksy.javatest.OOP.Books.BaseBook;
import ksy.javatest.OOP.Books.Book;

public class Main {

    public static void main(String[] args) {

        BaseBook book = new Book();         //полиморфизм

        book.open();
        book.close();

    }
}
