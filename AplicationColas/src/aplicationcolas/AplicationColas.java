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
public class AplicationColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola c=new Cola(5);
        c.adicola("a");
        c.adicola("b");
        c.adicola("c");
        c.adicola("d");
        c.adicola("e");
        System.out.println("MOSTRANDO COLA");
        c.mostrarCola();
        System.out.println("|");
        
        
    }
    
}
