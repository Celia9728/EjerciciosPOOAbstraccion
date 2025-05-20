package Ejercicio4;

public class ClienteComun extends Cliente {

    public ClienteComun(String nombre, String clase) {
        super(nombre, clase);
    }

    @Override
    public double calcularDescuento(double dineroGastado) {
        return dineroGastado;
    }

    @Override
    public double calcularCompra(String fechaCompra, Articulo[] listaArticulos) {
        double compraNueva = super.calcularCompra(fechaCompra, listaArticulos);

        double precioFinal = this.calcularDescuento(compraNueva);

        return precioFinal;
    }
}
