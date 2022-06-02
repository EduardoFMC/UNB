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
public class Cliente{
    private int id;
    private String RG;
    private String CPF;
    private String nome;
    private String telefone;

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
