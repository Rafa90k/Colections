package com.company.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExemplo {

    public static void main(String[] args) {

        TreeSet <String> nomeCapitais = new TreeSet<>();

        nomeCapitais.add("São Paulo");
        nomeCapitais.add("Curitiba");
        nomeCapitais.add("Fortaleza");
        nomeCapitais.add("Cuiaba");
        nomeCapitais.add("Porto Velho");
        nomeCapitais.add("São Luiz");

        //Retorna o primeiro item do topo da arvore
        System.out.println(nomeCapitais.first());

        //Retorna o ultimo item da arvore
        System.out.println(nomeCapitais.last());

        //Retorna o primeiro item do topo da arvore eo remove
        System.out.println("***" + nomeCapitais.pollFirst());

        Iterator <String> lista = nomeCapitais.iterator();

        while (lista.hasNext()){
            System.out.println(lista.next());
        }

        for (String item : nomeCapitais) {
            System.out.println("___" + item);

        }
    }
}
