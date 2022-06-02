package veiculos;

/**
 *
 * @author Eduardo
 */
import java.util.*;
class Veiculo{
    protected String placa;
    protected int numeroPortas;
    protected float preco;

    public Veiculo() {
    }

    public Veiculo(String placa, int numeroPortas, float preco) {
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getnumeroPortas() {
        return numeroPortas;
    }

    public void setnumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
    
        return "Placa: "+placa+" Número de portas: "+numeroPortas+" Preço: R$" + preco;
    }
}

class Carro extends Veiculo{
    private String cor;

    public Carro() {
    }

    public Carro(String cor) {
        this.cor = cor;
    }

    public Carro(String cor, String placa, int numeroPortas, float preco) {
        super(placa, numeroPortas, preco);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString(){
    
        return "Placa: "+placa+" Número de portas: "+
                numeroPortas+" Preço: R$" + preco+" Cor: "+cor;
    }

}

class Moto extends Veiculo{
    private int qtdeCilindradas;

    public Moto() {
    }

    public Moto(int qtdeCilindradas, String placa, int numeroPortas, float preco) {
        super(placa, numeroPortas, preco);
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }
    
    @Override
    public String toString(){
    
        return "Placa: "+placa+" Número de portas: "+
                numeroPortas+" Preço: R$" + preco+" Quantidade de cilindradas: "+qtdeCilindradas;
    }
    
}


public class Veiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in, "UTF-8");
        Veiculo veiculo;
        Moto moto;
        Carro carro;
        
        String placa1 = in.next();
        int numPortas1 = in.nextInt();
        int preco1 = in.nextInt();
        veiculo = new Veiculo(placa1,numPortas1,preco1);
        
        in.nextLine();
        
        String placa2 = in.next();
        int numPortas2 = in.nextInt();
        float preco2 = in.nextFloat();
        String cor1 = in.next();
        carro = new Carro(cor1,placa2, numPortas2,preco2);
        
        in.nextLine();
        
        String placa3 = in.next();
        int numPortas3 = in.nextInt();
        float preco3 = in.nextFloat();
        int qtdeCilindradas = in.nextInt();
        moto = new Moto(qtdeCilindradas, placa3, numPortas3, preco3);
        
        in.nextLine();
        
        System.out.println(veiculo.toString());
        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
    
}
