
package empresataxi;

import java.util.*;

class Chamada{
    private int id;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private float horarioPartida;
    private float horarioRetorno;
    private double kmInicial;
    private double kmFinal;
    private double valorTotal;
    private int idCliente;
    Cliente cliente1;
    Veiculo veiculo1;
    Motorista motorista1;

    public Chamada(int id, String data, String tipo, String origem, String destino, float horarioPartida, 
            float horarioRetorno, double kmInicial, double kmFinal, double valorTotal, Cliente cliente1, Veiculo veiculo1, Motorista motorista1, int idCliente) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioRetorno = horarioRetorno;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.valorTotal = valorTotal;
        this.cliente1 = cliente1;
        this.veiculo1 = veiculo1;
        this.motorista1 = motorista1;
        this.idCliente = idCliente;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(float horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public float getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(float horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(float kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(float kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}

class Motorista{
    private int id;
    private String nome;
    private String telefone;
    private String CNH;
    

    public Motorista(int id, String nome, String telefone, String CNH) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.CNH = CNH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
       
}

class Cliente{
    int id;
    String RG;
    String CPF;
    String nome;
    String telefone;

    public Cliente(int id, String RG, String CPF, String nome, String telefone) {
        this.id = id;
        this.RG = RG;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void abrirChamado(){
    
    }
}

public class EmpresaTaxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        String placa, marca, modelo, cor, nomeM, telefoneM, CNHM, RGC, CPFC, nomeC, telefoneC;
        int ano, idM, idC;
        int idCH;
        String dataCH;
        String tipoCH;
        String origemCH;
        String destinoCH;
        float horarioPartidaCH;
        float horarioRetornoCH;
        double kmInicialCH;
        double kmFinalCH;
        double valorTotalCH;
        Chamada chamada1;
        Veiculo veiculo1;
        Motorista motorista1;
        Cliente cliente1;
        
        placa = in.next();
        marca = in.next();
        modelo = in.next();
        cor = in.next();
        ano = in.nextInt();
        
        in.nextLine();
        veiculo1 = new Veiculo(placa, marca, modelo, cor, ano);
        
        idM = in.nextInt();
        nomeM = in.next();
        telefoneM = in.next();
        CNHM = in.next();
        
        in.nextLine();
        motorista1 = new Motorista(idM, nomeM, telefoneM, CNHM);
        
        idC = in.nextInt();
        RGC = in.next();
        CPFC = in.next(); 
        nomeC = in.next();
        telefoneC = in.next();
        
        in.nextLine();
        cliente1 = new Cliente(idC, RGC, CPFC, nomeC, telefoneC);
        
        
        idCH = in.nextInt();
        dataCH = in.next();
        tipoCH = in.next();
        origemCH = in.next();
        destinoCH = in.next();
        horarioPartidaCH = in.nextFloat();
        horarioRetornoCH = in.nextFloat();
        kmInicialCH = in.nextDouble();
        kmFinalCH = in.nextDouble();
        valorTotalCH = in.nextDouble();
        
        in.nextLine();
        chamada1 = new Chamada(idCH, dataCH, tipoCH, origemCH, destinoCH, horarioPartidaCH, 
                horarioRetornoCH, kmInicialCH, kmFinalCH, valorTotalCH, cliente1, veiculo1, motorista1, idC);
        
        System.out.println(chamada1.getId());
        System.out.println(chamada1.getDestino());
        System.out.println(chamada1.veiculo1.getPlaca());
        System.out.println(chamada1.cliente1.getNome());
        System.out.println(chamada1.motorista1.getNome());
    }
    
}
