package dev.batuhansener.java.tutorial.exeptions;

public class ThrowableTest {
//    static int[] dizi = new int[2];

    public static void main(String[] args){
//      ata2();


        System.out.println("crash vermeden önce");
        try{
            Do();
        }catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }
    }

    static void Do()  {
        Throwable throwable = new Throwable("Merhaba ben HATA!!!");



//        throwable.printStackTrace();
//        System.out.println();
//        deneme2(throwable);
    }

    static void deneme(Throwable throwable){
        StackTraceElement[] stackTraceElement = throwable.getStackTrace();
        for(StackTraceElement stackTraceElement1: stackTraceElement){
            System.out.println(stackTraceElement1.getMethodName());
        }
    }

    static void deneme2(Throwable throwable){
        deneme(throwable);
    }

//    static void ata(){
//        dizi[-1] = 0;
//    }
//
//    static void ata2(){
//        ata();
//    }
}
