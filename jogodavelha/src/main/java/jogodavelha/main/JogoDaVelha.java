
package jogodavelha.main;

public class JogoDaVelha {
    private String [][] m = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };
    
    public String Mostrar(){
        for(int linha=0;linha<3;linha++){
            for(int coluna=0;coluna<3;coluna++){
                System.out.printf("   "+ m [linha][coluna]);
            }
            System.out.println("");
        }
        return null;
    }
    
    public boolean Valido(String posicao){
        for(int linha=0;linha<3;linha++){
            for(int coluna=0;coluna<3;coluna++){
                if(m[linha][coluna].equals(posicao)){
                     return true;
                }                             
            }
        }
        return false;
    }
   
    public void Jogada(String posicao, String jogador){
        if(posicao.equals("1")){
             m[0][0]=jogador;
        }    
        else if(posicao.equals("2")){
            m[0][1]=jogador;
        }
        else if(posicao.equals("3")){
             m[0][2]=jogador;
        }         
        else if(posicao.equals("4")){
            m[1][0]=jogador;
        }       
        else if(posicao.equals("5")){
            m[1][1]=jogador;
        }         
        else if(posicao.equals("6")){
            m[1][2]=jogador;
        }       
        else if(posicao.equals("7")){
            m[2][0]=jogador;
        }  
        else if(posicao.equals("8")){
            m[2][1]=jogador;
        }       
        else if(posicao.equals("9")){
            m[2][2]=jogador;
        }        
    }
    
    public String Ganhou(int jogadas){
        String[] T = new String [8];
        String vencedor = "null";
        
        if(jogadas == 9){
            vencedor = "EMPATE";
        }
        
        T[0] = m [0][0] + m[0][1]+ m[0][2];
        T[1] = m [1][0] + m[1][1]+ m[1][2];
        T[2] = m [2][0] + m[2][1]+ m[2][2];
        
        T[3] = m [0][0] + m[1][0]+ m[2][0];
        T[4] = m [0][1] + m[1][1]+ m[2][1];
        T[5] = m [0][2] + m[1][2]+ m[2][2];
        
        T[6] = m [0][0] + m[1][1]+ m[2][2];
        T[7] = m [0][2] + m[1][1]+ m[2][0];
        
        for(int i=0;i<T.length;i++){
            if(T[i].equals("XXX")){
               vencedor = "Jogador 1"; 
            }         
            else if(T[i].equals("OOO")){
                vencedor = "Jogador 2";
            }                
        }
        return vencedor;
    }
    
}
