package Ejercicio4;

public class Ejercicio4Main {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Portátil", 1000.0);
        Articulo a2 = new Articulo("Ratón", 25.0);
        Articulo a3 = new Articulo("Teclado", 50.0);
        Articulo a4 = new Articulo("Monitor", 200.0);

        Articulo[] lista1 = {a1, a2};       // Total = 1025.0
        Articulo[] lista2 = {a3, a4};       // Total = 250.0
        Articulo[] lista3 = {a1, a3, a4};   // Total = 1250.0
        Articulo[] lista4 = {a2};           // Total = 25.0

        Cliente c1 = new ClientePremium("Carlos", "CL123", "12345678");
        Cliente c2 = new ClienteTrabajador("Ana", "AN456", "Programador");
        Cliente c3 = new ClienteBonificado("Luis", "LU789", "20/12/2025");
        Cliente c4 = new ClienteComun("Pepe", "PE000");

        c1.calcularCompra("2025-05-20", lista1);
        c2.calcularCompra("2025-05-20", lista2);
        c3.calcularCompra("2025-05-20", lista3);
        c4.calcularCompra("2025-05-20", lista4);

        c1.mostrarHistorial();
        System.out.println("Total gastado por Carlos: " + c1.dineroTotalGastado());

        c2.mostrarHistorial();
        System.out.println("Total gastado por Ana: " + c2.dineroTotalGastado());

        c3.mostrarHistorial();
        System.out.println("Total gastado por Luis: " + c3.dineroTotalGastado());

        c4.mostrarHistorial();
        System.out.println("Total gastado por Pepe: " + c4.dineroTotalGastado());

    }

}
