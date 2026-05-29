/*abstract class FoodOrder
{
    abstract void orderFood();
    void displayMessage()
    {
        System.out.println("Welcome to our food ordering system!");
    }
}
class PizzaOrder extends FoodOrder
{
    @Override
    void orderFood()
    {
        System.out.println("You have ordered a Pizza.");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        PizzaOrder pizzaOrder = new PizzaOrder();

        pizzaOrder.displayMessage();
        pizzaOrder.orderFood();
    }
}*/

/*abstract class Foodorder
{
    String customerName;
    int quantity;
    double price;
    Foodorder(String name, int quantity, double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill()
    {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Bill    : " + total);
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        Foodorder p = new Foodorder("Prakash", 2, 250)
        {
            @Override
            void orderFood()
            {
                System.out.println("Pizza Ordered Successfully");
            }
        };
        p.orderFood();
        p.generateBill();
    }
}*/

abstract class Foodorder
{
    String customerName;
    int quantity;
    double price;
    // Default Constructor
    Foodorder()
    {
        System.out.println("Welcome to our food ordering system");
    }
    // Parameterized Constructor
    Foodorder(String name, int quantity, double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    // Abstract Method
    abstract void orderFood();
    // Normal Method
    void generateBill()
    {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Bill    : " + total);
    }
}
class PizzaOrder extends Foodorder
{
    PizzaOrder(String name, int quantity, double price)
    {
        super(name, quantity, price);
    }
    @Override
    void orderFood()
    {
        System.out.println("Pizza Ordered Successfully");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        PizzaOrder p = new PizzaOrder("Prakash", 2, 250);
        p.orderFood();
        p.generateBill();
    }
}