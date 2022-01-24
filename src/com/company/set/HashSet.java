package com.company.set;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new java.util.HashSet<>();

        notasAlunos.add(8.2);
        notasAlunos.add(9.8);
        notasAlunos.add(5.0);
        notasAlunos.add(4.2);
        notasAlunos.add(7.4);
        notasAlunos.add(6.2);
        notasAlunos.add(9.2);

        System.out.println(notasAlunos);

        notasAlunos.add(4.8);

        System.out.println(notasAlunos);

       Iterator <Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Double notas: notasAlunos) {
            System.out.println("###" + notas);

        }
    }
}
