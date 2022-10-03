package transport;

public class Bus extends Car{
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
                "объём двмгателя: " + getEngineVolume() +  ".";
    }
}
