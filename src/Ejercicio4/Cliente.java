package Ejercicio4;

public abstract class Cliente {

    protected String nombre;
    protected String clave;
    
    public Compra[] historial = new Compra[50];
    int contadorHistorial;
    
    private static final int MAX = 5;

    public Cliente(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = validarClave(clave);
        contadorHistorial = 0;
    }

    public abstract double calcularDescuento(double dineroGastado);
    
    public double calcularCompra(String fechaCompra, Articulo[] listaArticulos){
        Compra nuevaCompra = new Compra(fechaCompra, listaArticulos);
        
        if (contadorHistorial >= 50) {
            System.out.println("Esta lleno, no gastes tanto cabron");
        } else{
            historial[contadorHistorial] = nuevaCompra;
            contadorHistorial++;
        }
        return nuevaCompra.getPrecioTotalPagar();
    }
    
    public void mostrarHistorial(){
        for (int i = 0; i < this.historial.length; i++) {
            System.out.println(historial[i]);
        }
    }
    
    public double dineroTotalGastado(){
        double dineroTotalGastado = 0;
        for (int i = 0; i < this.historial.length; i++) {
            dineroTotalGastado += this.calcularCompra(historial[i].getFechaCompra(), historial[i].getListaArticulos());
        }
        return dineroTotalGastado;
    }
    
    @Override
    public String toString() {
        String mensaje;
        mensaje = "Nombre: " + this.nombre;
        mensaje += "Clave: " + this.clave;
        return mensaje;
    }

    // VALIDACIONES
    private String validarClave(String cadena) {
        cadena = (cadena.length() > 5) ? cadena.substring(0, MAX) : cadena;
        return cadena;
    }
}
