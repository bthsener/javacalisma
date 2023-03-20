package dev.batuhansener.java.tutorial.funcprog.lambda;

public class Selamlama {
    public static void main(String[] args) {

        selam((String kim)-> System.out.println("hello "+ kim), "batuhan");
        selam((String kim)-> System.out.println("selam "+ kim), "batuhan");
        selam((String kim)-> System.out.println("Cześć "+ kim), "batuhan");

    }

    static void selam(SelamlamaInterface selamlamaInterface, String kimi){
        selamlamaInterface.selamla(kimi);
    }
}

@FunctionalInterface
interface SelamlamaInterface{
    void selamla(String kimi);
}
