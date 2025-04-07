public class Bus extends Vehicle{
    private int seatingCapacity; // miejsca siedzace
    private int luggageCapacity; // miejsca na bagaże
    private boolean hasToilet;
    private int standingCapacity; //miejsca stojace
    public Bus(double price, String carRegistrationNumber, String brand, String model, int seatingCapacity, int luggageCapacity, int standingCapacity)
    {
        super(price, carRegistrationNumber, brand, model);
        this.seatingCapacity = seatingCapacity;
        this.luggageCapacity = luggageCapacity;
        this.standingCapacity = standingCapacity;
    }


}
