/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venda;

import java.util.*;
import java.util.Arrays;

/**
 *
 * @author Eduardo
 */
public class Venda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String[] arrayNome;
        List<String> naoEncontrados = new ArrayList<>();
        
        int[] arrayQtd;
        int qtdTotal, qtdProdutos;
        String nomeProduto, venda;
         
        qtdTotal = input.nextInt();
        arrayNome = new String[qtdTotal];
        arrayQtd = new int[qtdTotal];
        
        for (int i = 0; i < qtdTotal; i++) {   
            nomeProduto = input.next();
            qtdProdutos = input.nextInt();
            
            arrayNome[i] = nomeProduto;
            arrayQtd[i] = qtdProdutos;
        }
        
        while (true){
            venda = input.next();
            boolean flag = false;
            int index = 0;
                    
            for(int i = 0; i < arrayNome.length; i++) {
                if(arrayNome[i].equals(venda)) {
                    index = i;
                    flag = true;
                    break;
                }
            }
            
            if ("fim".equals(venda)){
                break;
            
            } else if(flag){
                
                int qtdVendido = input.nextInt();
                arrayQtd[index] = arrayQtd[index] - qtdVendido;
                System.out.printf("%s %d\n", venda, qtdVendido);

            }else{
                naoEncontrados.add(venda);
                System.out.printf("%s produto não encontrado\n", venda);
            
            }
            
                  
        }
        /*for (int i = 0; i <  naoEncontrados.size(); i++) {
            System.out.printf("%s produto não encontrado\n", naoEncontrados.get(i));
        } */
        for (int i = 0; i < qtdTotal; i++) {
            
            System.out.printf("%s %d\n", arrayNome[i], arrayQtd[i]);   
        }
    }
    
}
