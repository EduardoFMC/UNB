
package usaimpressora;

import java.util.*;

class Impressora{
    String modelo, tipoPapel, cor;
    boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;
    
    
    public void ligar(){
        if (!ligada){
            this.ligada = true;
            System.out.println("ligando...");
        }            
    }
    
    public void desligar(){
        if (ligada){
            this.ligada = false;
            System.out.println("desligando...");
        }
    }
    
    public void imprimir(){
        if (ligada && papel){
            System.out.println("imprimindo...");
            
        }else if(ligada && !papel){
            System.out.println("sem papel");
        
        }else{
            System.out.println("impressora desligada");
        }
    }
    
    public void digitalizar(){
        if (ligada && digitalizadora){
            System.out.println("digitalização sendo realizada...");
            
        }else if (ligada && !digitalizadora){
            System.out.println("não é possível digitalizar");
        }else{
            System.out.println("impressora desligada");
        }
    }
    public void copiar(){
        if (ligada && copiadora){
            System.out.println("cópia sendo realizada...");
            
        }else if (ligada && !copiadora){
            System.out.println("não é possível copiar");
        }else{
            System.out.println("impressora desligada");
        }
    }
    
    public void status(){
        if (bluetooth){
            System.out.println("bluetooth on");
        }else{
            System.out.println("bluetooth off");
        }
        
        if (wifi ){
            System.out.println("wifi on");
        }else{
            System.out.println("wifi off");
        }
        
        if (colorida){
            System.out.println("impressão colorida");
        }else{
            System.out.println("impressão preto e branco");
        }
        
        if (ligada){
            System.out.println("impressora on");
        }else{
            System.out.println("impressora off");
        }
        
        if (papel){
            System.out.println("tem papel");
        }else{
            System.out.println("não tem papel");
        }
        
        if (digitalizadora){
            System.out.println("digitalizadora on");
        }else{
            System.out.println("digitalizadora off");
        }
        
        if (copiadora){
            System.out.println("copiadora on");
        }else{
            System.out.println("copiadora off");
        }
        
    }
}


public class UsaImpressora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String modelo, cor, tipo;
        Impressora impres = new Impressora();
        
        modelo = input.next();
        cor = input.next();
        tipo = input.next();
        
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipo);
        
        impres.bluetooth = true;
        impres.wifi = true;
        impres.colorida = true;
        impres.papel = true;
        impres.digitalizadora = true;

        impres.status();
        
        impres.ligar();
        impres.digitalizar();
        impres.copiar();
        impres.desligar();
        impres.imprimir();
        
        
    }
    
}
