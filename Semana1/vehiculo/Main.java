package Semana1.vehiculo;

class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Vehículos");
        Motor motorElectrico = new Motor("Electrico", 450);
        Auto autoTesla = new Auto("Tesla", "Model S", motorElectrico);
        autoTesla.encenderMotor();
        System.err.println("-----------------------------");
        Moto motoYamaha = new Moto("Yamaha", "YZF-R3");
        motoYamaha.encenderMotor();
    }
}