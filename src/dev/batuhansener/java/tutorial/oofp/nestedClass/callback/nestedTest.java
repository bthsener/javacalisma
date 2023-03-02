package dev.batuhansener.java.tutorial.oofp.nestedClass.callback;

public class nestedTest {
    public static void main(String[] args) {

//        DenemeClass class1 = new DenemeClass();

        DenemeInterface deneme = new DenemeInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

//        class1.dene(deneme);

        DenemeClass.dene(new DenemeInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello2");
            }
        });
    }
}
