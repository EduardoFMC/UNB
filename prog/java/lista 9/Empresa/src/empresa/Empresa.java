package empresa;
/**
 *
 * @author Eduardo
 */

import java.util.*;

interface Classificavel{
    public boolean menorElemento(Classificavel obj);

}

class Produto implements Classificavel{
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Produto compara = (Produto) obj;
        
        return this.codigo < compara.codigo;
    }
    
    @Override
    public String toString(){
    
        return this.codigo + " " + this.nome + " " + this.preco;
    }
}

class Cliente implements Classificavel{
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        
        int comparedResult = this.nome.compareTo(compara.nome);

        if (comparedResult > 0) {
            return false;
        } else if (comparedResult < 0) {
            return true;
        } else {
            return true;
        }
       
    }
    
    @Override
    public String toString(){
    
        return this.cpf + " " + this.nome + " " + this.endereco;
    }
}

class Servico implements Classificavel{
    private double preco;
    private String data;
    private String tipoServico;

    public Servico(String tipoServico, double preco, String data) {
        this.tipoServico = tipoServico;
        this.preco = preco;
        this.data = data;
     
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Servico compara = (Servico) obj;
        
        return this.preco < compara.preco;
    }
    
    @Override
    public String toString(){
    
        return this.tipoServico + " " + this.preco + " " + this.data;
    }
}

class Classificador{
    public void ordena(Classificavel[] a){
        Classificavel elem, menor;
        int pos;
        
        for (int i = 0; i < a.length -1 ; i++){
            elem = a[i];
            menor = a[i+1];
            pos = i+1;
            
            for (int j = i + 2; j < a.length; j++){
                if(a[j].menorElemento(menor)){
                    menor = a[j];
                    pos = j;
                }
            }
            
            if(menor.menorElemento(elem)){
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    
    }

}

public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        
        int numProduto = in.nextInt();
        int numCliente = in.nextInt();
        int numServico = in.nextInt();
        in.nextLine();
        
        Produto[] vecProdutos = new Produto[numProduto];
        Cliente[] vecClientes = new Cliente[numCliente];
        Servico[] vecServicos = new Servico[numServico];
        Classificador classi = new Classificador();
        
        for(int i=0; i < numProduto; i++){
            int codP = in.nextInt();
            String nomeP = in.next();
            double precoP = in.nextDouble();
            Produto produto = new Produto(codP, nomeP, precoP);
            vecProdutos[i] = produto;
            in.nextLine();
        }
        classi.ordena(vecProdutos);
        for(int i=0; i < numCliente; i++){
            String cpf = in.next();
            String nomeC = in.next();
            String endereco = in.next();
            Cliente cliente = new Cliente(cpf,nomeC,endereco);
            vecClientes[i] = cliente;
            in.nextLine();
        }
        classi.ordena(vecClientes);
        for(int i=0; i < numServico; i++){
            String tipo = in.next();
            double preco = in.nextDouble();
            String data = in.next();
            Servico servico = new Servico(tipo, preco, data);
            vecServicos[i] = servico;
            in.nextLine();
        }
        classi.ordena(vecServicos);
        
        
        
        for(int i=0; i < numProduto; i++){
            System.out.println(vecProdutos[i].toString());
        }
        for(int i=0; i < numCliente; i++){
            System.out.println(vecClientes[i].toString());
        }
        for(int i=0; i < numServico; i++){
            System.out.println(vecServicos[i].toString());
        }
    }
    
}
