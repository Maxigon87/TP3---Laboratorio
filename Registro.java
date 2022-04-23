/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author NEXO-MAX
 */
public class Registro  {

    public Registro() {
    }
    
    
    public void procesarDatos(Persona persona){
        if (persona instanceof Trabajador){
           ((Trabajador)persona).cobrar();
            System.out.println("El trabajador cobró con exito");
            System.out.println("Trabajador: "+ ((Trabajador)persona).getNombre());
            System.out.println("Edad: " + persona.calcularEdad());
        } else if (persona instanceof Jubilado){
            ((Jubilado)persona).cobrar();
            System.out.println("El jubilado cobró con exito");
            System.out.println("Jubilado: " + persona.getNombre());
            System.out.println("Dias vividos: "+ persona.calcularDiasVividos());
        }
    }
}
