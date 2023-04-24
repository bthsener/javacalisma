package dev.batuhansener.java.tutorial.networking.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class httpclientTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "http://localhost:8080/jax-rs/app/hello";

        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode()+" "+response.body());
    }
}
