package dev.batuhansener.java.tutorial.funcprog.functions;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.*;

public class functionExample {
    public static void main(String[] args) {


        //arguments T or T, U return boolean
        Predicate<Integer> predicate = num -> num % 2 == 0;
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1<num2;

        //arguments T return void
        Consumer<Integer> consumer = num -> System.out.println(num);

        //arguments none return T
        Supplier supplier = () -> "alooo";

        //arguments T return T
        UnaryOperator<Integer> unaryOperator = num -> num+1;

        //arguments (T, T) return T
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1+num2;

        Function<Integer, Integer> twice = k -> k*2;
        Function<Integer, Integer> square = k -> k*k;

        //andThen ilk önce twice daha sonra square -> bu tarafa doğru çalışır
        Function<Integer, Integer> twiceAndThenSquare = twice.andThen(square);

        //compose ilk önce square daha sonra twice <- bu tarafa doğru çalışır
        Function<Integer, Integer> squareAndThenTwice = twice.compose(square);

        consumer.accept(5);
        System.out.println(biPredicate.test(500,90));
        System.out.println(predicate.test(50));
        System.out.println(squareAndThenTwice.apply(5));

        Collection<Integer> collection = new HashSet<>();
        collection.add(5);
        collection.add(10);

//        collection.forEach(s -> System.out.println(s));
        collection.forEach(System.out::println);
    }
}
