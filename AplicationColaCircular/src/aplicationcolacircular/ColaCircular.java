/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicationcolacircular;

/**
 *
 * @author estudiante
 */
public class ColaCircular {
     private String c[];
    private int max, frente, fin, cantidad;

    public ColaCircular(int max) {
        this.max = max;
        this.c = new String[max];
        this.frente = 0;
        this.fin = -1;
        this.cantidad = 0;
    }

    public boolean esVacia() {
        return cantidad == 0;
    }

    
    public boolean esLLena() {
        return cantidad == max;
    }

  
    public void adicola(String dato) {
        if (esLLena()) {
            System.out.println("Cola Circular Llena");
            return;
        }
        fin = (fin + 1) % max;
        c[fin] = dato;
        cantidad++;
    }

    public String elicola() {
        if (esVacia()) {
            System.out.println("Cola Circular Vacía");
            return "";
        }
        String dato = c[frente];
        frente = (frente + 1) % max;
        cantidad--;
        return dato;
    }

    public String verPrimero() {
        if (esVacia()) {
            System.out.println("Cola Circular Vacía");
            return "";
        }
        return c[frente];
    }

   
    public int tamaño() {
        return cantidad;
    }

    public void mostrarCola() {
        if (esVacia()) {
            System.out.println("Cola Circular Vacía");
            return;
        }
        ColaCircular aux = new ColaCircular(max);
        int contador = 1;
        
        while (!esVacia()) {
            String dato = elicola();
            System.out.println(contador + ". " + dato);
            aux.adicola(dato);
            contador++;
        }
        
        vaciarCola(aux);
    }

    
    public void vaciarCola(ColaCircular aux) {
        while (!aux.esVacia()) {
            String dato = aux.elicola();
            adicola(dato);
        }
    }

   
    public int contar() {
        return cantidad;
    }
}
