package com.zelling.tools;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zelling.models.ExchangeApiResponse;

public class ExchangeApiSearch {
   public ExchangeApiResponse search(String currency){
        Gson gson = new GsonBuilder()
            // .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();
        String apikey = "2c438e194eafd58d5ee92e85";
        var url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apikey, currency);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            var newFinal = gson.fromJson(response.body(), ExchangeApiResponse.class);
            return newFinal;
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter dados de conversão.");
        }
    }  
}
