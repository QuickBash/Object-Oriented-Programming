package Semana1.vehiculo;

public class Motor {
    private String tipoMotor;
    private float potenciaCaballos;
    

    public Motor(String tipoMotor, int potenciaCaballos) {
        this.tipoMotor = tipoMotor;
        this.potenciaCaballos = potenciaCaballos;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public float getPotenciaCaballos() {
        return potenciaCaballos;
    }
    public boolean verificarEstado() {
        return true; 
    }
}
