package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiasFifa = new HashMap<String, Integer>();

        campeoesMundiasFifa.put("Brasil ",  5);
        campeoesMundiasFifa.put("Alemanha ",  4);
        campeoesMundiasFifa.put("Italia ",  4);
        campeoesMundiasFifa.put("França ",  2);
        campeoesMundiasFifa.put("Argentina ",  2);
        campeoesMundiasFifa.put("Uruguai ",  2);
        campeoesMundiasFifa.put("Inglaterra ",  1);
        campeoesMundiasFifa.put("Espanha ",  1);

        System.out.println(campeoesMundiasFifa);


        System.out.println(campeoesMundiasFifa.get("Brasil"));

        campeoesMundiasFifa.put("China", 1);

        System.out.println(campeoesMundiasFifa);

        campeoesMundiasFifa.remove("China", 1);

        System.out.println(campeoesMundiasFifa);

        System.out.println(campeoesMundiasFifa.size());




    }
}
