package dev.batuhansener.java.tutorial.io.file;

import java.io.File;
import java.util.Iterator;

public class FileClassTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\batuhan\\Desktop\\FileMkdir");
        boolean exists = file.exists();

        System.out.println(file);
        if (!exists){
            boolean mkdir = file.mkdir();
        }
        System.out.println(file.length());
        boolean success = file.renameTo(new File("C:\\Users\\batuhan\\Desktop\\FileMkdirTest"));

        int i = 0;
        while(i<5){
            File subfiles = new File("C:\\Users\\batuhan\\Desktop\\FileMkdirTest\\"+i);
            i++;
            subfiles.mkdir();
        }

        File testFile = new File("C:\\Users\\batuhan\\Desktop\\FileMkdirTest");
        System.out.println();

        File files[] = testFile.listFiles();
        for (File f : files){
            System.out.println(f);
        }

        File deleteFile = new File("C:\\Users\\batuhan\\Desktop\\FileMkdirTest\\1");
        boolean deleted = deleteFile.delete();
        System.out.println(deleted);

    }
}
