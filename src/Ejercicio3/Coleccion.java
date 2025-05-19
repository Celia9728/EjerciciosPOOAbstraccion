package Ejercicio3;

public abstract class Coleccion {

    private int[] array;
    private int contadorCasillasOcupadas;

    private final int TAM = 10;

    // CONSTRUCTORES
    public Coleccion() {
        this.array = new int[TAM];
        contadorCasillasOcupadas = 0;
    }

    public Coleccion(int tamanio) {
        this.array = new int[validarTamanio(tamanio)];
        contadorCasillasOcupadas = 0;
    }

    // METODOS
    public int[] getArray() {
        return this.array;
    }
    
    public int getElementos() {
        return this.contadorCasillasOcupadas;
    }

    public int getElemento(int pos) {
        int posicionPos = (pos < 0 || pos > array.length - 1) ? -1 : pos;

        return this.array[posicionPos];
    }

    public boolean sinElementos() {
        return (this.contadorCasillasOcupadas <= 0);
    }

    public void aniadir(int elemento) {
        if (validarNumero(elemento)) {
            if (contadorCasillasOcupadas == array.length) {
                System.out.println("DOBLAR EL ARRAY");
                int[] array2 = new int[array.length * 2];

                for (int i = 0; i < array2.length; i++) {
                    array2[i] = array[i];
                }

                this.array[contadorCasillasOcupadas] = elemento;
                contadorCasillasOcupadas++;
//                System.out.println("Añadido al array");

                array = array2;
            } else {
                this.array[contadorCasillasOcupadas] = elemento;
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
        for (int i = 0; i < array.length; i++) {
            if (!encontrado) {
                if (array[i] == elemento) {
                    posicion = i;
                    encontrado = true;
                    System.out.println("encontrado");
                }
            }
        }

        if (encontrado) {
            this.contadorCasillasOcupadas--;

            for (int i = posicion; i < this.contadorCasillasOcupadas; i++) {
                array[i] = array[i + 1];
            }
        } else {
            System.out.println("No se ha encontrado");
        }
    }

    public boolean contiene(int elemento) {
        boolean contiene = false;
        for (int i = 0; i < array.length; i++) {
            if (!contiene) {
                if (array[i] == elemento) {
                    contiene = true;
                }
            }
        }
        return contiene;
    }

     @Override
    public String toString() {
        String mensaje = "[";

        for (int i = 0; i < this.contadorCasillasOcupadas; i++) {
            if (i == this.contadorCasillasOcupadas -1) {
                mensaje += array[i] + "]";
            } else {
                mensaje += array[i] + ",";
            }
        }
        return mensaje;
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
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
        }
    }
}
