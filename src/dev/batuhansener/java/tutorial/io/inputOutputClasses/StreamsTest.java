package dev.batuhansener.java.tutorial.io.inputOutputClasses;

import java.io.*;

public class StreamsTest {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\batuhan\\Desktop\\StreamsTest\\read.txt"));
            String i = reader.readLine();
            System.out.println(i);
            reader.close();
            FileWriter fileWriter = new FileWriter("C:\\Users\\batuhan\\Desktop\\StreamsTest\\read.txt");
            fileWriter.append("denemedeneme");
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
