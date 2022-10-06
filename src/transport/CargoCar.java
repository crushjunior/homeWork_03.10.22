package transport;

public class CargoCar extends Car implements Competing{
    private static final int MAX_SPEED = 222;
    private static final double BEST_LAP = 1.31;

    public CargoCar(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);

    }

    protected void startGo() {
        System.out.println("Проверь прицеп и стартуй!");
    }
    protected void finishGo() {
        System.out.println("Тормози плавно!");
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
        System.out.println("Пит стоп!");
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
