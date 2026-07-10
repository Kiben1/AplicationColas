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
public class Pila {
    tratamiento p[];
    int tope, max;

   
    public Pila(int max) {
        this.max = max;
        this.p = new tratamiento[max];
        this.tope = -1;
    }

  
    public boolean esVacia() {
        return tope == -1;
    }


    public boolean esLLena() {
        return tope + 1 == max;
    }

  
    public void adipila(tratamiento dato) {
        if (esLLena()) {
            System.out.println("Pila Llena");
        } else {
            tope = tope + 1;
            p[tope] = dato;
        }
    }

    
    public tratamiento elipila() {
        tratamiento dato=new tratamiento();
        if (esVacia()) {
            System.out.println("Pila Vacía");
        } else {
            dato= p[tope];
            tope = tope - 1;
        }
        return dato;
    }

   
    public void mostrarPila() {
        Pila paux = new Pila(max);
        if (esVacia()) {
            System.out.println("Pila Vacía");
        } else {
   
            while (!esVacia()) {
                tratamiento dato = elipila();
                dato.mostra1();
                paux.adipila(dato);
            }
            
           vaciarPila(paux);
            
        }
    }
    
    public void vaciarPila( Pila aux){
        while (!aux.esVacia()) {
                tratamiento dato = aux.elipila();
                adipila(dato);
            }
    }
}
