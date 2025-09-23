package org.sam.tda.capitulo1.listas_enlazadas;

public class Nodo<T> {

    private T dato;
    private Nodo<T> next;

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }
}