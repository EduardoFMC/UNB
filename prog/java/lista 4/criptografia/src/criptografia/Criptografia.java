
package criptografia;

import java.util.*;

class criptografiaa{
    private String frase;
    
    public criptografiaa(String frase){
        this.frase = frase;
    
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
   
    
    public String criptografarFrase(){
        String vogais = "aeiouáãâàéèêíìîóòõôùúûAEIOUÁÃÂÀÉÈÊÍÌÎÓÒÕÔÙÚÛ";
        
        for(int i = 0; i < this.frase.length(); i++){
            for(int j = 0; j < vogais.length(); j++){
                if ((this.frase.charAt(i)) == (vogais.charAt(j))){
                    this.frase = this.frase.replace(this.frase.charAt(i), '*');
                
                }
            }
        }

        return this.frase;
    }
}


public class Criptografia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        String dado, dado2, dado3;
        criptografiaa frase1, frase2;
        
        
        dado = in.nextLine();
        frase1 = new criptografiaa(dado);
        dado2 = in.nextLine();
        frase2 = new criptografiaa(dado2);
        dado3 = in.nextLine();
        frase1.setFrase(dado3);
        
        System.out.println(dado2);
        System.out.println(frase1.criptografarFrase());
        
        
    }
    
}
