package dev.batuhansener.java.tutorial.exeptions;

public class AssertTest {
    static RuntimeException IllegalEntry = new RuntimeException("negatif giremezsiniz");

    public static void main(String[] args) {

        System.out.println(sqrt2(5));
    }

    static double sqrt(int number){
        double lastVal;
        return lastVal = Math.sqrt(number);
//        if (number<0){
//            throw IllegalEntry;
//        }else{
//            return lastVal = Math.sqrt(number);
//        }
    }

    static double sqrt2(int number){
        assert number>0: "negatifffffffffffffff";
        return Math.sqrt(number);
    }
}
