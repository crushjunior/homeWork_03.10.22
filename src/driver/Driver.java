package driver;

import transport.Car;
import transport.Competing;

public class Driver<D extends Car & Competing> {
    private final String fullName;
    private String driverLicense;
    private int experience;

    public Driver(String fullName, String driverLicense, int experience) {
        if (fullName != null || !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = "default";
        }
        setDriverLicense(driverLicense);
        setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense != null || !driverLicense.isBlank()) {
            this.driverLicense = driverLicense;
        } else {
            this.driverLicense = "default";
        }
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    public void raceInfo(D car) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде.");

    }

    public void startGo(D car) {
        System.out.println("Запускай " + car.getBrand());
    }

    public void finishGo(D car) {
        System.out.println("Глуши " + car.getBrand());
    }

    public void refuel(D car) {
        System.out.println("Заправь " + car.getBrand());
    }
}

