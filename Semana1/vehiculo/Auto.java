package Semana1.vehiculo;

public class Auto {
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }



    public Motor getMotor() {
        return motor;
    }
    public void encenderMotor() {
        
    System.out.println("El auto " + marca + " " + modelo + " ha arrancado.");
        
    }
}
