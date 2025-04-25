
package Ejercicio3;

public class Ejercicio3Main {

    public static void main(String[] args) {
        Coleccion c = new Coleccion(5);
        
        c.aniadir(5);
        c.aniadir(7);
        c.aniadir(3);
        c.aniadir(1);
        c.aniadir(2);
        
//        c.mostrarArray();
        
        c.eliminar(7);
        c.mostrarArray();
        
    }
    
}
