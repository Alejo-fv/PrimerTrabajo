/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, area,circ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio = teclado.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        circ = 2*Math.PI*radio;
        
        System.out.println("El area es: "+area+"\n"+"La circunferencia es: "+circ);
    }
    
}
