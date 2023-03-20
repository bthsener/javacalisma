package dev.batuhansener.java.tutorial.funcprog.lambda;

import java.util.*;

public class comparatorExample {
    public static void main(String[] args) {

        Comparator<String> comparator = (String a, String b) -> {
            return a.compareToIgnoreCase(b);
        };

        compareStrings(comparator, "batuhan", "sener");

        Collection<String> collection = new HashSet<>();
        collection.add("sener");
        collection.add("batuhan");

    }

    public static void compareStrings(Comparator<String> comparator, String a, String b){
        System.out.println(comparator.compare(a, b));
    }
}

