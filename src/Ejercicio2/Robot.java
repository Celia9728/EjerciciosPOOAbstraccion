
package Ejercicio2;

public abstract class Robot {
    protected String nombre;
    protected int aguante;
    protected int velocidad;
    protected int potencia;

    public Robot(String nombre, int aguante, int velocidad, int potencia) {
        this.nombre = nombre;
        this.aguante = aguante;
        this.velocidad = velocidad;
        this.potencia = potencia;
    }
    
    public abstract void combatir(Robot robot);
    
    public abstract void mostrar();
    
}
