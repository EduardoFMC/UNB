
package manipularfrase;

import java.util.*;

class Frase{
    private String frase;
    
    public Frase(String fraseDada){
        this.frase = fraseDada;
    
    }
    public void setFrase(String fraseDada){
        this.frase = fraseDada;
    
    }
    
    public String getFrase(){
    
        return this.frase;
    }
    
    public int contarVogais(){
        String vogais = "aeiouáãâàéèêíìîóòõôùúû";
        String fraseL;
        int conta = 0;
        
        fraseL = this.frase.toLowerCase();
        
        for(int i = 0; i < this.frase.length(); i++){
            for(int j = 0; j < vogais.length(); j++){
                
                if ((fraseL.charAt(i)) == (vogais.charAt(j))){
                    conta ++;
                
                }
            }
        
        }
        
        return conta;
    }
     public int contarPalavras(){
        String[] palavras = this.frase.split("\\s+");
        
        return palavras.length;
    }


}
public class ManipularFrase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        String dado, dado2;
        Frase frase1, frase2;
        
        
        dado = in.nextLine();
        frase1 = new Frase(dado);
        dado2 = in.nextLine();
        frase2 = new Frase(dado2);
        
        System.out.println(frase1.contarPalavras());
        System.out.println(frase2.contarVogais());
        
        
    }
    
}
