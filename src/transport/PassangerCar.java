package transport;

public class PassangerCar extends Car{
    public PassangerCar(String brand, String model, Double engineVolume) {
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
                "объём двмгателя: " + getEngineVolume() +  ".";
    }
}
