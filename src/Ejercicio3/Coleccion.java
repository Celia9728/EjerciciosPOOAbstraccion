package Ejercicio3;

public class Coleccion {

    private int[] arrayEnteros;
    private int contadorCasillasOcupadas;

    private final int TAM = 10;

    // CONSTRUCTORES
    public Coleccion() {
        this.arrayEnteros = new int[TAM];
        contadorCasillasOcupadas = 0;
    }

    public Coleccion(int tamanio) {
        this.arrayEnteros = new int[validarTamanio(tamanio)];
        contadorCasillasOcupadas = 0;
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
        if (validarNumero(elemento)) {
            if (contadorCasillasOcupadas == arrayEnteros.length) {
                System.out.println("DOBLAR EL ARRAY");
                int[] array2 = new int[arrayEnteros.length * 2];

                for (int i = 0; i < array2.length; i++) {
                    array2[i] = arrayEnteros[i];
                }

                this.arrayEnteros[contadorCasillasOcupadas] = elemento;
                contadorCasillasOcupadas++;
                System.out.println("Añadido al array");

                arrayEnteros = array2;
            } else {
                this.arrayEnteros[contadorCasillasOcupadas] = elemento;
                contadorCasillasOcupadas++;
                System.out.println("Añadido al array");
            }
        } else {
            System.out.println("No se puede añadir un numero negativo");
        }

    }

    public void eliminar(int elemento) {
        boolean encontrado = false;
        int posicion = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (!encontrado) {
                if (arrayEnteros[i] == elemento) {
                    posicion = i;
                    encontrado = true;
                    System.out.println("encontrado");
                }
            }
        }

//        if (encontrado) {
//            this.contadorCasillasOcupadas = -1;,
//            for (int i = posicion; i < this.contadorCasillasOcupadas; i++) {
//                int auxiliar = arrayEnteros[i + 1];
//                arrayEnteros[i] = auxiliar;
//            }
//        }
    }

    // VALIDACIONES
    private int validarTamanio(int tamanio) {
        int resultado = (tamanio <= 0) ? this.TAM : tamanio;
        return resultado;
    }

    private boolean validarNumero(int numero) {
        boolean esValido = false;
        if (numero >= 0) {
            esValido = true;
        }
        return esValido;
    }

    public void mostrarArray() {
        for (int i = 0; i < this.arrayEnteros.length; i++) {
            System.out.println(this.arrayEnteros[i]);
        }
    }

}
