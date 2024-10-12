package com.aluracursos.estructuradedatos.modelos;

import java.util.Objects;

public class Celula {

    private Object elemento;
    private Object proximo;
    private Celula anterior;


    public Celula(Object elemento,Object proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento) {
        this(null, elemento);
    }

    public Celula getProximo() {
        return (Celula) proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}
