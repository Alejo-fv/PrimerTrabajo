/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edadjuan, edadalb,edadana,edadmama;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese edad Juan:");
        edadjuan = teclado.nextInt();
        
        edadalb = Math.floor(((double) 2/3)*edadjuan);
        edadana =(double) Math.floor(((double)4/3)*edadjuan);
        edadmama = edadjuan+edadalb+edadana;
        
        System.out.println("Edad de Juan es: "+edadjuan+"\n"+ "Edad de Ana es: "+edadana+"\n"+"Edad de Alberto es: "+edadalb+"\n"+"Edad mamá es: "+edadmama);
        
    }
    
}
