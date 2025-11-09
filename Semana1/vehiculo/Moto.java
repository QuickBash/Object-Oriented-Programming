package Semana1.vehiculo;

public class Moto {
    private String marca;
    private String modelo;
    private Motor motor;
    
    public Moto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor("Gasolina", 150);
    }
    public void encenderMotor() {
        System.out.println("La moto " + marca + " " + modelo + " ha arrancado.");
    }
}
