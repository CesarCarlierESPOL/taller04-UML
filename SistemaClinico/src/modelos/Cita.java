/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDateTime;

/**
 *
 * @author LEGION, eacarras
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    
    public void realizarPago(Pago pago) {
        
    }
}
