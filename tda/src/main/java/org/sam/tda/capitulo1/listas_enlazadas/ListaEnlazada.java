package org.sam.tda.capitulo1.listas_enlazadas;

import java.util.Objects;

public class ListaEnlazada<T> {

    private Nodo<T> head;

    public ListaEnlazada(){
        this.head = null;
    }

    public ListaEnlazada(Nodo<T> head){
        this.setHead(head);
    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    public void insertar_cabeza(Nodo<T> nodo){
        Objects.requireNonNull(nodo, "Nodo no puede ser null");
        if(this.getHead() != null){
            nodo.setNext(this.getHead());
        }
        this.setHead(nodo);
    }

    public void insertar_final(Nodo<T> nodo){
        // Primero debemos comprobar que la lista no este vacía
        if(getHead() == null){
            this.setHead(nodo);
        } else {
            Nodo<T> nodoActual = this.getHead();
            while (nodoActual.getNext() != null) {
                nodoActual = nodoActual.getNext();
            }
            nodoActual.setNext(nodo);
        }
    }

    public T suprimir_cabeza(){
        this.setHead(this.getHead().getNext());
        return this.getHead().getDato();
    }

    public T suprimir_final(){
        Nodo<T> nodoActual = this.getHead();
        Nodo<T> nodoFinal = nodoActual;
        while(nodoActual.getNext() != null) {
            nodoFinal = nodoActual;
            nodoActual = nodoActual.getNext();
        }
        nodoFinal.setNext(null);
        return nodoActual.getDato();
    }
}
