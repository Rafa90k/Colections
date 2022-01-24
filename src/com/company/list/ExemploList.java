package com.company.list;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {


    public static void main(String[] args) {

        List <String> nome = new ArrayList<>();

        nome.add("Rafael");
        nome.add("João");
        nome.add("Elias");
        nome.add("Abraão");

        System.out.println(nome);

        Collections.sort(nome);

        System.out.println(nome);

        nome.set(1, "Carol");

        System.out.println(nome);

        //nome.remove(1);

       String nomes = nome.get(3);

        System.out.println(nomes);

        int tamanho = nome.size();

        System.out.println(tamanho);


        Iterator<String> interator = nome.iterator();

        while (interator.hasNext()){

            System.out.println(interator.next());
        }

        for (String nomeItem : nome) {

            System.out.println(nomeItem);

        }
        

    }
}
