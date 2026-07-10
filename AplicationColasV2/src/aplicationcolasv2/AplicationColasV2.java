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
public class AplicationColasV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tratamiento t1=new tratamiento(01,"resfrio"," rty", 3, "1xdia");
        tratamiento t2=new tratamiento(01,"otitis"," zzz", 5, "2xdia");
        Pila T=new Pila(5);
        T.adipila(t1);
        T.adipila(t2);
        mascota m1= new mascota("toto",10,"beagle","mediano","Macho",T);
        
        tratamiento t11=new tratamiento(011,"parasito"," rty", 3, "1xdia");
        Pila T1=new Pila(5);
        T1.adipila(t11);
        mascota m2= new mascota("panchito",5,"cooker","mediano","Macho",T1);
        
        tratamiento t23=new tratamiento(017,"obesidad","xxx", 3, "1xdia");
        Pila T2=new Pila(5);
        T2.adipila(t23);
        mascota m3= new mascota("princesa",8,"chihuahua","pequeño","hembra",T2);

        Cola c=new Cola(5);
        c.adicola(m1);
        c.adicola(m2);
        c.adicola(m3);
        
        System.out.println("*********MOSTRANDO COLA*******");
        c.mostrarCola();
        
        AplicationColasV2 obj=new AplicationColasV2();
            System.out.println("*********************************");
            System.out.println("las mascotas enfermas son:");
            obj.mostrarNombreD(c,"parasito");
            
        //a)mostrar el primer tratamiento aplicado a la mascota x y modificar la dosis    
            System.out.println("*********************************");
            obj.mostrarYModificarDosis(c, "princesa", "xx12");
        //b) separar la cola de mascotas en dos pilas, la primera pila tendria a las mascotas machos y la segunda pila tendria a las mascotas hembra
            System.out.println("*********************************");
            Pila1 pilaMacho=new Pila1(5);
            Pila1 PilaHembra= new Pila1(5);
            obj.separarPorSexo(c, pilaMacho, PilaHembra);
        
        //b1. en la pila de mascotas macho calcular el promedio de la edad
            System.out.println("*********************************");
            obj.calcularPromedioEdad(pilaMacho);
        //c) modificar la raza de la mascota enferma del diagnostico x
            obj.modificarRazaPorDiagnostico(c, "resfrio", "bug");
            System.out.println("*********************************");
        //d) agregar la mascota m despues de la mascota de nombre x
            System.out.println("*********************************");
            obj.agregarDespuesDe(c, "panchito", m3);
            System.out.println("**********MOSTRAR DESPUES DE LOS CAMBIOS***********");
            c.mostrarCola();
        
    }
    public void mostrarNombreD(Cola M, String dia){
        Cola caux=new Cola(M.max);
        boolean sw=false;
        while(!M.esVacia()){
            mascota ma=M.elicola();
            Pila T=ma.getTratamiento();
            Pila paux=new Pila(T.max);
            while(!T.esVacia()){
                tratamiento tra=T.elipila();
                if(tra.getDiagnostico().equals(dia)){
                    System.out.println("Nombre: "+ma.getNombre());
                    sw=true;
                }
                paux.adipila(tra);
            }
            T.vaciarPila(paux);
            caux.adicola(ma);
        }
        M.vaciarCola(caux);
    }
    
    
    public void mostrarYModificarDosis(Cola M, String nombreMascota, String nuevaDosis) {
        if (M.esVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
    
        Cola caux = new Cola(M.max);
        boolean encontrado = false;
    
        while (!M.esVacia()) {
            mascota ma = M.elicola();
        
            if (ma.getNombre().equalsIgnoreCase(nombreMascota)) {
                System.out.println("\n***** PRIMER TRATAMIENTO DE " + nombreMascota.toUpperCase() + " *****");
                Pila T = ma.getTratamiento();
                Pila paux = new Pila(T.max);
                boolean primerTratamiento = true;
            
                    while (!T.esVacia()) {
                        tratamiento tra = T.elipila();
                
                        if (primerTratamiento) {
                            // MOSTRAR DATOS DEL PRIMER TRATAMIENTO
                            System.out.println("Diagnóstico: " + tra.getDiagnostico());
                            System.out.println("Medicamento: " + tra.getMedicamento());
                            System.out.println("Dosis anterior: " + tra.getDosis());
                    
                            // MODIFICAR LA DOSIS
                            tra.setDosis(nuevaDosis);
                            System.out.println("Dosis nueva: " + tra.getDosis());
                            System.out.println("******************************************");
                    
                            primerTratamiento = false;
                            encontrado = true;
                        }
                
                        paux.adipila(tra);
                    }
                    T.vaciarPila(paux);
                }
        
                caux.adicola(ma);
            }
    
        M.vaciarCola(caux);
    
        if  (!encontrado) {
            System.out.println("No se encontró la mascota: " + nombreMascota);
        }
    }
    
    // b) Separar la cola de mascotas en dos pilas (Machos y Hembras)
    public void separarPorSexo(Cola M, Pila1 machos, Pila1 hembras) {
        if (M.esVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
    
        Cola caux = new Cola(M.max);
    
        while (!M.esVacia()) {
            mascota ma = M.elicola();
        
            if (ma.getSexo().equalsIgnoreCase("Macho") || ma.getSexo().equalsIgnoreCase("M")) {
                machos.adipila(ma);
            } else if (ma.getSexo().equalsIgnoreCase("Hembra") || ma.getSexo().equalsIgnoreCase("H") || ma.getSexo().equalsIgnoreCase("F")) {
                hembras.adipila(ma);
            }
        
            caux.adicola(ma);
        }
    
        M.vaciarCola(caux);
    }

    // b1) Calcular el promedio de edad en la pila de mascotas macho
    public void calcularPromedioEdad(Pila1 p) {
        if (p.esVacia()) {
            System.out.println("La pila está vacía");
            return;
        }
    
        Pila1 paux = new Pila1(p.max);
        int sumaEdades = 0;
        int contador = 0;
    
        while (!p.esVacia()) {
            mascota ma = p.elipila();
            sumaEdades += ma.getEdad();
            contador++;
            paux.adipila(ma);
        }
    
        p.vaciarPila(paux);
    
        double promedio = (double) sumaEdades / contador;
        System.out.println("Total de machos: " + contador);
        System.out.println("Promedio de edad: " + String.format("%.2f", promedio) + " años");
    }

    // c) Modificar la raza de la mascota enferma del diagnóstico x
    public void modificarRazaPorDiagnostico(Cola M, String diagnostico, String nuevaRaza) {
        if (M.esVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
    
        Cola caux = new Cola(M.max);
        boolean encontrado = false;
    
        while (!M.esVacia()) {
            mascota ma = M.elicola();
            Pila T = ma.getTratamiento();
            Pila paux = new Pila(T.max);
            boolean diagnosticoEncontrado = false;
        
            while (!T.esVacia()) {
                tratamiento tra = T.elipila();
                if (tra.getDiagnostico().equalsIgnoreCase(diagnostico)) {
                    diagnosticoEncontrado = true;
                }
                paux.adipila(tra);
            }
            T.vaciarPila(paux);
        
            if (diagnosticoEncontrado) {
                System.out.println("Modificando raza de: " + ma.getNombre());
                System.out.println("   Raza anterior: " + ma.getRaza());
                ma.setRaza(nuevaRaza);
                System.out.println("   Raza nueva: " + ma.getRaza());
                encontrado = true;
            }
        
            caux.adicola(ma);
        }
    
        M.vaciarCola(caux);
    
        if (!encontrado) {
            System.out.println("No se encontró ninguna mascota con el diagnóstico: " + diagnostico);
        }
    }

    // d) Agregar la mascota m después de la mascota de nombre x
    public void agregarDespuesDe(Cola M, String nombreReferencia, mascota nuevaMascota) {
        if (M.esVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
    
        Cola caux = new Cola(M.max);
        boolean encontrado = false;
    
        while (!M.esVacia()) {
            mascota ma = M.elicola();
        
            caux.adicola(ma);
        
            if (ma.getNombre().equalsIgnoreCase(nombreReferencia)) {
                System.out.println("Agregando a '" + nuevaMascota.getNombre() + "' después de '" + nombreReferencia + "'");
                caux.adicola(nuevaMascota);
                encontrado = true;
            }
        }
    
        M.vaciarCola(caux);
    
        if (!encontrado) {
            System.out.println("No se encontró la mascota: " + nombreReferencia);
        }
    }
    
  
    
}
