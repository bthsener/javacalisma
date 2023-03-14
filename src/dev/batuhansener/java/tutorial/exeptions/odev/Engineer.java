package dev.batuhansener.java.tutorial.exeptions.odev;

public class Engineer extends Employee{

    public Engineer(String ad, int year){
        super(ad, year);
    }

    @Override
    public double getSalary(){
        return super.getSalary()+5000;
    }

    @Override
    public String toString(){
        return ad+" maas: "+ getSalary();
    }

    @Override
    public void work(){
        System.out.println("Engineer calisiyor...");
    }
}
