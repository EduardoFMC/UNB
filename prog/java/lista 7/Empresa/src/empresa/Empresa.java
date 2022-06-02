package empresa;

/**
 *
 * @author Eduardo
 */
import java.util.*;

class Funcionario{
    private String nome;
    private String dataNascimento;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}

class Chefe extends Funcionario{
    private String departamento;

    public Chefe() {
    }

    public Chefe(String departamento, String nome, String dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}

class Vendedor extends Funcionario{
    private float comissaovenda;
    private int quantidadeVendas;

    public Vendedor() {
    }

    public Vendedor(float comissaovenda, int quantidadeVendas, String nome, String dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.comissaovenda = comissaovenda;
        this.quantidadeVendas = quantidadeVendas;
        salario = salario + comissaovenda*quantidadeVendas;
        super.setSalario(salario);
        
    }

    public float getComissaovenda() {
        return comissaovenda;
    }

    public void setComissaovenda(float comissaovenda) {
        this.comissaovenda = comissaovenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    
    
}

class Operario extends Funcionario{
    private float valorProducao;
    private int quantidadeProduzida;

    public Operario() {
    }

    public Operario(float valorProducao, int quantidadeProduzida, String nome, String dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
        salario = salario + valorProducao*quantidadeProduzida;
        super.setSalario(salario);
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    
}

class Horista extends Funcionario{
    private float valorHora;
    private int totalHoras;

    public Horista() {
    }

    public Horista(float valorHora, int totalHoras, String nome, String dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
        salario = salario + valorHora*totalHoras;
        super.setSalario(salario);
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}

class FolhaPagamento{
    public void mostraPagamentos(String nome, String cidade, String mes, Funcionario funcionarios[]){
        for(int i = 0; i < 4; i++){
            if (funcionarios[i] instanceof Chefe){
                Chefe c = (Chefe)funcionarios[i];
                System.out.println("Nome: " + c.getNome());
                System.out.println("Data de Nascimento: " + c.getDataNascimento());
                System.out.println("Salário: R$"+ c.getSalario());
                System.out.println("Departamento: "+c.getDepartamento());
                System.out.println("Cargo: chefe");
                System.out.println();
                
            }else if (funcionarios[i] instanceof Vendedor){
                Vendedor v = (Vendedor)funcionarios[i];
                System.out.println("Nome: "+ v.getNome());
                System.out.println("Data de Nascimento: "+ v.getDataNascimento());
                System.out.println("Salário: R$"+v.getSalario());
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: R$"+v.getComissaovenda());
                System.out.println("Número de vendas: "+v.getQuantidadeVendas());
                System.out.println();
                
            }else if (funcionarios[i] instanceof Operario){
                Operario o = (Operario)funcionarios[i];
                System.out.println("Nome: " + o.getNome());
                System.out.println("Data de Nascimento: " + o.getDataNascimento());
                System.out.println("Salário: R$" + o.getSalario());
                System.out.println("Cargo: Operário");
                System.out.println("Valor por Produção: R$" + o.getValorProducao());
                System.out.println("Quantidade produzida: " + o.getQuantidadeProduzida());
                System.out.println();
            
            
            }else if (funcionarios[i] instanceof Horista){
                Horista h = (Horista)funcionarios[i];
                System.out.println("Nome: " + h.getNome());
                System.out.println("Data de Nascimento: " + h.getDataNascimento());
                System.out.println("Salário: R$" + h.getSalario());
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: R$" + h.getValorHora());
                System.out.println("Total de horas: " + h.getTotalHoras());
            
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
        Chefe chefe;
        Vendedor vendedor;
        Operario operario;
        Horista horista;
        FolhaPagamento folha = new FolhaPagamento();
        Funcionario[] funcionario = new Funcionario[4];
        
        String nomeEmpresa = in.next();
        String nomeCidade = in.next();
        String mesPagamento = in.next();
        
        in.nextLine();
        
        String nomeChefe = in.next();
        String DataNascimentoC = in.next();
        float salarioChefe = in.nextFloat();
        String departamento = in.next();
        
        chefe = new Chefe(departamento,nomeChefe,DataNascimentoC,salarioChefe);
        
        in.nextLine();
        
        String nomeVendedor = in.next();
        String dataNascimentoV = in.next();
        float salarioVendedor  = in.nextFloat();
        float comissaoVenda = in.nextFloat();
        int quantidadeVendas = in.nextInt();
        
        vendedor = new Vendedor(comissaoVenda, quantidadeVendas, nomeVendedor, dataNascimentoV, salarioVendedor);
        
        in.nextLine();
        
        String nomeOperario = in.next();
        String dataNascimentoO = in.next();
        float salarioOperario  = in.nextFloat();
        float valorProducao = in.nextFloat();
        int quantidadeProduzida = in.nextInt();
        
        operario = new Operario(valorProducao, quantidadeProduzida, nomeOperario, dataNascimentoO, salarioOperario);
        
        in.nextLine();
        
        String nomeH = in.next();
        String dataNascimentoH = in.next();
        float salarioH  = in.nextFloat();
        float valorHoras = in.nextFloat();
        int totalHoras = in.nextInt();
        
        horista = new Horista(valorHoras, totalHoras, nomeH, dataNascimentoH, salarioH);
        
        funcionario[0] = chefe;
        funcionario[1] = vendedor;
        funcionario[2] = operario;
        funcionario[3] = horista;
        
        System.out.println("Nome da Empresa: "+ nomeEmpresa);
        System.out.println("Endereço: "+ nomeCidade);
        System.out.println("Mês: "+mesPagamento);
        System.out.print("\n");
        
        folha.mostraPagamentos(nomeEmpresa, nomeCidade, mesPagamento, funcionario);
    }
    
}
