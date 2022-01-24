package com.company.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {

   

    public static void main(String[] args) {


        java.util.Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Rafael");
        filaDeBanco.add("Patricia");
        filaDeBanco.add("João");
        filaDeBanco.add("Maria");

        //System.out.println(filaDeBanco);


        //filaDeBanco.add("Judas");

        //System.out.println(filaDeBanco);

        //int tamanho = filaDeBanco.size();

        //System.out.println(tamanho);

        //filaDeBanco.clear();

        //System.out.println(filaDeBanco);

        //String clienteASeratendido = filaDeBanco.poll();

        //System.out.println(clienteASeratendido);

        //System.out.println(filaDeBanco);

        //String primeiroCliente = filaDeBanco.peek();

        //System.out.println(primeiroCliente);

        //System.out.println(filaDeBanco);

        //String cliente = filaDeBanco.element();

        //System.out.println(cliente);

        System.out.println(filaDeBanco);

        /*for (String clientes: filaDeBanco) {

            System.out.println(clientes);

        }*/

        Iterator <String> iteratorFilaBanco = filaDeBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }


    }
}