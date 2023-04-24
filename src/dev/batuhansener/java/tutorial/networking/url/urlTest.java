package dev.batuhansener.java.tutorial.networking.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class urlTest {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://localhost:8080/jax-rs/app/hello");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("accept", "text/plain");
            urlConnection.connect();

        //BufferedReader ile okuma
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            int i = urlConnection.getConnectTimeout();
            StringBuilder stringBuilder = new StringBuilder();
            String recource;
            while ((recource=bufferedReader.readLine())!=null) stringBuilder.append(recource);
            System.out.println(stringBuilder+"1");


        //InputStream ile okuma
            InputStream inputStream = urlConnection.getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            String recource2 = new String(bytes);
            System.out.println(recource2+"2");


//            System.out.println(i);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
