/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num,cua,cub;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número:");
        num = teclado.nextDouble();
        cua = num*num;
        cub = num*num*num;
        
        
        System.out.println("el cuadrado del número es: "+cua+"\n"+"el cubo del número es: "+cub);
    }
    
}
