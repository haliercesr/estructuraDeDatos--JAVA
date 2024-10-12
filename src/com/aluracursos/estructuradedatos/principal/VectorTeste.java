package com.aluracursos.estructuradedatos.principal;

import com.aluracursos.estructuradedatos.modelos.Alumno;
import com.aluracursos.estructuradedatos.modelos.Vector;

public class VectorTeste {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Danilo");

        Vector lista = new Vector();

        System.out.println(lista.tamanio());
        lista.adicionar(a1);
        System.out.println(lista.tamanio());
        lista.adicionar(a2);
        System.out.println(lista.tamanio());
        System.out.println(lista);
        System.out.println(lista.contiene(a2));
        System.out.println(lista.contiene(a3));
        System.out.println(lista.obtener(1));
        lista.adiciona(1,a3);
        System.out.println(lista);

    }
}
