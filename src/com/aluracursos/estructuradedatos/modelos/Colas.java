package com.aluracursos.estructuradedatos.modelos;

import java.util.LinkedList;
import java.util.List;

public class Colas {

    private List<String> alumnos = new LinkedList<String>();

    //métodos

    @Override
    public String toString() {
        return alumnos.toString();
    }

    public void adiciona(String alumno) {
        alumnos.add(alumno);
    }

    public String remove() {
        return alumnos.remove(0);
    }

    public boolean vacio() {
        return alumnos.isEmpty();
    }

}