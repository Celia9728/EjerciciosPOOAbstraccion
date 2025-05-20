
package Ejercicio4;

public class ClienteBonificado extends Cliente{
    static private final double DESCUENTO = 0.05;
    
    String fechaCaducidadBonificacion;

    public ClienteBonificado(String nombre, String clase, String fechaCaducidadBonificacion) {
        super(nombre, clase);
        this.fechaCaducidadBonificacion = fechaCaducidadBonificacion;
    }
    
    @Override
    public double calcularDescuento(double dineroGastado){
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
}
