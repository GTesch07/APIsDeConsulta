package com.guilherme.tesch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.guilherme.tesch.principal.models.Pessoa;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args){
        /*1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.
        2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
        3. Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro. */


    
         Pessoa pessoa = new Pessoa("Guilherme", 22, "Canoas");
   

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);

    }
}
