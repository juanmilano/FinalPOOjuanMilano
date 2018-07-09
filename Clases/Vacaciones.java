/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juanmilano
 */
public class Vacaciones extends Licencia {
    private int vacacionesLegales;
    private int antiguedad;
    private int periodoVacacion;
    
    //Constructor//
    public Vacaciones (int vacacionesLegales, int antiguedad, int periodoVacacion,int dniEmpleado, int cantDias, String fechaInicio, String fechaFin,String estadoDeLicencia ){
    super (dniEmpleado,cantDias,fechaInicio,fechaFin,estadoDeLicencia);
    this.vacacionesLegales = vacacionesLegales;
    this.antiguedad = antiguedad;
    this.periodoVacacion = periodoVacacion;
    }
    //Getteress//
    public int getVacacionesLegales(){
    return vacacionesLegales;
    }
    public int antiguedad (){
    return antiguedad;
    }
    public int periodoVacacion(){
    return periodoVacacion;
    }
    //Setters//
    public void setVacacioensLegales (int legales){
    this.vacacionesLegales = legales;
    }
    public void setAntiguedad (int antiguedad){
    this.antiguedad = antiguedad;
    }
    public void setPeriodoVacacion (int periodo){
    this.periodoVacacion = periodo;
    }
    
}
