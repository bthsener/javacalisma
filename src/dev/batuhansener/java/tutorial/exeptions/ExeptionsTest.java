package dev.batuhansener.java.tutorial.exeptions;

public class ExeptionsTest {
    public static void main(String[] args) {
        int[] deneme = new int[5];

        try {
            Do2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("sıkıntı yok");
        }

        try{
            deneme[-1] = 5;
            System.out.println("yazdi");
        }catch (IndexOutOfBoundsException e){
            System.out.println("HATAAAAAAAAA!"+ e.getMessage());
        }
    }

    static void Do() throws Exception {
        Exception alo = new Exception("ALOOOOOOOOO");

        throw alo;
    }

    static void Do2() throws Exception{
        Do();
    }
}
