public class Vehicle {
    private double price;
    private String carRegistrationNumber;
    private String brand;
    private String model;


    public Vehicle(double price, String carRegistrationNumber, String brand, String model) {
        this.price = price;
        this.carRegistrationNumber = carRegistrationNumber;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString()
    {
        return "Brand: " + brand + ", Model: " + model + ", Car Registration Number: " + carRegistrationNumber + "Price for km: " + price;
    }


}
