package Animales;

public class nodo {
    String nombre;
    nodo der;
    nodo izq;

    nodo(String nom) {
        this.nombre = nom;
        this.der = null;
        this.izq = null;
    }
}
