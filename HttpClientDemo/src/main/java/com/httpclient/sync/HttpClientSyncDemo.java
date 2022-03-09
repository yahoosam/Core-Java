package com.httpclient.sync;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientSyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest builder = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Books"))
                .GET().build();
        HttpResponse<String> response = httpClient.send(builder, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
