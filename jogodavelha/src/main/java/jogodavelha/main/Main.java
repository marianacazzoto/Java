
package jogodavelha.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        String posicao;
        int valida = 0, Jogadas = 0;
        
        while(true){
            System.out.println("::::Jogo da Velha::::");
            jogo.Mostrar();
            
            do{
                System.out.println("Jogador 1,informe sua posição:  ");
                posicao = ler.next();
                
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida,tente novamente!");
                    System.out.println("Jogador 1,informe sua posição:  ");
                    posicao = ler.next();
                    
                    valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida=1;
            }
            while(valida == 0);
            
            Jogadas++;   
            valida = 0;
            if(!jogo.Ganhou(Jogadas).equals("null")){
                break;
            }
            
            do{
                System.out.println("Jogador 2,informe sua posição:  ");
                posicao = ler.next();
                
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida,tente novamente!");
                    System.out.println("Jogador 2,informe sua posição:  ");
                    posicao = ler.next();
                    
                    valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida=1;
            }
            while(valida == 0);
            
            Jogadas++;   
            valida = 0;
            if(!jogo.Ganhou(Jogadas).equals("null")){
                break;
            }    
        }
        System.out.println("O "+jogo.Ganhou(Jogadas)+ " Venceu");
    }
}
