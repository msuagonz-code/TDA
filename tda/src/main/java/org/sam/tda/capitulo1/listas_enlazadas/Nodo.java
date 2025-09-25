package org.sam.tda.capitulo1.listas_enlazadas;

public class Nodo<T> {

    private T dato;
    private Nodo<T> next;

    public Nodo() {
        this.next = null;
    }

    public Nodo(T dato) {
        this();
        this.dato = dato;
    }

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