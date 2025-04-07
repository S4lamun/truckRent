public class Van extends Vehicle {
   private double[] dimenstion = new double[3];
    private boolean isRefrigerated;
    private double maxLoad;

    public Van(double price, String carRegistrationNumber, String brand, String model, double[] dimension, boolean isRefrigerated, double maxLoad)
    {
        super(price, carRegistrationNumber, brand, model);
        this.dimenstion = dimension;
        this.isRefrigerated = isRefrigerated;
        this.maxLoad = maxLoad;
    }

}
