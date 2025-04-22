package Ejercicio2;

public class RobotDeCombate extends Robot {

    protected boolean armadura;
    protected int estadoArmadura;
    protected String arma;

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

    @Override
    public void combatir(Robot robot) {
        if (robot instanceof RobotDeCombate) {
            RobotDeCombate robotConvertido = (RobotDeCombate) robot;
            if (robotConvertido.armadura) {
                if (robotConvertido.estadoArmadura < this.potencia) {
                    robotConvertido.estadoArmadura = 0;
                    robotConvertido.armadura = false;
                    int vidaQuitada = this.potencia - robotConvertido.estadoArmadura;
                    robotConvertido.aguante = robotConvertido.aguante - vidaQuitada;
                } else if (robotConvertido.estadoArmadura == this.potencia) {
                    robotConvertido.estadoArmadura = 0;
                    robotConvertido.armadura = false;
                } else {
                    robotConvertido.estadoArmadura = robotConvertido.estadoArmadura - this.potencia;
                }
            } else {
                if (robotConvertido.aguante <= this.potencia) {
                    robotConvertido.aguante = 0;
                } else {
                    robotConvertido.aguante -= this.potencia;
                }
                robotConvertido.aguante = robotConvertido.aguante - this.potencia;
            }
        } else {
            robot.aguante = robot.aguante - this.potencia;
        }
    }

    public void mostrar() {

    }
}
