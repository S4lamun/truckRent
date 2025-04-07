import java.util.ArrayList;

public class Centre {
    private String name; // nazwa
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // pojazdy w flocie
    private ArrayList<Driver> drivers = new ArrayList<Driver>(); //  kierowcy w flocie
    private ArrayList<Order> orders = new ArrayList<>();

    public Centre(String name)
    {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        if(vehicles.contains(vehicle))
        {
            vehicles.remove(vehicle);
        }
        else throw new IllegalArgumentException("Vehicle does not exist");
    }


    public void addDriver(Driver driver)
    {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        if(drivers.contains(driver)) {
            drivers.remove(driver);
        }
        else throw new IllegalArgumentException("Driver does not exist");
    }


    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        if(orders.contains(order))
        {
            orders.remove(order);
        }
        else throw new IllegalArgumentException("Order does not exist");
    }
}
