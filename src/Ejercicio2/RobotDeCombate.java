package Ejercicio2;

public class RobotDeCombate extends Robot {

    protected boolean armadura;
    protected int estadoArmadura;
    protected String arma;

    // CONSTRUCTORES
    public RobotDeCombate(String nombre, int aguante, int velocidad, int potencia, String arma) {
        super(nombre, aguante, velocidad, potencia);
        this.armadura = false;
        this.estadoArmadura = 0;
        this.arma = arma;
    }

    public RobotDeCombate(String nombre, int aguante, int velocidad, int potencia, boolean armadura, int estadoArmadura, String arma) {
        super(nombre, aguante, velocidad, potencia);
        this.armadura = armadura;
        this.estadoArmadura = estadoArmadura;
        this.arma = arma;
    }

    // METODOS
    @Override
    public void combatir(Robot r) {
        this.golpear(r);
        RobotDeCombate robotConvertido = (RobotDeCombate) r;
        robotConvertido.golpear(this);
    }

    @Override
    public void mostrar() {
        String mensaje = "";
        mensaje += "INFORMACION DEL ROBOT";
        mensaje += "Nombre: " + this.nombre + "\n";
        mensaje += "Aguante: " + this.aguante + "\n";
        mensaje += "Velocidad: " + this.velocidad + "\n";
        mensaje += "Potencia: " + this.potencia + "\n";
        mensaje += "Armadura:" + this.armadura + "\n";
        mensaje += "Estado de armadura: " + this.estadoArmadura + "\n";
        mensaje += "Arma: " + this.arma + "\n";

        System.out.println(mensaje);
    }

    //METODOS PRIVADOS
    // Metodos para golpear un robot a otro
    private void golpear(Robot r) {
        // Comprobar si es un robot de combate o no.
        //CASO DE QUE SI LO ES.
        // Comprobar si tiene armadura o no.
        // CASO DE QUE SI TIENE ARMADURA.
        // Comparar el estado de la armadura con la potencia del segundo robot.
        if (r.aguante == 0) {
            System.out.println("No puede combatir, esta muerto.");
        } else {
            if (r instanceof RobotDeCombate) {
                RobotDeCombate robotConvertido = (RobotDeCombate) r;
                if (robotConvertido.armadura) {
                    if (robotConvertido.estadoArmadura < this.potencia) {
                        int potenciaRestante = this.potencia - robotConvertido.estadoArmadura;
                        robotConvertido.recibirDanio(potenciaRestante);
                        robotConvertido.quitarArmadura();
                    } else if (robotConvertido.estadoArmadura == this.potencia) {
                        robotConvertido.quitarArmadura();
                    } else {
                        robotConvertido.estadoArmadura -= this.potencia;
                    }
                } else {
                    robotConvertido.recibirDanio(this.potencia);
                }
            } else {
                r.aguante = Math.max(0, r.aguante - this.potencia);
            }
        }

    }

    // Recibir daño y comprobar la vida.
    private void recibirDanio(int potencia) {
        this.aguante = Math.max(0, this.aguante - potencia);
    }

    // Quitar armadura
    private void quitarArmadura() {
        this.estadoArmadura = 0;
        this.armadura = false;
    }

}
