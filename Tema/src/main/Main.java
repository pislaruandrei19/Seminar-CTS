package main;

import clase.Bike;
import clase.Car;

public class Main {

    public static void main(String[] args) {

        // Creaza un obiect de tip motocicleta
        Bike bike = new Bike();

        // Porneste motorul motocicletei
        bike.drive();

        // Opreste motorul motocicletei
        bike.stop();

        // Alimenteaza motocicleta cu combustibil
        bike.refuel();

        // Creaza un obiect de tip masina
        Car car = new Car();

        // Porneste motorul masinii
        car.drive();

        // Opreste motorul masinii
        car.stop();

        // Alimenteaza masina cu combustibil
        car.refuel();

        // Deschide sau inchide usile vehiculului
        car.openDoors();
    }
}
