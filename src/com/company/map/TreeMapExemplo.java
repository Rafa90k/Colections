package com.company.map;

import java.util.TreeMap;

public class TreeMapExemplo {

    public static void main(String[] args) {
        TreeMap<String, Integer> campeoesMundialFifa = new TreeMap<>();

        campeoesMundialFifa.put("Brasil ",  5);
        campeoesMundialFifa.put("Alemanha ",  4);
        campeoesMundialFifa.put("Italia ",  4);
        campeoesMundialFifa.put("França ",  2);
        campeoesMundialFifa.put("Argentina ",  2);
        campeoesMundialFifa.put("Uruguai ",  2);
        campeoesMundialFifa.put("Inglaterra ",  1);
        campeoesMundialFifa.put("Espanha ",  1);

        System.out.println(campeoesMundialFifa);
    }
}
