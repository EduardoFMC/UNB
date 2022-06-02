
package temperaturac;

import java.util.*;

class Temperatura{
    private double temperatura;
    
    public Temperatura(double temperatura){
        this.temperatura = temperatura;
    }
    
   
    @Override
    public String toString(){
        return "" + this.temperatura + "";
    }
    
    public void converterCF(){
    
        this.temperatura = (this.temperatura * 9.0 / 5.0 + 32.00);
    }
    public void converterFC(){
    
        this.temperatura = ((this.temperatura - 32.00) * 5.0 / 9.0);
    }
}


public class TemperaturaC {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dado;
        Temperatura grau;
        
        dado = input.nextDouble();
        grau = new Temperatura(dado);
        
        grau.converterCF();
        System.out.println("temperatura: " + grau.toString() + " graus fahrenheit");
        grau.converterFC();
        System.out.println("temperatura: " + grau.toString() + " graus celsius");
    }
    
}
