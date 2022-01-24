package com.company.list;

import java.util.List;
import java.util.Vector;

public class Vetor {

    public static void main(String[] args) {

        List <String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Volei");
        esportes.add("Futsal");

        esportes.set(2, "Nado");

        System.out.println(esportes);

        esportes.remove(2);

        System.out.println(esportes);

        esportes.add(2, "Rugby");

        System.out.println(esportes);

        for (String esporte : esportes) {

            System.out.println(esporte);

        }
    }
}
