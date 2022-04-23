/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author NEXO-MAX
 */
public class Jubilado extends Persona{

    public Jubilado(String nombre, int dni, String domicilio, LocalDate fechaNacimiento) {
        super(nombre, dni, domicilio, fechaNacimiento);
    }
    
    @Override
    public long calcularDiasVividos(){
        long dias = DAYS.between(this.getFechaNacimiento(), LocalDate.now());
        return dias;
        
    }
    
    
    
    @Override
    public void cobrar(){
        System.out.println("Cobrando mi jubilacion.");
    }
}
