/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siglasinternet;

import java.util.*;

/**
 *
 * @author Eduardo
 */
public class SiglasInternet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        int num;
        List<String> palavras = new ArrayList<String>();
        String frase;
        
        num = in.nextInt();

        in.nextLine();
        for (int i = 0; i < num; i++){
            
            String fraseDada = in.nextLine();
            
            String [] palavrasSplit = fraseDada.split("\\s+");
            
            
            for(String w:palavrasSplit){
                palavras.add(w);

            }          
        }

        frase = in.nextLine();

        String[] fraseS = frase.split("\\s+");
        
        
        for (String x:fraseS){
            
            for (int j = 0; j < num*2; j++){
                if (x.toUpperCase().equals(palavras.get(j).toUpperCase())){
                    frase = frase.replaceAll(x, palavras.get(j+1));
                }
                
                
            }
        
        }
        System.out.println(frase);
    }
}
