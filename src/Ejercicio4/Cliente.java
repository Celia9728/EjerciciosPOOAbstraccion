package Ejercicio4;

public class Cliente {

    protected String nombre;
    protected String clave;

    private static final int MAX = 5;

    public Cliente(String nombre, String clase) {
        this.nombre = nombre;
        this.clave = validarClave(clave);
    }

    // VALIDACIONES
    private String validarClave(String cadena) {
        cadena = (cadena.length() > 5) ? cadena.substring(this.MAX) : cadena;
        return cadena;
    }
}
