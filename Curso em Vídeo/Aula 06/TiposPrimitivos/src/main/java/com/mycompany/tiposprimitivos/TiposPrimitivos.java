/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Mariana Cazzoto
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua nota: ");
        float nota = teclado.nextFloat();
        
        System.out.println("Você foi aprovado(a): ");
        Boolean aprov = teclado.nextBoolean();
        
        System.out.format("A nota de %s é %.2f. Você foi aprovado? %b" , nome,nota,aprov);
    }
    
}
