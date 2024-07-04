package com.conversordemonedas.calculos;

import com.conversordemonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {

    public Moneda conectarApi(String moneda){

        URI direccion =  URI.create("https://v6.exchangerate-api.com/v6/890203fdfaab3ea51cc0d7e6/latest/"+ moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri((direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la pelicula.");
        }
    }

}
