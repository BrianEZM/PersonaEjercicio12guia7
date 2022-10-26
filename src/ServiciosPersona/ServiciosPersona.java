/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosPersona;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A286931
 */
public class ServiciosPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona persona1 = new Persona();
        
        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento en formato DD MM AAAA");
        int dd = leer.nextInt();
        int mm = leer.nextInt();
        int aaaa = leer.nextInt();
        Date fechaNac = new Date(aaaa - 1900, mm - 1, dd);
        persona1.setFechaNac(fechaNac);
        
        System.out.println(persona1);
        
        return persona1;
    }
    
    public int calcularEdad(Persona persona1){
    
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int anioNac = (persona1.getFechaNac().getYear() + 1900);
        int edad = anioActual - anioNac;
        
        System.out.println("La edad de la persona es: " + edad);
        
        return edad;
    }
    
    public int compararEdad(){
        System.out.println("Igrese una edad para comparar con la de la persona:");
        int edad = leer.nextInt();
        
        return edad;
    }
    public void menorQue(Persona persona1, int edad, int edadOriginal){
    
        if(edad > edadOriginal){
            System.out.println("La persona es mas joven que la edad comparada (" + edad + ")");
        }else if(edad == edadOriginal){
            System.out.println("La persona tiene la misma edad (" + edad + ")");
        }else{
            System.out.println("La persona es mas grande que la edad a comparar (" + edad + ")");
        }
        
    }
}
