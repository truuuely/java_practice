package com.codeit.practice2.run;

import com.codeit.practice2.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("책2", "민음사", "지은이");
        Book book3 = new Book("책3", "출판사", "지은삼", 15000, 10.0);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
