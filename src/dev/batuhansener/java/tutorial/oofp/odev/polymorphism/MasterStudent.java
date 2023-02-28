package dev.batuhansener.java.tutorial.oofp.odev.polymorphism;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor) {
        super(no, name, year, dob, major, advisor);
    }

    @Override
    public void study() {
        System.out.println("Master student calısıyor...");
    }

    @Override
    public void register() {

    }

    @Override
    public void writeThesis() {
        System.out.println("Master student tez yaziyor..");
    }

}
