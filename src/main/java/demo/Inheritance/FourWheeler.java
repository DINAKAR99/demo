package demo.Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("car")

public class FourWheeler extends Vehicle {
    public FourWheeler(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }

    public FourWheeler(int vehicleId, String vehicleName, String steeringWheel) {
        super(vehicleId, vehicleName);
        SteeringWheel = steeringWheel;
    }

    private String SteeringWheel;

    public FourWheeler() {

    }

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }
}
