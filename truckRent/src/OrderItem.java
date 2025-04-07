import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class OrderItem {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    LocalDate orderDate; // data przejazdu
    String fromWhere; // z jakiego miasta
    String toWhere;  // do jakiego miasta
    int distance; // dystanca z-do
    double orderItemCost;

    public OrderItem(String fromWhere, String toWhere, int distance, LocalDate orderDate) {
        this.orderDate = orderDate;
        this.fromWhere = fromWhere;
        this.toWhere = toWhere;
        this.distance = distance;
        orderItemCost = calculateItemCost();
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
}


