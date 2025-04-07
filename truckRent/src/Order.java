import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    String id;
    static int counter; // for id creation
    ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();
    String client;
    double cost;
    LocalDate orderDate; //data złożenia zamówienia

    Order()
    {
        counter=0;
    }
    public Order(String client)
    {
        id = "AZ//00//" + ++counter;
        this.client = client;
        cost = calculateCost();
        orderDate = LocalDate.now();
    }

    public void addOrderItem(OrderItem orderItem)
    {
        orderItems.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem)
    {
        if(orderItems.contains(orderItem))
        {
            orderItems.remove(orderItem);
        }
        else throw new IllegalArgumentException("OrderItem not found");
    }

    public double calculateCost() // trzeba pomyslec jak zrobic funckje kosztu
    {
        double x =0;
        for(OrderItem orderItem : orderItems)
        {
            x+=orderItem.orderItemCost;
        }
        return x;
    }
}
