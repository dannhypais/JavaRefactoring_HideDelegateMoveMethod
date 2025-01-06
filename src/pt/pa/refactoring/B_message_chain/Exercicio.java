package pt.pa.refactoring.B_message_chain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Exercicio {
    /*
    public class Main {
        public static void main(String[] args) {

            Workforce workforce = new Workforce();

            Truck iveco = new Truck("Iveco", "PowerStar 420 E5", new LicencePlate("42-31-OS", 1999, 5));
            Truck mercedes = new Truck("Mercedes-Benz", "Actros", new LicencePlate("52-MM-31", 2011, 2));
            Truck man = new Truck("MAN", "TGX", new LicencePlate("AA-15-BB", 2020, 8));

            Driver bevis = new Driver("Bevis Watson", iveco);
            Driver brent = new Driver("Brent Keller", mercedes);
            Driver conan = new Driver("Conan Mcfarland", man);

            workforce.addDriver(bevis);
            workforce.addDriver(brent);
            workforce.addDriver(conan);

            System.out.println("All drivers: ");
            System.out.println( workforce.showAllDrivers() );

            System.out.println("\n");
            System.out.println("Only drivers starting with letter B: ");
            System.out.println( workforce.showDriversNameStartingWithLetter('B') );

            System.out.println("\n");
            System.out.println("Searching driver of licence plate \"52-MM-31\": ");
            System.out.println( workforce.searchTruckDriverOf("52-MM-31").getFullName() );
        }

    }
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pt.pa.refactoring.B_message_chain.Driver driver = (pt.pa.refactoring.B_message_chain.Driver) o;
            return fullName.equals(driver.fullName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(fullName);
        }
    }
    public class LicencePlate {
        private final String id;
        private final int year;
        private final int month;

        public LicencePlate(String id, int year, int month) {
            this.id = id;
            this.year = year;
            this.month = month;
        }

        public String getId() {
            return id;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int age() {
            Date today = new Date();
            return year - today.getYear();
        }
    }
    public class Truck {
        private final String make;
        private final String model;
        private final pt.pa.refactoring.B_message_chain.LicencePlate licencePlate;

        public Truck(String make, String model, pt.pa.refactoring.B_message_chain.LicencePlate licencePlate) {
            this.make = make;
            this.model = model;
            this.licencePlate = licencePlate;
        }

        public String getMakeModel() {
            return make + " - " + model;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public pt.pa.refactoring.B_message_chain.LicencePlate getLicencePlate() {
            return licencePlate;
        }
    }
    public class Workforce {
        private final List<pt.pa.refactoring.B_message_chain.Driver> driverList;

        public Workforce() {
            driverList = new ArrayList<>();
        }

        public void addDriver(pt.pa.refactoring.B_message_chain.Driver driver) {
            if(!driverList.contains(driver)) {
                driverList.add(driver);
            }
        }
*/
        /**
         * Returns all drivers in text format.
         * @return drivers in text format.
         *//*
        public String showAllDrivers() {
            return showDriversNameStartingWithLetter('*');
        }

        /**
         * Returns selected drivers in text format.
         * @param firstLetter first letter of driver name or '*' for all.
         * @return drivers in text format.
         *//*
        public String showDriversNameStartingWithLetter(char firstLetter) {
            StringBuilder sb = new StringBuilder();

            for(pt.pa.refactoring.B_message_chain.Driver driver : driverList) {
                if(firstLetter == '*' || driver.getFirstName().charAt(0) == firstLetter) {
                    sb.append(String.format("%s is driving the truck %s (Licence Plate: %s)",
                            driver.getFullName(),
                            driver.getAssignedTruck().getMakeModel(),
                            driver.getAssignedTruck().getLicencePlate().getId()));
                    sb.append("\n");
                }
            }

            return sb.toString();
        }

        public pt.pa.refactoring.B_message_chain.Driver searchTruckDriverOf(String licenceId) {
            for(pt.pa.refactoring.B_message_chain.Driver driver : driverList) {
                if( driver.getAssignedTruck().getLicencePlate().getId().equalsIgnoreCase(licenceId)) {
                    return driver;
                }
            }
            return null; /* not found *//*
        }
    }
*/
}
