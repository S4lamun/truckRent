import java.util.ArrayList;
import java.time.LocalDate;

public class OrderItem {
    ArrayList<Vehicle> vehicles = new ArrayList<>(); //arrayList bo zestaw to naczepa + ciągnik np.
    LocalDate orderDate; // data przejazdu
    String fromWhere; // z jakiego miasta
    String toWhere;  // do jakiego miasta
    int distance; // dystanca z-do
    double orderItemCost;
    ArrayList<Licenses> neededLicenses;
    ArrayList<SpecialLicenses> neededSpecialLicenses;
    Driver driver;

    public OrderItem(String fromWhere, String toWhere, int distance,
                     LocalDate orderDate, Driver driver, ArrayList<Licenses> neededLicenses,
                     ArrayList<SpecialLicenses> neededSpecialLicenses) {

        this.orderDate = orderDate;
        this.fromWhere = fromWhere;
        this.toWhere = toWhere;
        this.distance = distance;
        orderItemCost = calculateItemCost();
        this.neededLicenses = neededLicenses;
        this.neededSpecialLicenses = neededSpecialLicenses;
        this.driver = driver;
        if (!checkDriver())
        {
            throw new IllegalArgumentException("Driver does not have needed licenses");
        }

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
        } else throw new IllegalArgumentException("Vehicle does not exist");
    }

    public double calculateItemCost() {
        double x = 0;
        for (Vehicle vehicle : vehicles) {
            x += vehicle.getPrice();
        }
        return x;
    }

    public boolean checkDriver() // checking if Driver has needed licences
    {
        for(Licenses license : neededLicenses) {
            if(!driver.licenses.contains(license))
            {
                return false;
            }
        }
        for(SpecialLicenses license : neededSpecialLicenses) {
            if(!driver.specialLicenses.contains(license))
            {
                return false;
            }
        }
        return true;
    }
}


