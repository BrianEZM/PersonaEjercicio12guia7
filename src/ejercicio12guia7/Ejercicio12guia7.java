/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12guia7;

import Entidades.Persona;
import ServiciosPersona.ServiciosPersona;

/**
 *
 * @author A286931
 */
public class Ejercicio12guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosPersona serv = new ServiciosPersona();
        
        Persona persona1 = serv.crearPersona();
        
        serv.menorQue(persona1, serv.compararEdad(), serv.calcularEdad(persona1));
    }
    
}
