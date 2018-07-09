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
public abstract class Licencia {
    protected int dniEmpleado;
    protected int cantDias;
    protected String fechaInicio;
    protected String fechaFin;
    protected String estadoDeLicencia;
    
    //Constructor//
        public Licencia (int dniEmpleado, int cantDias, String fechaInicio, String fechaFin,String estadoDeLicencia){
            this.dniEmpleado = dniEmpleado;
            this.cantDias = cantDias;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.estadoDeLicencia = estadoDeLicencia;
    }
        //Getters//
        public int dniEmpleado(){
        return dniEmpleado;
        }
        public int getCantDias (){
        return cantDias;
        }
        public String getFechaInicio (){
        return fechaInicio;
        }
        public String getFechaFin (){
        return fechaFin;
        }
        public String getEstadoDeLicencia (){
        return estadoDeLicencia;
        }
        //Setters//
        public void setDniEmpleado(int dni){
        this.dniEmpleado = dni;
        }
        public void setCantDias (int dias){
        this.cantDias = dias;
        }
        public void setFechaInicio (String inicio){
        this.fechaInicio = inicio;
        }
        public void setFechaFin (String fin){
        this.fechaFin = fin;
        }
        public void setEstadoDeLicencia (String estado){
        this.estadoDeLicencia = estado;
        }
    
}
