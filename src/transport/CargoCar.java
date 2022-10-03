package transport;

public class CargoCar extends Car{
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
                "объём двмгателя: " + getEngineVolume() +  ".";
    }
}
