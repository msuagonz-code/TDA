package org.sam.tda.capitulo1.listas_enlazadas;

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
}
