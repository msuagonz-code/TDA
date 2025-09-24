package org.sam.tda.capitulo1.listas_enlazadas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {

    @Test
    void insertar_cabeza() {

        Persona p1 = new Persona("Y3661988B", "Manuel", "Suárez", "manuelal180@hotmail.com");
        Persona p2 = new Persona("Y2878800L", "Jose", "Bernardo", "josebernardo20@hotmail.com");

        Nodo<Persona> n1 = new Nodo<Persona>(p1);
        Nodo<Persona> n2 = new Nodo<Persona>(p2);

        ListaEnlazada<Persona> lista = new ListaEnlazada<Persona>(n1);
        lista.insertar_cabeza(n2);

        assertEquals(lista.getHead(), n2); // Se ha insertado n2 en la cabeza correctamente
        assertEquals(lista.getHead().getNext(), n1); // se ha desplazado n1 correctamente
    }
}