/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Eduardo
 */
public class Chamada{
    private int id;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private String horarioPartida;
    private String horarioRetorno;
    private double kmInicial;
    private double kmFinal;
    private double valorTotal;
    private int idCliente;
    public Cliente cliente1;
    public Veiculo veiculo1;
    public Motorista motorista1;

    public Chamada(int id, String data, String tipo, String origem, String destino, String horarioPartida, 
            String horarioRetorno, double kmInicial, double kmFinal, double valorTotal, Cliente cliente1, Veiculo veiculo1, Motorista motorista1) {
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

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(String horarioRetorno) {
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
