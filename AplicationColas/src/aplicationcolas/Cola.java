/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicationcolas;

/**
 *
 * @author estudiante
 */
public class Cola {
    String c[];
    int max,frente,fin;
    
    public Cola(int max){
       this.max=max;
       c=new String[max];
       frente=fin=-1;
    }
    
    public boolean esVacia() {
        return frente==-1;
    }
    
    public boolean esLLena() {
        return max==fin+1;
    }

    public void adicola(String dato) {
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

    public String elicola() {
        String dato = "";
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
            String dato = elicola();
            System.out.print("|"+ dato);
            aux.adicola(dato);
        }
        
        vaciarCola(aux);
    }

   
    public void vaciarCola(Cola aux) {
        while (!aux.esVacia()) {
            String dato = aux.elicola();
            adicola(dato);
        }
    }
    
    
}
