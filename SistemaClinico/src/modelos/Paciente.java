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
public class Paciente extends Persona{
    protected String email;
    protected Cita cita;
    protected HistoriaClinica historiaClinica;
    protected ArrayList<Receta> recetas;

    public Paciente(String email, Cita cita, HistoriaClinica historiaClinica, ArrayList<Receta> recetas, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.email = email;
        this.cita = cita;
        this.historiaClinica = historiaClinica;
        this.recetas = recetas;
    }
    
    
    public boolean solicitarCita(){
        return false;
    }
}
