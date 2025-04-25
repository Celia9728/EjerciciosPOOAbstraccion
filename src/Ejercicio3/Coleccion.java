package Ejercicio3;

public class Coleccion {

    private int[] arrayEnteros;
    private int contadorCasillasOcupadas;

    private final int TAM = 10;

    // CONSTRUCTORES
    public Coleccion() {
        this.arrayEnteros = new int[TAM];
    }

    public Coleccion(int tamanio) {
        this.arrayEnteros = new int[validarTamanio(tamanio)];
    }

    // METODOS
    public int getElementos() {

        for (int i = 0; i < arrayEnteros.length; i++) {
        }
        return this.contadorCasillasOcupadas;
    }

    public int getElemento(int pos) {
        int posicion = (pos < 0 || pos > arrayEnteros.length - 1) ? -1 : pos;

        return this.arrayEnteros[posicion];
    }

    public boolean sinElementos() {
        return (this.contadorCasillasOcupadas <= 0);
    }

    public void aniadir(int elemento) {
        if (contadorCasillasOcupadas == (arrayEnteros.length - 1)) {
            System.out.println("DOBLAR EL ARRAY");
        } else {
            this.arrayEnteros[contadorCasillasOcupadas] = elemento;
            contadorCasillasOcupadas++;
            System.out.println("Añadido al array");
        }

    }

    public void eliminar(int elemento) {
        boolean encontrado = false;
        int posicion = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (!encontrado) {
                if (arrayEnteros[i] == elemento) {
                    arrayEnteros[i] = 0;
                    posicion = i;
                    encontrado = true;
                }
            }
        }
    }

    // VALIDACIONES
    private int validarTamanio(int tamanio) {
        int resultado = (tamanio <= 0) ? this.TAM : tamanio;
        return resultado;
    }

}
