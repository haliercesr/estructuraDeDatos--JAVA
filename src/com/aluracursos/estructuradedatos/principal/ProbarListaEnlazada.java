package com.aluracursos.estructuradedatos.principal;

import com.aluracursos.estructuradedatos.modelos.ListaEnlazada;

public class ProbarListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println(lista);
        lista.adicionarEnElComienzo("mauricio");
        System.out.println(lista);
        lista.adicionarEnElComienzo("paulo");
        System.out.println(lista);
        lista.adicionarEnElComienzo("guilherme");
        System.out.println(lista);

        lista.adicionar("marcelo");
        lista.adicionar("cesar");
        System.out.println(lista);
        lista.adiciona(2, "gabriel");
        System.out.println(lista);
        Object x = lista.obtener(2);
        System.out.println(x);
        System.out.println(lista.tamaño());
        lista.removerDelComienzo();
        System.out.println(lista);
        lista.removeDelFinal();
        System.out.println(lista);
    }
}
