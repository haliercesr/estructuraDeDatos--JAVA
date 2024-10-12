package com.aluracursos.estructuradedatos.modelos;

import java.util.LinkedList;
import java.util.List;

public class Pila {

    private List<String> nombres = new LinkedList<String>();

        public void insertar(String nombre) {
            nombres.add(nombre);
        }

        public String remove() {
            return nombres.remove(nombres.size()-1); //usamos la funcion de linkedlist
        }

        public boolean vacia() {
            return nombres.size() == 0;
            //return nombres.isEmpty(); //segundo metodo
        }

    @Override
    public String toString() {
        return nombres.toString();
    }
}
