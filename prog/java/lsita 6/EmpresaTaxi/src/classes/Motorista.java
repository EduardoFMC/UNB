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
public class Motorista{
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
