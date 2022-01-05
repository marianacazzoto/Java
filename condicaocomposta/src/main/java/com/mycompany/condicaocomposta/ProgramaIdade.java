/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author Mariana Cazzoto
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu ano de nascimeto:");
        int nasc = teclado.nextInt();
        
        int i = 2022 -  nasc;
        
        System.out.println("Sua idade é: " + i);
        
        if(i>=18){
            System.out.println("Maior de Idade");
        }
        
        else{
            System.out.println("Menor de idade");
        }
    }
    
}
