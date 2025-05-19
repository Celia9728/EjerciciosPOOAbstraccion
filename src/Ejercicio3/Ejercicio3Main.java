package Ejercicio3;

public class Ejercicio3Main {

    public static void main(String[] args) {
                Conjunto c2 = new Conjunto(3);
        
        c2.aniadir(1);
        c2.aniadir(2);
        c2.aniadir(4);
         
        Conjunto c1 = new Conjunto(5);
        
        c1.aniadir(2);
        c1.aniadir(1);
        c1.aniadir(4);
        c1.aniadir(8);
        c1.aniadir(4);
        
        Conjunto c3 = c1.interseccion(c2);
        
        
        System.out.println(c3);
    }

}
