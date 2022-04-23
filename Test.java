/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author NEXO-MAX
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro nuevo = new Registro();
        Persona Maxi = new Trabajador(100000.0,"Maxi",39,"Santa Rosa",LocalDate.of(1995, Month.OCTOBER,18));
        Persona Feli = new Jubilado("Felipe",18,"lafinur",LocalDate.of(1960, Month.MARCH, 17));
        
        nuevo.procesarDatos(Maxi);
        nuevo.procesarDatos(Feli);
    }
    
}
