/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoideal;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Eduardo
 */
public class pesoideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
          // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        double altura, peso_ideal;
        char sexo;

        altura = input.nextFloat();
        
        sexo = input.next().charAt(0);
        

        if (altura <= 0){
            System.out.println("Entrada inválida!");
            System.exit(0);

        }

        switch(sexo){
            case 'm' -> {
                peso_ideal =  (72.7 * altura) - 58;
                System.out.println(df.format(peso_ideal) + " kg");
                break;
            }

            case 'f' -> {
                peso_ideal =  (62.1 * altura) - 44.7;
                System.out.println(df.format(peso_ideal) + " kg");
                break;
            }

            default -> {
                System.out.println("Entrada inválida!");
            
                System.exit(0);
                break;
            }
        }
        
    }   
}
