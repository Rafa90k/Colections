package com.company.map;

import java.util.Hashtable;

public class HasTableExemplos {

    public static void main(String[] args) {

        Hashtable <String, Integer> carros = new Hashtable<>();

        carros.put("Gol", 2015);
        carros.put("Golf", 2020);
        carros.put("Vectra", 2015);
        carros.put("Amarock", 2022);
        carros.put("Monza", 1995);

        System.out.println(carros.get("Gol"));


        System.out.println(carros);
    }
}
