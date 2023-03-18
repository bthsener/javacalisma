package dev.batuhansener.java.tutorial.classdesign.evelator;

public class RealEvelatorTest {
    public static void main(String[] args) {

        RealEvelator realEvelator = new RealEvelator();

        realEvelator.go(Floor.FOUR);
        realEvelator.go(Floor.ENTRANCE);
        realEvelator.go(Floor.THIRD);

    }
}
