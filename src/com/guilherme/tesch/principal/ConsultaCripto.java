package com.guilherme.tesch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ConsultaCripto {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner sc = new Scanner(System.in);


        System.out.println("--- API de Cosulta Cotação CRIPTO ---");

        System.out.print("Digite a criptomoeda de sua preferência: ");

        var leitura = sc.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=bitcoin&x_cg_demo_api_key=" + leitura + "SUA CHAVE";

        

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

    
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());

        sc.close();
    }
}
