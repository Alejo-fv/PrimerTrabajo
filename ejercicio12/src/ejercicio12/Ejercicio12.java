/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horast,razon,salB;
        double retfnte,salN;
        
        horast = 48;
        razon = 5000;
        retfnte = horast*razon*0.125;
        salB = horast*razon;
        salN = salB*(1-0.125);
        
        System.out.println("El salario bruto es:"+salB+"\nLa retención en la fuente es:"+retfnte+"\nEl salario neto es:"+salN );
        
        
    }
    
}
