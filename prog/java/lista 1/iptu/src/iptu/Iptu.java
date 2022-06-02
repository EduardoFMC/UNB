/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iptu;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Iptu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        int lote, area;
        float iptu;
        
        lote = input.nextInt(); // lote
        area = input.nextInt(); // area
        
        switch(lote){
            case 1 ->{
                if (area <= 0){
                    
                    System.out.println("Entrada inválida!");         
                    System.exit(0);
                
                } else if (area < 200){
                    iptu = (area * 1);
                    System.out.printf("%.2f", iptu);
                
                } else{
                    iptu = (area * 1.2f);
                    System.out.printf("%.2f", iptu);
                
                }
                
                break;
            }
            case 2 ->{
                if (area <= 0){
                    
                    System.out.println("Entrada inválida!");         
                    System.exit(0);
                
                } else if (area < 200){
                    iptu = (area * 1.1f);
                    System.out.printf("%.2f", iptu);                
                } else{
                    iptu = (area * 1.3f);
                    System.out.printf("%.2f", iptu);                
                }            
                break;
            }
            
            default ->{
                System.out.println("Entrada inválida!");
                System.exit(0);
                break;           
            }
        }
    }                
}
