package dev.batuhansener.java.tutorial.funcprog.functions;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.function.BinaryOperator;

public class GreaterNumberPages {
    public static void main(String[] args) {

        Book book1 = new Book(50,"book1");
        Book book2 = new Book(130,"book2");

        Comparator<Book> comparator = (b1, b2) -> b1.pages-b2.pages;

//        BinaryOperator<Book> maxPageOperator = BinaryOperator.maxBy(comparator); aşağıdaki impl. sahip
        BinaryOperator<Book> binaryOperator = (b1, b2) -> comparator.compare(b1, b2) >= 0 ? b1 : b2;

//        System.out.println(maxPageOperator.apply(book1,book2));
        System.out.println(binaryOperator.apply(book1,book2));
//        Collections collections;
//        Collections.sort(book1,comparator);
    }
}

class Book{
    int pages;
    String name;

    public Book(int pages, String name){
        this.pages = pages;
        this.name = name;
    }

    @Override
    public String toString(){
        return name+"\n";
    }
}
