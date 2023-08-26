/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Alejandro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       double SUMA,X,Y;
       
        SUMA = 0;
        X=20;
        SUMA=SUMA+X;
        Y=40;
        X=X+ Math.pow(Y, 2);
        SUMA = SUMA + X/Y;
        System.out.println("EL VALOR DE LA SUMA ES: "+SUMA);
        
    }
    
}
