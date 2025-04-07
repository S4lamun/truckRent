public class Truck extends Vehicle {
    private boolean isSleepingCabin;
    private double maxLoad;

    public Truck(double price, String carRegistrationNumber, String brand, String model, boolean isSleepingCabin, double maxLoad)
    {
        super(price, carRegistrationNumber, brand, model);
        this.isSleepingCabin = isSleepingCabin;
        this.maxLoad = maxLoad;
    }

}
