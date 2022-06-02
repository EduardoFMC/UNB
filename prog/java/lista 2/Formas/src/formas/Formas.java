
package formas;

import java.util.*;


class Retangulo{
    private int comprimento = 1, largura = 1;
    
    public void setComprimento(int comprimento){
        if (comprimento < 20 && comprimento > 0){
            this.comprimento = comprimento;
        }
    }
    
    public void setLargura(int largura){
        if (largura < 20 && largura > 0){
            this.largura = largura;
        }
    }
    
    public int getComprimento(){
        return comprimento;
    }
    public int getLargura(){
        return largura;
    }
    
    public int perimetro(){
        return (2 * (comprimento + largura));
    }
    
    public int area(){
        return (comprimento * largura);
    }

}


public class Formas {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,a,b;
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        
        x = input.nextInt();
        y = input.nextInt();
        retangulo1.setComprimento(x);
        retangulo1.setLargura(y);
        
        a = input.nextInt();
        b = input.nextInt();
        retangulo2.setComprimento(a);
        retangulo2.setLargura(b);
        
        System.out.printf("%d %d %d %d\n", retangulo1.getComprimento(), retangulo1.getLargura(), retangulo1.perimetro(), retangulo1.area());
        System.out.printf("%d %d %d %d\n", retangulo2.getComprimento(), retangulo2.getLargura(), retangulo2.perimetro(), retangulo2.area());
    }
    
}
