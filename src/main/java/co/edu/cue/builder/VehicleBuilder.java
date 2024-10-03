package co.edu.cue.builder;

public interface VehicleBuilder {
    VehicleBuilder setType(String type);
    VehicleBuilder setWheels(int wheels);
    VehicleBuilder setColor(String color);
    VehicleBuilder setModel(String model);
    Vehicle build();
}
