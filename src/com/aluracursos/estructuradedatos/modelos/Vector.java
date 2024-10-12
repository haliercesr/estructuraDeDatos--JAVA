package com.aluracursos.estructuradedatos.modelos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {
    private Alumno[] alumnos = new Alumno[100];
    private int totalDeAlumnos = 0;

    public void adicionar(Alumno alumno) {
        //recibe un alumno
        //ADICIONAMIENTO SECUENCIAL, cuando se crea el array todas las posiciones son null, al recorrer el array se agrega el alumno en la primera posicion null
        //for (int i = 0; i < alumnos.length; i++) {
        //    if (alumnos[i] == null){
        //        alumnos[i] = alumno;
        //        break;
        //    }}
        //Para no recorrer todo el array cada vez que se agrega un alumno
        this.guardarEspacio(); //comprueba que no se llene el array cada vez que se agrega un nuevo alumno
        this.alumnos[totalDeAlumnos] = alumno;
        totalDeAlumnos++;

    }

    public void adiciona(int posicion, Alumno alumno) {
        this.guardarEspacio(); //comprueba que no se llene el array cada vez que se agrega un nuevo alumno
        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posicion invalida");
        }

        for(int i = totalDeAlumnos - 1; i >= posicion; i-=1) {  //recorremos el array en posicion contraria y los desplazamos una posicion a la derecha
            alumnos[i+1] = alumnos[i];
        }
        alumnos[posicion] = alumno;
        totalDeAlumnos++;
    }

    private boolean posicionOcupada(int posicion) { //metodo auxiliar que nos dice si una posicion esta ocupada
        return posicion >= 0 && posicion < totalDeAlumnos;
    }

    public Alumno obtener(int posicion) {

        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posición invalida");
        }
        //recibe una posición y devuelve el alumno
        return alumnos[posicion];
    }

    public void remove(int posicion) {
        //elimina por la posición
        for(int i = posicion; i < this.totalDeAlumnos; i++) {
            this.alumnos[i] = this.alumnos[i+1];
        }
        totalDeAlumnos--;
    }

    public boolean contiene(Alumno alumno) {
        //Sabremos si está el alumno o no en la lista
        for (int i = 0; i < totalDeAlumnos; i++) {  //no uso alumnos.length porque los demas valores del array son null
            if(alumno.equals(alumnos[i])) { //es un metodo que creamos nosotros en alimno y compara los nombres para saber si se trata del mismo objeto
            return true;
            }
        }
        return false;
    }

    public int tamanio() {
        //Devuelve la cantidad de alumnos
        return totalDeAlumnos;
    }

    public String toString() {
        //Facilitará la impresión
        return Arrays.toString(alumnos);
    }

    public void guardarEspacio(){
        if(totalDeAlumnos==alumnos.length){
            Alumno[] nuevoArray=new Alumno[alumnos.length*2];
            for (int i = 0; i < alumnos.length; i++) {
                nuevoArray[i] = alumnos[i];
            }
            this.alumnos = nuevoArray;
        }
    }



}
