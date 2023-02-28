package dev.batuhansener.java.tutorial.oofp.odev.polymorphism;

import java.util.Date;

public class Student {
    protected int no;
    protected String name;
    protected int year;
    protected Date dob;
    protected String major;

    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public void study(){
        System.out.println("ogrenci calısıyor...");
    }


    public void register(){

    }

    @Override
    public String toString() {
        return "Student" + '\n' +
                "no=" + no + '\n' +
                ", name='" + name + '\n' +
                ", year=" + year + '\n' +
                ", dob=" + dob + '\n' +
                ", major='" + major + '\n';
    }


}
