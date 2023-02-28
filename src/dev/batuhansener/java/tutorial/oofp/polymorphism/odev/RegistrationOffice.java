package dev.batuhansener.java.tutorial.oofp.polymorphism.odev;

import java.util.Date;

public class RegistrationOffice {

    public static Student getAStudent(){
        Student a = null;
        Date date = new Date();

        int x = 3;

        switch (x){
            case 1:
                a = new GraduateStudent(9142,"batuhan",2020, date,"ceng","a");
                break;
            case 2:
                a = new MasterStudent(9142,"ali",2018, date,"civil","b");
                break;
            case 3:
                a = new VocationalStudent(9142,"mehmet",2019, date,"psy");
                break;
            case 4:
                a = new Student(9142,"sener",2020, date,"ceng");
                break;
        }

        return a;
    }

    public static void registerStudent(Student student){
        if (student instanceof MasterStudent){
            MasterStudent masterStudent = (MasterStudent) student;
            masterStudent.writeThesis();
            masterStudent.register();
        }else if (student instanceof GraduateStudent){
            GraduateStudent graduateStudent = (GraduateStudent) student;
            graduateStudent.writeThesis();
            graduateStudent.register();
        }else if (student instanceof VocationalStudent){
            VocationalStudent vocationalStudent = (VocationalStudent) student;
            vocationalStudent.register();
        }else if(student instanceof Student){
            Student studentt = student;
            studentt.register();
        }
    }

}
