/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author LEGION
 */
public class Administrador extends Persona{

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
    }

    
    public void registraUsuario(){
        
    }
    
    public void asignarRol(Persona persona){
    
    }
}
