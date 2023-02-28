package dev.batuhansener.java.tutorial.oofp.odev.polymorphism;

import java.util.Date;

public class VocationalStudent extends Student{

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study(){
        System.out.println("Vocational student calısıyor...");
    }

    @Override
    public void register(){

    }
}
