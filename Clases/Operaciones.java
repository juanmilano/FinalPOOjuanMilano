/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;


/**
 *
 * @author juanmilano
 */
public class Operaciones {
    //Declaro el ArrayList donde voy a guardar las licencias//
    	private static ArrayList <LicenciaEspecial> objArrLicencia = new ArrayList <LicenciaEspecial>();
    //Declaro el ArrayList donde voy a guardar los vacaciones//
    	private static ArrayList <Vacaciones> objArrVacaciones = new ArrayList <Vacaciones>();
    //Método para Insertar Licencia//
    	public boolean Insertar_Licencia_Especial(LicenciaEspecial datosLicenciaEspecial){
    		objArrLicencia.add(datosLicenciaEspecial);
    		return (true);
    	}
    	public boolean Insertar_Vacaciones(Vacaciones datosVacaciones){
    		objArrVacaciones.add(datosVacaciones);
    		return (true);
    	}
    
    //Método para eliminar un Pedido//
    	public boolean Eliminar_Pedido (){
    		return (true);
    	}
    
        //Método para Listar licencias//
	public ArrayList<LicenciaEspecial> Obtener_Lista_Licencia (){
        return (objArrLicencia);
    }
            //Método para Listar Vacaciones//
    public ArrayList<Vacaciones> Obtener_Lista_Vacaciones (){
        return (objArrVacaciones);
    }    
  
    
}
