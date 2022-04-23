/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author NEXO-MAX
 */
public abstract class Persona {
    private  String nombre;
    private int dni;
    private String domicilio;
    private LocalDate fechaNacimiento;

        //Constructor
    
    public Persona(String nombre, int dni, String domicilio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }
        //Metodos 
    
    // Calcular Edad
    public long calcularEdad(){
        
        long edad = ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        return edad;
    }
    
    //Dias vividos
    public long calcularDiasVividos(){
        long dias = DAYS.between(fechaNacimiento, LocalDate.now());
       return dias;
        
    }
     public abstract void cobrar();
     
     //Gets and Sets 
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    
    
}
