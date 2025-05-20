package Ejercicio4;

public class Articulo {

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje += "El nombre del articulo es: " + this.nombre;
        mensaje += "El precio del articulo es: " + this.precio;
        return mensaje;

    }
}
