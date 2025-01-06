package pt.pa.refactoring.B_message_chain;

import java.util.Objects;

public class Driver {
    private final String fullName;
    private Truck assignedTruck;

    public Driver(String fullName, Truck assignedTruck) {
        if(fullName == null) throw new IllegalArgumentException("Name cannot be null.");

        this.fullName = fullName;
        this.assignedTruck = assignedTruck;
    }

    public String getFirstName() {
        return fullName.split(" ", 2)[0];
    }

    public String getFullName() {
        return fullName;
    }

    public Truck getAssignedTruck() {
        return assignedTruck;
    }

    public void setAssignedTruck(Truck assignedTruck) {
        this.assignedTruck = assignedTruck;
    }

    public String getTruckMakeModel() {
        return assignedTruck.getMakeModel();
    }

    public String getTruckLicencePlateId() {
        return assignedTruck.getLicencePlateId();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
