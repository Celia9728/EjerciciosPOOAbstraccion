package Ejercicio4;

public class ClientePremium extends Cliente {

    static private final double DESCUENTO = 0.15;

    private String tarjeta;

    public ClientePremium(String nombre, String clase, String tarjeta) {
        super(nombre, clase);
        this.tarjeta = validarTarjeta(tarjeta);
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
    
    @Override
    public double calcularCompra(String fechaCompra, Articulo[] listaArticulos){
        double compraNueva = super.calcularCompra(fechaCompra, listaArticulos);
        
        double precioFinal = this.calcularDescuento(compraNueva);
        
        return precioFinal;
    }

    private String validarTarjeta(String tarjeta) {
        String numero = (tarjeta.length() < 8) ? "11111111" : tarjeta;
        return numero;
    }
}
