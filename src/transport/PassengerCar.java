package transport;

public class PassengerCar extends Car implements Competing{
    private static final int MAX_SPEED = 268;
    private static final double BEST_LAP = 1.21;

    public enum TypeBody {SEDAN, HATCHBACK, COUPE, UNIVERSAL, OFFROAD, CROSSOVER,PICKUP, VAN, MINIVAN};


    public PassengerCar(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);


    }

    protected void startGo() {
        System.out.println("Газ в полас!");
    }
    protected void finishGo() {
        System.out.println("Тормози!");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() + ", " +
                "марка: " + getBrand() +  ", " +
                "модель: " + getModel() +  ", " +
                "объём двигателя: " + getEngineVolume() +  ".";
    }

    @Override
    public void pitStop() {
        System.out.println("Здесь был пит стоп!");
    }

    @Override
    public void bestLap() {
        System.out.println("Лучшее время круга: " + BEST_LAP);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + MAX_SPEED);
    }
}
