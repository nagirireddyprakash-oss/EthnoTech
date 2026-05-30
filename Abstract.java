/*import java.util.Scanner;
abstract class Order
{
    abstract void showMenu();

    abstract void generateBill(int choice, int quantity);
}

class FoodOrder extends Order
{
    @Override
    void showMenu()
    {
        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Pizza           ₹250");
        System.out.println("2. Burger          ₹150");
        System.out.println("3. Chicken Biryani ₹300");
        System.out.println("4. Dosa            ₹100");
        System.out.println("5. Coke            ₹50");
    }

    @Override
    void generateBill(int choice, int quantity)
    {
        String itemName = "";
        int price = 0;

        switch(choice)
        {
            case 1:
                itemName = "Pizza";
                price = 250;
                break;

            case 2:
                itemName = "Burger";
                price = 150;
                break;

            case 3:
                itemName = "Chicken Biryani";
                price = 300;
                break;

            case 4:
                itemName = "Dosa";
                price = 100;
                break;

            case 5:
                itemName = "Coke";
                price = 50;
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        double total = price * quantity;
        double discount = total * 0.10;
        double finalAmount = total - discount;

        System.out.println("\n===== BILL =====");
        System.out.println("Item Name    : " + itemName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Amount : ₹" + total);
        System.out.println("Discount     : ₹" + discount);
        System.out.println("Final Amount : ₹" + finalAmount);
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Order order = new FoodOrder();

        order.showMenu();

        System.out.print("\nEnter Item Number: ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        order.generateBill(choice, quantity);
    }
}*/
abstract class Order
{
    String customerName;
    int quantity;
    double price;

    Order(String customerName, int quantity, double price)
    {
        this.customerName = customerName;
        this.quantity = quantity;
        this.price = price;
    }

    // Abstract Method
    abstract void showMenu();

    // Normal Method
    void discount()
    {
        System.out.println("Standard Discount : 5%");
    }

    // Generate Bill
    void generateBill()
    {
        double total = quantity * price;
        double discountAmount = total * 0.10;
        double finalAmount = total - discountAmount;

        System.out.println("\n========== BILL ==========");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : ₹" + price);
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("Discount      : ₹" + discountAmount);
        System.out.println("Final Amount  : ₹" + finalAmount);
        System.out.println("==========================");
    }
}

class FoodOrder extends Order
{
    FoodOrder(String customerName, int quantity, double price)
    {
        super(customerName, quantity, price);
    }

    @Override
    void showMenu()
    {
        System.out.println("=================================");
        System.out.println("      WELCOME TO FOOD HUB");
        System.out.println("=================================");
        System.out.println("1. Pizza           ₹250");
        System.out.println("2. Burger          ₹150");
        System.out.println("3. Chicken Biryani ₹300");
        System.out.println("4. Dosa            ₹100");
        System.out.println("5. Noodles         ₹180");
        System.out.println("6. Shawarma        ₹220");
        System.out.println("7. Pasta           ₹200");
        System.out.println("8. French Fries    ₹120");
        System.out.println("9. Coke            ₹50");
        System.out.println("10. Ice Cream      ₹80");
        System.out.println("=================================");
    }

    @Override
    void discount()
    {
        super.discount();
        System.out.println("Special Food Discount : 10%");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Order order = new FoodOrder("Prakash", 2, 250);

        order.showMenu();

        System.out.println();
        order.discount();

        order.generateBill();
    }
}/*abstract class Order
{
    // Abstract Method
    abstract void showMenu();

    // Normal Method
    void discount()
    {
        System.out.println("Discount = 5%");
    }
}

class FoodOrder extends Order
{
    @Override
    void showMenu()
    {
        System.out.println("1. Pizza   - ₹250");
        System.out.println("2. Burger  - ₹150");
        System.out.println("3. Biryani - ₹300");
        System.out.println("4. Dosa    - ₹100");
        System.out.println("5. Coke    - ₹50");
    }

    @Override
    void discount()
    {
        super.discount(); // Calls parent class method
        System.out.println("Food Order Special Discount = 10%");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Order fd = new FoodOrder();

        fd.showMenu();

        System.out.println();

        fd.discount();
    }
}*/
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

/*abstract class Foodorder
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
//====================Override and overloading====================================

abstract class Order
{
    // Abstract Method
    abstract void orderFood();

    // Normal Method
    void discount()
    {
        System.out.println("Discount = 5%");
    }

    // Overloaded Method
    void discount(int amount)
    {
        System.out.println("Discount Amount = " + amount);
    }
}

class FoodOrder extends Order
{
    // Overriding Abstract Method
    @Override
    void orderFood()
    {
        System.out.println("Pizza Ordered Successfully");
    }

    // Overriding Normal Method
    @Override
    void discount()
    {
        super.discount();
        System.out.println("Food Discount = 10%");
    }

    // Overloading Method
    void discount(int amount, String coupon)
    {
        System.out.println("Discount Amount = " + amount);
        System.out.println("Coupon Code = " + coupon);
    }
}

public class Main 	 
{
    public static void main(String[] args)
    {
        FoodOrder fd = new FoodOrder();

        fd.orderFood();                 // Overriding
        fd.discount();                  // Overriding + super
        fd.discount(100);               // Overloading from parent
        fd.discount(200, "FOOD10");     // Overloading in child
    }
}*/