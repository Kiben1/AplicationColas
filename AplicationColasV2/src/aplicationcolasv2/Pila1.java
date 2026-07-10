/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicationcolasv2;

/**
 *
 * @author estudiante
 */
public class Pila1 {
     mascota p[];
    int tope, max;

    public Pila1(int max) {
        this.max = max;
        this.p = new mascota[max];
        this.tope = -1;
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLLena() {
        return tope + 1 == max;
    }

    public void adipila(mascota dato) {
        if (esLLena()) {
            System.out.println("Pila Llena");
        } else {
            tope = tope + 1;
            p[tope] = dato;
        }
    }

    public mascota elipila() {
        mascota dato = new mascota();
        if (esVacia()) {
            System.out.println("Pila Vacía");
        } else {
            dato = p[tope];
            tope = tope - 1;
        }
        return dato;
    }

    public void mostrarPila() {
        Pila1 paux = new Pila1(max);
        if (esVacia()) {
            System.out.println("Pila Vacía");
        } else {
            while (!esVacia()) {
                mascota dato = elipila();
                dato.mostrarMascota();
                paux.adipila(dato);
            }
            vaciarPila(paux);
        }
    }

    public void vaciarPila(Pila1 aux) {
        while (!aux.esVacia()) {
            mascota dato = aux.elipila();
            adipila(dato);
        }
    }
}

