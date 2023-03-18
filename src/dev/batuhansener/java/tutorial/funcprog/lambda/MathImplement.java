package dev.batuhansener.java.tutorial.funcprog.lambda;

public class MathImplement {
    public static void main(String[] args) {

        System.out.println(doMath((double aa , double bb) -> {return aa+bb;},5,10));

        System.out.println(doMath((double aa, double bb)->{return aa*bb;},50,100));

    }

    static double doMath(Math math, double x, double y){
        return math.calculate(x, y);
    }
}

@FunctionalInterface
interface Math{
    double calculate(double a, double b);
}