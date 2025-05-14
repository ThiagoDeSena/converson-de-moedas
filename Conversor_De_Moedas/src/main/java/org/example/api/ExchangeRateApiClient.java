package org.example.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApiClient {

    private String moeda;
    private static final String API_KEY = "af0a14e5866a8b0677beb0b2";
    private static final String URL = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/";

    public ExchangeRateApiClient(String moeda) {
        this.moeda = moeda;
    }

    public String respostaApi(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL+this.moeda))
                .build();

        HttpResponse<String> response;

        try{
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Erro ao buscar dados da API: " + e.getMessage());
            return null;
        }

        return response.body();

    }
}
