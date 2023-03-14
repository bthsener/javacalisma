package dev.batuhansener.java.tutorial.exeptions.odev;

public class Employee implements Worker{

    String ad;
    int year;
    static final int BASE_SALARY = 8500;


    public Employee(String ad, int year){
        this.ad = ad;
        this.year = year;
    }

    public double getSalary(){
        return BASE_SALARY * year;
    }

    @Override
    public String toString(){
        return ad+" maas: "+ getSalary();
    }

    @Override
    public void work(){
        System.out.println("Employee calisiyor...");
    }

}
