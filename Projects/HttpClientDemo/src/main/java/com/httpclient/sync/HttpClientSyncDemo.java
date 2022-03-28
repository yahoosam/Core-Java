package com.httpclient.sync;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpClientSyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        //GET request
        System.out.println("---------------------GET DEMO------------------------");
        HttpRequest builder = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Books"))
                .GET().build();
        HttpResponse<String> response = httpClient.send(builder, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        //System.out.println(response.body());

        //convert json response to object
        ObjectMapper objectMapper = new ObjectMapper();
        List<Books> booklist = objectMapper.readValue(response.body(), new TypeReference<List<Books>>() {
                })
                .stream()
                .filter(book -> (book.getId() >= 195))
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.comparing(Books::getId).reversed())
                .collect(Collectors.toList());
        //print the list
        for (int i = 0; i < booklist.size(); i++) {
            Books books = booklist.get(i);
            System.out.println(books.getId());
        }

        //POST request
        System.out.println("---------------------POST DEMO------------------------");
        builder = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"id\": 100,\n" +
                        "  \"title\": \"Dexter\",\n" +
                        "  \"dueDate\": \"2022-03-28T02:14:04.027Z\",\n" +
                        "  \"completed\": true\n" +
                        "}"))
                //Need to send this header for POST else we will get 415 "Unsupported Media Type" response
                //By default it's set as "text/html"
                .header("Content-Type", "application/json")
                .build();
        response = httpClient.send(builder, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
        
        //see the response headers
        //System.out.println(response.headers().map()); //single line
        HttpHeaders headers = response.headers();
        Map<String, List<String>> headersmap = headers.map();
        System.out.println(headersmap);
        System.out.println(headersmap.get("api-supported-versions"));
    }
}
