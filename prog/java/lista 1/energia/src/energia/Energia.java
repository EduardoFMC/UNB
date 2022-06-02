/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energia;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class Energia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float consumo, total, custo;
        float valorFixo = 5;
        
        consumo = input.nextFloat();
        
        if (consumo <= 500){
            total = (consumo * 0.02f) + valorFixo;
            custo = (consumo * 0.02f);
            System.out.printf("%.2f %.2f %.2f", custo, valorFixo, total);
            
        } else if ((consumo > 500) && (consumo <= 1000)){
            total = (500 * 0.1f) + ((consumo - 500) * 0.05f) + valorFixo;
            custo = (500 * 0.1f) + ((consumo - 500) * 0.05f);
            System.out.printf("%.2f %.2f %.2f", custo, valorFixo, total);
        
        } else if(consumo > 1000){
            total = (1000 * 0.35f) + ((consumo - 1000) * 0.1f) + valorFixo;
            custo = (1000 * 0.35f) + ((consumo - 1000) * 0.1f);
            System.out.printf("%.2f %.2f %.2f", custo, valorFixo, total);
        
        }
        
    }
    
}
