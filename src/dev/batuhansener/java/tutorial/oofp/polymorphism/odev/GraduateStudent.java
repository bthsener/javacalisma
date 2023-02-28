package dev.batuhansener.java.tutorial.oofp.polymorphism.odev;

import java.util.Date;

public class GraduateStudent extends Student{

    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
    }

    @Override
    public void study(){
        System.out.println("Graduate student calısıyor...");
    }

    @Override
    public void register(){

    }

    public void writeThesis(){
        System.out.println("Graduate student tez yazdi...");
    }

}
