package com.guilherme.tesch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ConsultaGoogleBooks {
    public static void main(String[]args) throws IOException, InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("--- API CONSULTA LIVROS ---");

        System.out.print("Digite o nome de um livro: ");
        var livro = sc.nextLine();

        var enderco = "https://www.googleapis.com/books/v1/volumes?q=" + livro + "SUA CHAVE";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(enderco))
            .build();

        HttpResponse<String> response = client
          .send(request, BodyHandlers.ofString());


        System.out.println(response.body());
        sc.close();
    }
}
