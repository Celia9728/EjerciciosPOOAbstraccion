package Ejercicio4;

public class Compra {

    private String fechaCompra;
    private Articulo[] listaArticulos;
    private double precioTotalPagar;
    private boolean tieneDescuento;

    public Compra(String fechaCompra, Articulo[] listaArticulos) {
        this.fechaCompra = fechaCompra;
        this.listaArticulos = listaArticulos;

        for (int i = 0; i < listaArticulos.length; i++) {
            this.precioTotalPagar += listaArticulos[i].getPrecio();
        }
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public Articulo[] getListaArticulos() {
        return listaArticulos;
    }

    public double getPrecioTotalPagar() {
        return precioTotalPagar;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setListaArticulos(Articulo[] listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public void setPrecioTotalPagar(double precioTotalPagar) {
        this.precioTotalPagar = precioTotalPagar;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public String imprimirTicket() {
        String ticket = "";
        System.out.println("Fecha de compra: " + this.fechaCompra);
        System.out.println("Lista de articulos: " + this.listaArticulos);
        System.out.println("Precio a pagar: " + this.precioTotalPagar);
        System.out.println("¿Tiene descuento?: " + this.tieneDescuento);

        return ticket;
    }

}
