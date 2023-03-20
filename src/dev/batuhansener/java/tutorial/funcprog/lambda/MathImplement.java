package dev.batuhansener.java.tutorial.funcprog.lambda;

public class MathImplement {

    int i = 5;

    public static void main(String[] args) {

        System.out.println(doMath((double aa , double bb) -> {return aa+bb;},5,10));

        System.out.println(doMath((double aa, double bb)->{return aa*bb;},50,100));

        MathImplement member = new MathImplement();

        //func local variableları değiştiremez ancak member variableları değiştirebilir örnek...
        Math matematik = (a, b) -> {
//            i++; yanlış
            member.i++;
//            this.dmethod; yanlış this şu an main'i gösteriyor. scope dışında matematik.dmethod yapabiliriz.
//            return i; yanlış
//            return x++; yanlış ulaşabilir ancak değiştiremez
            return member.i;
        };

        doMath(matematik,5,100);
    }

    static double doMath(Math math, double x, double y){
        return math.calculate(x, y);
    }
}

@FunctionalInterface
interface Math{
    int x = 5; //public static final

    default void dMethod(){
        System.out.println("dmethod");
    }

    double calculate(double a, double b);
}