/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author NEXO-MAX
 */

public class Trabajador  extends Persona implements Pasivo {
    double sueldo;

    public Trabajador(double sueldo, String nombre, int dni, String domicilio, LocalDate fechaNacimiento) {
        super(nombre, dni, domicilio, fechaNacimiento);
        this.sueldo = sueldo;
    }

    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public void cobrar(){
        System.out.println("Monto a cobrar: "+ this.sueldo);
    }

    @Override
    public void hacerAportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public long calcularEdad(){
        
        long edad = ChronoUnit.YEARS.between(this.getFechaNacimiento(), LocalDate.now());          
        return edad;
    }
    
}

