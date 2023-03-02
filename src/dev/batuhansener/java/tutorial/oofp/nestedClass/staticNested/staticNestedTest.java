package dev.batuhansener.java.tutorial.oofp.nestedClass.staticNested;

public class staticNestedTest {
    public static void main(String[] args) {

        citizen.nationality turkey = new citizen.nationality("Turkey","TC");

        citizen citizen = new citizen("batuhan", 123456789, turkey);

        System.out.println(citizen.toString());
    }
}
