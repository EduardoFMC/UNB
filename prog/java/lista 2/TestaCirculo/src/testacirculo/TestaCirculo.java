
package testacirculo;

import java.util.*;


class Circulo{
    private int x,y,raio;
    public static final double PI = 3.14159;
    public Circulo(int x, int y, int raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRaio(){
        return raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }
    public double circunferencia(){
        return 2* PI * raio;
    
    }
}

public class TestaCirculo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,x2,x3,y,y2,y3,raio,raio2,raio3,raiox,raioy,raioz;
        
        Circulo[] arr = new Circulo[3];
        Circulo[] arr2 = arr;
        Circulo[] arr3 = new Circulo[3];
        
        x = input.nextInt();
        y = input.nextInt();
        raio = input.nextInt();
        arr[0] = new Circulo(x,y,raio);
        arr3[0] = new Circulo(x,y,raio);
        x2 = input.nextInt();
        y2 = input.nextInt();
        raio2 = input.nextInt();
        arr[1] = new Circulo(x2,y2,raio2);
        arr3[1] = new Circulo(x2,y2,raio2);
        x3 = input.nextInt();
        y3 = input.nextInt();
        raio3 = input.nextInt();
        arr[2] = new Circulo(x3,y3,raio3);
        arr3[2] = new Circulo(x3,y3,raio3);

        raiox = input.nextInt();
        arr[0].setRaio(raiox);
        raioy = input.nextInt();
        arr[1].setRaio(raioy);
        raioz = input.nextInt();
        arr[2].setRaio(raioz);
        
        System.out.println("vetor1:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n", arr[i].getX(), arr[i].getY(), arr[i].getRaio());
        }
        
        System.out.println("vetor2:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n", arr2[i].getX(), arr2[i].getY(), arr2[i].getRaio());
        }
        
        System.out.println("vetor3:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n", arr3[i].getX(), arr3[i].getY(), arr3[i].getRaio());
        }
        
        
        /*
        Circulo circulo1, circulo2,circulo3;
        circulo1 = new Circulo(3,3,1);
        circulo2 = new Circulo(2,1,4);
        circulo3 = circulo1;
        
        System.out.println(circulo1.getX()+ " " + circulo1.getY());
        System.out.println(circulo2.getX()+ " " + circulo2.getY());
        System.out.println(circulo3.getX()+ " " + circulo3.getY());
        
        int circulo = (int) circulo1.circunferencia();
        System.out.print(circulo1.getRaio());
        System.out.print(" " + circulo);
        */
    }
    
}
