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
public class Persona {
    protected String usuario,clave,nombre,apellido,cedula,direccion;
    protected Date fechaNac;
    protected Administrador registradoPor;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.registradoPor = registradoPor;
    }
    
    public boolean logIn(){
        return false;
    }
    
    public boolean logOut(){
        return false;
    }
}
