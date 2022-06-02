/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Controle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cont_h = 0, cont_m = 0;
        float h_arrecadado = 0, m_arrecadado = 0, total = 0;
        char sexo;
        
        while(true){
            sexo = input.next().charAt(0);  
            if (sexo == 'q'){
                h_arrecadado = 12.5f * cont_h;
                m_arrecadado = 7.4f * cont_m;
                total = h_arrecadado + m_arrecadado;
                
                System.out.printf("%d %d\n", cont_h, cont_m);
                System.out.printf("%.2f %.2f %.2f\n", h_arrecadado, m_arrecadado, total);
                break;
            
            }else if (sexo == 'h'){
                cont_h += 1;
            
            }else if (sexo == 'm'){
                cont_m += 1;
            
            }
        }
    }
    
}
