package com.company.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExemplo {

    public static void main(String[] args) {

        LinkedHashSet <Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(7);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(3);

        System.out.println(sequenciaNumerica);

       int tamanho = sequenciaNumerica.size();

        System.out.println(tamanho);

        Iterator <Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer item : sequenciaNumerica) {
            System.out.println("****" + item);

        }
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
