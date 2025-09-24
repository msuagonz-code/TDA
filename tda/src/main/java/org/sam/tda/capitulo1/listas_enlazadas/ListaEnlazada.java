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

}
