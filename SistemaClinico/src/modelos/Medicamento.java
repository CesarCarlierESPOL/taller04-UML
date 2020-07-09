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
public class Medicamento {
    protected String medicina,dosis,observaciones,unidad;
    protected int cantidadTotal;

    public Medicamento(String medicina, String dosis, String observaciones, String unidad, int cantidadTotal) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.unidad = unidad;
        this.cantidadTotal = cantidadTotal;
    }
    
}
