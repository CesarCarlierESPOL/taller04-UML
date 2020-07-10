/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LEGION
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected AreaMedica areaMedica;
    protected String especialidad;
    protected ArrayList<AreaMedica> areas;
    protected ArrayList<Cita> citasPendientes;
    protected Secretaria secretaria;

    public Doctor(int regDoctor, String especialidad, ArrayList<AreaMedica> areas, ArrayList<Cita> citasPendientes, Secretaria secretaria, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.areas = areas;
        this.citasPendientes = citasPendientes;
        this.secretaria = secretaria;
    }
    
    
    public void recetar(){
        
    }
    
    public void agregarPlanNut(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public void registraSecretaria(){
        
    }
}
