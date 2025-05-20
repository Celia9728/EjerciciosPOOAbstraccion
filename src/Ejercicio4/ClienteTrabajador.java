package Ejercicio4;

public class ClienteTrabajador extends Cliente {

    static private final double DESCUENTO = 0.08;

    String puesto;

    public ClienteTrabajador(String nombre, String clase, String puesto) {
        super(nombre, clase);
        this.puesto = puesto;
    }

    @Override
    public double calcularCompra(String fechaCompra, Articulo[] listaArticulos) {
        double compraNueva = super.calcularCompra(fechaCompra, listaArticulos);

        double precioFinal = this.calcularDescuento(compraNueva);

        return precioFinal;
    }

    @Override
    public double calcularDescuento(double dineroGastado) {
        int bloque = (int) dineroGastado / 75;
        double descuento = 0;

        if (dineroGastado >= 75) {
            descuento = dineroGastado * this.DESCUENTO * bloque;
        }
        return dineroGastado - descuento;
    }
}
