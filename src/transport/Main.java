package transport;

public class Main {
    public static void main(String[] args) {
        PassengerCar oka = new PassengerCar("Лада", "Ока", 1.0);
        PassengerCar subaru = new PassengerCar("Subaru", "Impreza", 2.4);
        PassengerCar mitsu = new PassengerCar("Mitsubishi", "Lancer", 2.5);
        PassengerCar bmw = new PassengerCar("BMW", "M5", 4.4);

        CargoCar kamaz = new CargoCar("Камаз", "6520", 11.8);
        CargoCar man = new CargoCar("MAN", "TGS", 9.0);
        CargoCar scania = new CargoCar("Scania", "R420", 13.3);
        CargoCar renault = new CargoCar("Renault", "Magnum", 12.8);

        Bus paz = new Bus("ПАЗ", "1234", 6.6);
        Bus mers = new Bus("Mersedes", "Vito", 4.3);
        Bus kia = new Bus("KIA", "Runner", 5.1);
        Bus faw = new Bus("FAW", "Samurai", 3.9);

        subaru.pitStop();
        subaru.bestLap();
        subaru.maxSpeed();
        man.pitStop();
        man.bestLap();
        man.maxSpeed();
        kia.pitStop();
        kia.bestLap();
        kia.maxSpeed();
    }
}
