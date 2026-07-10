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
public class tratamiento {
    private int idTratamiento;
    private String diagnostico;
    private String medicamento;
    private int duracion;
    private String dosis;

    public tratamiento(int idTratamiento, String diagnostico, String medicamento, int duracion, String dosis) {
        this.idTratamiento = idTratamiento;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
        this.duracion = duracion;
        this.dosis = dosis;
    }
    

    public tratamiento() {
    }
    

 
    
    public void mostra1(){
        System.out.println(" "+idTratamiento+" "+ diagnostico+" "+ medicamento+" "+duracion+" "+dosis);
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    
}
