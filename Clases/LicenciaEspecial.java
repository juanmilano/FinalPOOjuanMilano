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
public class LicenciaEspecial extends Licencia {
    private String motivoDeLicencia;
    private String justificacionLicencia;
    
    //Constructor//
    public LicenciaEspecial (String motivoDeLicencia, String justificacionLicencia,int dniEmpleado, int cantDias, String fechaInicio, String fechaFin,String estadoDeLicencia ){
        super (dniEmpleado,cantDias, fechaInicio, fechaFin, estadoDeLicencia);
        this.motivoDeLicencia = motivoDeLicencia;
        this.justificacionLicencia = justificacionLicencia;
    }
    //Getters//
    	public String getMotivoDeLicencia (){
    		return (motivoDeLicencia);
    	}
    	public String getJustificacionLicencia(){
    		return (justificacionLicencia);
    	}
    //Setters//
    	public void setMotivoDeLicencia (String tipo){
    		motivoDeLicencia = tipo;    
    	}
    	public void setJustificacionLicencia (String justificacion){
    		justificacionLicencia = justificacion;
    	}
}