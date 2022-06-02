package siterelacionamento;

import java.util.*;


/**
 *
 * @author Eduardo
 */
abstract class Contato{
    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }
    public String imprimirBasico(){
    
        return "Nome: " + this.nome + "\n"
                + "Apelido: " + this.apelido + "\n"
                + "Email: " + this.email + "\n"
                + "Aniversário: " + this.aniversario + "\n";
    }
    
    public abstract void imprimirContato();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    
}

class Amigos extends Contato{
    protected int grau;

    public Amigos(int grau, String nome, String apelido, String email, String aniversario) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato(){
        String grauV;
        if (this.grau == 1){
            grauV = "Melhor Amigo";
        }else if (this.grau == 2){
            grauV = "Amigo";
        }else {
            grauV = "Conhecido";
        }
        System.out.println(imprimirBasico() + "Grau: " + grauV);
    }
   
}

class Familia extends Contato{
    protected String parentesco;

    public Familia(String parentesco, String nome, String apelido, String email, String aniversario) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }
    
    @Override
    public void imprimirContato(){
        System.out.println(imprimirBasico() + "Parentesco: " + this.parentesco);
    }
}

class ColegasDetrabalho extends Contato{
    protected String tipo;

    public ColegasDetrabalho(String tipo, String nome, String apelido, String email, String aniversario) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }
    
    @Override
    public void imprimirContato(){
        System.out.println(imprimirBasico() + "Relacionamento de trabalho: " + this.tipo);
    }
}

public class SiteRelacionamento {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        ArrayList<Contato> arrayContato = new ArrayList<Contato>();
        String nome;
        String apelido;
        String email;
        String aniversario;
        String parentesco;
        int grau;
        String tipo;
        Amigos amigo;
        Familia familia;
        ColegasDetrabalho colega;
        
        while (true){
            String escolha = in.nextLine();
            
            switch (Integer.parseInt(escolha.substring(0,1))){
                case 1:
                    switch(Integer.parseInt(escolha.substring(2,3))){
                        case 1:
                            nome = in.next();
                            apelido = in.next();
                            email = in.next();
                            aniversario = in.next();
                            grau = in.nextInt();
                            amigo = new Amigos(grau,nome,apelido,email,
                                    aniversario);
                            arrayContato.add(amigo);
                            
                            in.nextLine();
                            break;
                            
                        case 2:
                            
                            nome = in.next();
                            apelido = in.next();
                            email = in.next();
                            aniversario = in.next();
                            parentesco = in.next();
                            familia = new Familia(parentesco, nome, apelido, 
                                    email, aniversario);
                            arrayContato.add(familia);
                            
                            in.nextLine();
                            break;
                            
                        case 3:
                            nome = in.next();
                            apelido = in.next();
                            email = in.next();
                            aniversario = in.next();
                            tipo = in.next();
                            colega = new ColegasDetrabalho(tipo, nome, apelido, 
                                    email, aniversario);
                            arrayContato.add(colega);
                            
                            in.nextLine();
                            break;
                    }
                    
                    break;
                case 2:
                    for(Contato contato: arrayContato){
                        contato.imprimirContato();
                    }
                    
                    break;
                case 3:
                    for(Contato contato: arrayContato){
                        if(contato instanceof Familia){
                            contato.imprimirContato();
                        }
                    }
                    break;
                case 4:
                    for(Contato contato: arrayContato){
                        if(contato instanceof Amigos){
                            contato.imprimirContato();
                        }
                    }
                    break;
                case 5:
                    for(Contato contato: arrayContato){
                        if(contato instanceof ColegasDetrabalho){
                            contato.imprimirContato();
                        }
                    }
                    break;
                case 6:
                    for(Contato contato: arrayContato){
                        if(contato instanceof Amigos){
                            if (((Amigos) contato).grau == 1){
                                contato.imprimirContato();
                            }
                        } else if(contato instanceof Familia){
                            if(((Familia) contato).parentesco.equals("irmão")){
                                contato.imprimirContato();
                            }
                        } else if (contato instanceof ColegasDetrabalho){
                            if(((ColegasDetrabalho) contato).tipo.equals("colega")){
                                contato.imprimirContato();
                            }
                        }
                    }
                    break;
                case 7:
                    int indice = in.nextInt();
                    if (indice <= arrayContato.size()){
                        arrayContato.get(indice-1).imprimirContato();
                    }
                    in.nextLine();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        
        }
    }
    
}
