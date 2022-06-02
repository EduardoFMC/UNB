/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretorortografico;

import java.util.*;

/**
 *
 * @author Eduardo
 */
public class CorretorOrtografico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        String[] vetorS;
        String palavraComparar, palavra;
        int num;
        
        num = in.nextInt();
        vetorS = new String[num];
        
        for(int i = 0; i < num; i++){
            palavra = in.next();
            vetorS[i] = palavra;

        }

        palavraComparar = in.next();

            for(int w = 0; w < num; w++){
            if (palavraComparar.equals(vetorS[w])){
                System.out.println("palavra correta");
                System.exit(0);
                
            }
            else{
                
                for(int j = 0; j < vetorS[w].length() - 1; j++){
                    char[] ch = vetorS[w].toCharArray();
                    char temp = ch[j];
                    
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                    
                    String str = new String(ch);
                    
                    if (str.equals(palavraComparar)){
                        System.out.println("palavra incorreta");
                        System.out.println(vetorS[w] + "?");
                        System.exit(0);
                    } 
                }
            }
        }
        System.out.println("palavra incorreta");
        System.out.println("nenhuma sugestão");
    }
    
}
