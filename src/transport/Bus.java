package transport;

public class Bus extends Car implements Competing{
    public static final int MAX_SPEED = 201;
    public static final double BEST_LAP = 1.36;
    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    protected void startGo() {
        System.out.println("Проверь двери и газуй!");
    }
    protected void finishGo() {
        System.out.println("Тормози аккуратно, не бревна везёшь!");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() + ", " +
                "марка: " + getBrand() +  ", " +
                "модель: " + getModel() +  ", " +
                "объём двмигателя: " + getEngineVolume() +  ".";
    }

    @Override
    public void pitStop() {
        System.out.println("Был пит стоп!");
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
