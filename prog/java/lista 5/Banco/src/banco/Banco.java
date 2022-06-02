/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;
import java.util.Scanner;

public class Banco {
    public static void main(String args[]) {
        int mat[][] = {{0,1,5},{3,2,10},{4,8,1}};
        int x =0;
        for(int i = 0; i <mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i+j < mat[i].length - 1 && mat[i][j] > x){
                    x = mat[i][j];
                }
            }
        }
        for(int i = 0; i <mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] *= x; 
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i+j > mat[i].length - 1){
                    mat[i][j] += x;    
                }
                
            }
        }
        
        for(int linhas[] : mat){
            for(int colunas : linhas){
                System.out.printf("%d ", colunas);
            }
        }
            
    }
}
