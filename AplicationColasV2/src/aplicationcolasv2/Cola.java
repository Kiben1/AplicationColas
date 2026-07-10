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
public class Cola {
    mascota c[];
    int max,frente,fin;
    
    public Cola(int max){
       this.max=max;
       c=new mascota[max];
       frente=fin=-1;
    }
    
    public boolean esVacia() {
        return frente==-1;
    }
    
    public boolean esLLena() {
        return max==fin+1;
    }

    public void adicola(mascota dato) {
        if (esLLena()) {
            System.out.println("Cola Llena");
        } else {
            fin = fin+1;
            c[fin] = dato;
            if (frente==-1) {
                frente=frente+1;
            }
        }
    }

    public mascota elicola() {
        mascota dato = new mascota();
        if (esVacia()) {
            System.out.println("Cola Vacía");
        } else {
            dato=c[frente];
            if (frente==fin) {
                frente=-1;
                fin=-1;
            } else {
                frente=frente+1;
            }
        }
        return dato;
    }

    public void mostrarCola() {
        Cola aux = new Cola(max);
        if (esVacia()) {
            System.out.println("Cola Vacía");
            return;
        }
        
        while (!esVacia()) {
            mascota dato = elicola();
            dato.mostrarMascota();
            aux.adicola(dato);
        }
        
        vaciarCola(aux);
    }

   
    public void vaciarCola(Cola aux) {
        while (!aux.esVacia()) {
            mascota dato = aux.elicola();
            adicola(dato);
        }
    }
    
    

    
}
