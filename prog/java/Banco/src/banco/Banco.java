
package banco;
import java.util.*;

class Conta{
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;
    
    public Conta(String nomeCliente, int numeroConta, double saldo, int senha){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
                
    
    }
    
    public int getNumeroConta(){
        return numeroConta;
    
    }
    public String getNomeCliente() {
        return nomeCliente;
    
    }
    public int getSenha(){
        return senha;
    
    }
    public double getSaldo(int senha){
        
        if (senha == this.senha){
            return saldo;
        }         
        return 0;
    }
    
    public boolean sacar(double valorSacar, int senha){
        if ((valorSacar < saldo) && (valorSacar > 0.0) 
                                        && (senha == this.senha)){
            
            this.saldo -= valorSacar;
            
            return true;
        }else{
            
            return false;
        }       
    }
    
    public boolean depositar(double valorDepositar, int senha){
        if ((valorDepositar > 0.0) && (senha == this.senha)){
            this.saldo += valorDepositar;
            return true;
        }else{
            return false;
        
        }
    }
    
    public boolean tranferir(double valorTrans, Conta conta2 , int senha){
        if ((valorTrans < saldo) && (valorTrans > 0.0) && (senha == this.senha)){
            this.saldo -= valorTrans;
            conta2.saldo += valorTrans;
            return true;
            
        }else{       
            return false;        
        }     
    }

  
}

public class Banco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        String nome1, nome2, nomeDado;
        int numero1, numero2;
        double saldo1, saldo2, valorSacar, valorDepositar, valorTrans;
        int senha1, senha2, senhaDada;
        int controle;
           
        numero1 = input.nextInt();
        senha1 = input.nextInt();
        nome1 = input.next();
        saldo1 = input.nextDouble();
        Conta conta1 = new Conta(nome1, numero1, saldo1, senha1);
        
        numero2 = input.nextInt();
        senha2 = input.nextInt();
        nome2 = input.next();
        saldo2 = input.nextDouble();
        Conta conta2 = new Conta(nome2, numero2, saldo2, senha2);
        
        while (true){
            controle = input.nextInt();
            switch(controle){
                case 1 -> {
                    senhaDada = input.nextInt();
                    
                    if (senhaDada == conta1.getSenha()){
                        System.out.printf("%.2f\n",conta1.getSaldo(senhaDada));
                                
                    }else{
                    
                        System.out.println("senha incorreta");
                    }
                }
                case 2-> {
                    valorSacar = input.nextDouble();
                    senhaDada = input.nextInt();
                    
                    if (conta1.sacar(valorSacar, senhaDada)){
                        System.out.println("saque realizado");
                    }else{
                        System.out.println("saque não realizado");
                    }
                    
                    break;
                }
                case 3-> {
                    valorDepositar = input.nextDouble();
                    senhaDada = input.nextInt();
                    
                    if (conta1.depositar(valorDepositar, senhaDada)){
                        System.out.println("depósito realizado");
                    }else{
                        System.out.println("depósito não realizado");
                    }
                    
                    break;
                  
                }
                case 4-> {
                    nomeDado = input.next();
                    
                    if (nomeDado.equals(conta2.getNomeCliente())){
                        valorTrans = input.nextDouble();
                        senhaDada = input.nextInt();
                        
                        if (conta1.tranferir(valorTrans, conta2, senhaDada)){
                            System.out.println("transferência realizada");
                        }else{
                            System.out.println("transferência não realizada");
                        }
                        
                    }else{
                        System.out.println("nenhum usuário encontrado");
                    }
                   
                  
                    break;
                }
                case 5-> {
                    
                    System.exit(0);
                    break;
                }
            
            }
        
        }
        
    }
    
}