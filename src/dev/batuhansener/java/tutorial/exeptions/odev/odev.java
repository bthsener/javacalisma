package dev.batuhansener.java.tutorial.exeptions.odev;

public class odev {
    public static void main(String[] args) {

        Employee calisan1 = new Employee("asdasd", 1);
        Employee calisan2 = new Engineer("ıoujıkmlk", 5);

        Secretary.paidSalary(calisan1);
        Secretary.paidSalary(calisan2);
    }
}
