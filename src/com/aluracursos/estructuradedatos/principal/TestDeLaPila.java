package com.aluracursos.estructuradedatos.principal;

import com.aluracursos.estructuradedatos.modelos.Pila;

import java.util.Stack;

public class TestDeLaPila {
    public static void main(String[] args) {
        //En las pilas el primer elemento en entrar es el último en salir
        Pila pila = new Pila();

        System.out.println(pila.vacia());
        pila.insertar("Mauricio");
        System.out.println(pila);
        pila.insertar("Guilherme");
        System.out.println(pila);
        System.out.println(pila.vacia());
        String r1 = pila.remove();
        System.out.println(r1);

        String r2 = pila.remove();
        System.out.println(r2);

        System.out.println(pila);
        System.out.println(pila.vacia());

        Stack<String> stack = new Stack<String>(); //es la clase de JAVA para las pilas con sus propios metodos pop y push
        stack.push("Mauricio");
        stack.push("Marcelo");

        System.out.println(stack);
        stack.pop(); //elimina el ultimo elemento de la pila
        System.out.println(stack);

        String nombre = stack.peek(); //devuelve el ultimo elemento sin eliminarlo
        System.out.println(nombre);

    }
}
