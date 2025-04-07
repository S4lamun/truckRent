import java.lang.reflect.Type;

public class Trailer extends Vehicle {
    private double [] dimensions = new double[3];
    private double capacity;
    private double weight;
    private TypeOfVehicle typeOfVehicle;

    public Trailer(double price, String carRegistrationNumber, String brand, String model, double [] dimensions, double capacity, double weight, TypeOfVehicle typeOfVehicle)
    {
        super(price, carRegistrationNumber, brand, model);
        this.dimensions = dimensions;
        this.capacity = capacity;
        this.weight = weight;
        this.typeOfVehicle = typeOfVehicle;
    }

}
