package clase;

public class Bike implements Vehicle,FuelVehicle {

    public void drive() {
        System.out.println("Motorul este pornit.");
    }
    public void stop() {
        System.out.println("Motorul este oprit.");
    }
    public void refuel() {
        System.out.println("S-a alimentat cu combustibil.");
    }

    }
