package org.sam.tda.capitulo1.listas_enlazadas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {

    // Objetos Personas que usaremos como Datos para la lista
    Persona p1;
    Persona p2;
    Persona p3;
    Persona p4;

    // Objetos Nodo que insertaremos directamente en la lista
    Nodo<Persona> n1;
    Nodo<Persona> n2;
    Nodo<Persona> n3;
    Nodo<Persona> n4;

    @BeforeEach
    void initAll() {
        // Inicializamos los Objetos Persona
        this.p1 = new Persona("Y3661988B", "Manuel", "Suárez", "manuelal180@hotmail.com");
        this.p2 = new Persona("Y2878800L", "Jose", "Bernardo", "josebernardo20@hotmail.com");
        this.p3 = new Persona("X7672740D", "Antonio", "Padilla", "padilla5687@gmail.com");
        this.p4 = new Persona("16397895E", "Miguel", "Gonzalez", "m_gonzalez879@yahoo.com");

        // Inicializamos los Nodos
        this.n1 = new Nodo<Persona>(this.p1);
        this.n2 = new Nodo<Persona>(this.p2);
        this.n3 = new Nodo<Persona>(this.p3);
        this.n4 = new Nodo<Persona>(this.p4);
    }

    @Test
    void insertar_cabeza() {
        ListaEnlazada<Persona> lista = new ListaEnlazada<Persona>(this.n1);
        lista.insertar_cabeza(this.n2);

        assertEquals(lista.getHead(), n2); // Se ha insertado n2 en la cabeza correctamente
        assertEquals(lista.getHead().getNext(), n1); // se ha desplazado n1 correctamente
    }

    @Test
    void insertar_final() {
        // Creamos la lista
        ListaEnlazada<Persona> lista = new ListaEnlazada<Persona>(this.n3);
        lista.insertar_cabeza(this.n2);
        lista.insertar_cabeza(this.n1);

        // usamos el metodo insertar_final
        lista.insertar_final(this.n4);

        // Comprobamos que el nodo n4 realmente está en la última posición
        Nodo<Persona> listaNodo = lista.getHead().getNext().getNext().getNext();
        assertEquals(listaNodo, this.n4);
    }

    @Test
    void suprimir_cabeza() {
        // Creamos la lista
        ListaEnlazada<Persona> lista = new ListaEnlazada<Persona>(this.n3);
        lista.insertar_cabeza(this.n2);
        lista.insertar_cabeza(this.n1); // -> n1 es la cabeza
        lista.insertar_final(this.n4);  // -> n4 es la cola

        // Llamamos a la función suprimir cabeza
        lista.suprimir_cabeza();

        // Comprobamos que la cabeza no es n1
        assertNotEquals(lista.getHead(), this.n1);
        // Comprobamos que la cabeza es n2
        assertEquals(lista.getHead(), this.n2);
    }
}