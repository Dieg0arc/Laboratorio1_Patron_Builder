package co.edu.cue.builder;

public class Main {
    public static void main(String[] args) {
        VehicleBuilder builder = new ConcreteVehicleBuilder();
        VehicleDirector director = new VehicleDirector(builder);

        Vehicle car = director.constructCar();
        System.out.println(car);

        Vehicle bike = director.constructBike();
        System.out.println(bike);
    }
}
