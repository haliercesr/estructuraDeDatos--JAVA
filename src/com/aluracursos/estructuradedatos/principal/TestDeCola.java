package com.aluracursos.estructuradedatos.principal;

import com.aluracursos.estructuradedatos.modelos.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class TestDeCola {
    public static void main(String[] args) {
        //En las colas el primero en entrar es el primero en salir
        Colas cola = new Colas();
        System.out.println(cola.vacio());
        cola.adiciona("Mauricio");
        cola.adiciona("Guilherme");

        System.out.println(cola);

        String x1 = cola.remove();
        System.out.println(x1);
        System.out.println(cola);
        System.out.println(cola.vacio());

        Queue<String> pilaDeJava = new LinkedList<String>(); //clase de colas en JAVA
        pilaDeJava.add("Mauricio");
        pilaDeJava.add("Cesar");
        System.out.println(pilaDeJava);
        String x2 = pilaDeJava.poll();
        System.out.println("Elemento eliminado: "+x2);
        System.out.println(pilaDeJava);
    }

}
