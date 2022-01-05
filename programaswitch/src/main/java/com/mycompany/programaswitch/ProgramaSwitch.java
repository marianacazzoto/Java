/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programaswitch;

import java.util.Scanner;

/**
 *
 * @author Mariana Cazzoto
 */
public class ProgramaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner (System.in);
        
        System.out.println("Quantas Pernas:");
        
        int perna = tec.nextInt();
        
        String tipo;
        
        System.out.println("Isso é um(a): ");
        
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println(tipo);
    }
    
}
