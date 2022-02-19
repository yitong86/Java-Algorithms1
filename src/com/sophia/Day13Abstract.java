package com.sophia;
import java.util.*;
public class Day13Abstract {

}


abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
class MyBook extends Book{
    private int price;
    public MyBook(String title,String author,int price){
        super(title, author);
        this.price = price;

    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
//    Sample Input
//
//    The following input from stdin is handled by the locked stub code in your editor:
//
//        The Alchemist
//        Paulo Coelho
//        248
//        Sample Output
//
//        The following output is printed by your display() method:
//
//        Title: The Alchemist
//        Author: Paulo Coelho
//        Price: 248