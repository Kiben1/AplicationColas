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
public class mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String tamanio;
    private String sexo;
    private Pila tratamiento;

    public mascota() {
    }

    public mascota(String nombre, int edad, String raza, String tamanio, String sexo, Pila tratamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.sexo = sexo;
        this.tratamiento = tratamiento;
    }
    
    public void mostrarMascota()
    {
        System.out.println("Mascota: "+this.nombre+" "+this.edad+" "+this.raza+" "+this.tamanio+" "+this.sexo);
        tratamiento.mostrarPila();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pila getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Pila tratamiento) {
        this.tratamiento = tratamiento;
    }
    
}
