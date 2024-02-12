package demo.Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("bike")
public class TwoWheeler extends Vehicle {

    public String getSteeringhandle() {
        return Steeringhandle;
    }

    public void setSteeringhandle(String steeringhandle) {
        Steeringhandle = steeringhandle;
    }

    private String Steeringhandle;

    public TwoWheeler(int vehicleId, String vehicleName, String steeringhandle) {
        super(vehicleId, vehicleName);
        Steeringhandle = steeringhandle;
    }

    public TwoWheeler() {
    }

}
