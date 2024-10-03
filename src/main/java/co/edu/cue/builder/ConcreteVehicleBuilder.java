package co.edu.cue.builder;

public class ConcreteVehicleBuilder implements VehicleBuilder {
    private Vehicle vehicle;

    public ConcreteVehicleBuilder() {
        this.vehicle = new Vehicle();
    }

    @Override
    public VehicleBuilder setType(String type) {
        vehicle.setType(type);
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        vehicle.setWheels(wheels);
        return this;
    }

    @Override
    public VehicleBuilder setColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    @Override
    public VehicleBuilder setModel(String model) {
        vehicle.setModel(model);
        return this;
    }

    @Override
    public Vehicle build() {
        return this.vehicle;
    }
}
