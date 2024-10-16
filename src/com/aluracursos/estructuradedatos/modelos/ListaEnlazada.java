package com.aluracursos.estructuradedatos.modelos;

public class ListaEnlazada {

    private Celula primera = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionarEnElComienzo(Object elemento) {
        if(this.totalDeElementos == 0) {
            Celula nueva = new Celula(elemento);
            this.primera = nueva;
            this.ultima = nueva;
        }else {
            Celula nueva = new Celula(this.primera, (Celula) elemento);
            this.primera.setAnterior(nueva);
            this.primera = nueva;
        }

        this.totalDeElementos++;
    }

    @Override
    public String toString() {
        if(this.totalDeElementos == 0) {
            return "[]";
        }
        Celula actual = primera;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(actual.getElemento());
            builder.append(",");

            actual = actual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }

    private boolean posicionOcupada(int  posicion) {
        return  posicion >= 0 &&  posicion < this.totalDeElementos;
    }

    private Celula hallarCelula(int posicion) {

        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posicion inexistente");
        }

        Celula actual = primera;

        for(int i = 0; i < posicion; i++) {
            actual = actual.getProximo();
        }
        return actual;
    }

    public void adicionar(Object elemento) {
        if (this.totalDeElementos == 0) {
            adicionarEnElComienzo(elemento);
        } else {
            Celula nueva = new Celula((Celula) elemento);
            this.ultima.setProximo(nueva); //en el ultimo elemento del array viejo, el proximo sera "nueva
            nueva.setAnterior(this.ultima);
            this.ultima = nueva; //ahora se setea como ultimo a "nueva"
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicion, Object elemento) {
        if(posicion == 0) {
            adicionarEnElComienzo(elemento);
        } else if (posicion == this.totalDeElementos) {
            adicionar(elemento);
        } else {
            Celula anterior = this.hallarCelula(posicion - 1);
            Celula proxima = anterior.getProximo();

            Celula nueva = new Celula(anterior.getProximo(), (Celula) elemento);
            nueva.setAnterior(anterior);
            anterior.setProximo(nueva);
            proxima.setAnterior(nueva);
            this.totalDeElementos++;
        }
    }

    public Object obtener(int posicion) {
        return this.hallarCelula(posicion).getElemento(); }

    public void removerDelComienzo() {
        if(this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vacia");
        }

        this.primera = this.primera.getProximo();
        this.totalDeElementos--;

        if(this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void removeDelFinal() {
        if (this.totalDeElementos == 1) {
            this.removerDelComienzo();
        }else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }

    }
    public int tamaño() {
        return this.totalDeElementos;
    }

    public boolean contiene(Object o) { return false;}
}
