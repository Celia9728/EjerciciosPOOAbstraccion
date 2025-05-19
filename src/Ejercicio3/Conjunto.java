package Ejercicio3;

public class Conjunto extends Coleccion {

    public Conjunto() {
        super();
    }

    public Conjunto(int tamanio) {
        super(tamanio);
    }

    @Override
    public void aniadir(int elemento) {
        if (!super.contiene(elemento)) {
            super.aniadir(elemento);
        } else {
            System.out.println("Ya esta en la lista");
        }
    }

    public Conjunto union(Conjunto conjunto2) {
        Conjunto union = new Conjunto();

        for (int i = 0; i < super.getArray().length; i++) {
            union.aniadir(super.getArray()[i]);
        }

        for (int i = 0; i < conjunto2.getArray().length; i++) {
            union.aniadir(conjunto2.getArray()[i]);
        }

        return union;
    }

    public Conjunto interseccion(Conjunto conjunto2) {
        Conjunto mayor;
        Conjunto menor;
//        if (super.getArray().length >= conjunto2.getArray().length) {
//            mayor = super.getArray().length;
//        } else{
//            mayor = conjunto2.getArray().length;
//        }

        if (super.getArray().length >= conjunto2.getArray().length) {
            mayor = this;
            menor = conjunto2;
        } else{
            mayor = conjunto2;
            menor = this;
        }

        Conjunto interseccion = new Conjunto();
        for (int i = 0; i < menor.getArray().length; i++) {
            if (mayor.contiene(menor.getArray()[i])) {
                interseccion.aniadir(conjunto2.getArray()[i]);
            }
        }
        return interseccion;
    }

}
