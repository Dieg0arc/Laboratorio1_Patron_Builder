package co.edu.cue.builder;

public class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle constructCar() {
        return builder.setType("Car")
                .setWheels(4)
                .setColor("Red")
                .setModel("Sedan")
                .build();
    }

    public Vehicle constructBike() {
        return builder.setType("Bike")
                .setWheels(2)
                .setColor("Blue")
                .setModel("Mountain Bike")
                .build();
    }
}
