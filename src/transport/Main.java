package transport;

public class Main {
    public static void main(String[] args) {
        PassangerCar oka = new PassangerCar("Лада", "Ока", 1.0);
        PassangerCar subaru = new PassangerCar("Subaru", "Impreza", 2.4);
        PassangerCar mitsu = new PassangerCar("Mitsubishi", "Lancer", 2.5);
        PassangerCar bmw = new PassangerCar("BMW", "M5", 4.4);

        CargoCar kamaz = new CargoCar("Камаз", "6520", 11.8);
        CargoCar man = new CargoCar("MAN", "TGS", 9.0);
        CargoCar scania = new CargoCar("Scania", "R420", 13.3);
        CargoCar renault = new CargoCar("Renault", "Magnum", 12.8);

        Bus paz = new Bus("ПАЗ", "1234", 6.6);
        Bus mers = new Bus("Mersedes", "Vito", 4.3);
        Bus kia = new Bus("KIA", "Runner", 5.1);
        Bus faw = new Bus("FAW", "Samurai", 3.9);
    }
}
