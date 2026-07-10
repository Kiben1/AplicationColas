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
public class AplicationColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaCircular C=new ColaCircular(5);
        C.adicola("a");
        C.adicola("a");
        C.adicola("A");
        C.adicola("A");
        C.adicola("B");
        System.out.println("****MOSTRANDO COLA CIRCULAR");
        C.mostrarCola();
    }
    
}
