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
public class Receta {
    protected Date fecha;
    protected PlanNutricional planNut;
    protected Paciente paciente;
    protected ArrayList<Medicamento> medicamentos;
    protected Doctor doctor;

    public Receta(Date fecha, PlanNutricional planNut, Paciente paciente, ArrayList<Medicamento> medicamentos, Doctor doctor) {
        this.fecha = fecha;
        this.planNut = planNut;
        this.paciente = paciente;
        this.medicamentos = medicamentos;
        this.doctor = doctor;
    }

    
    
}

