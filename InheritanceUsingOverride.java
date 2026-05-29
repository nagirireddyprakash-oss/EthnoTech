class Management
{
    int id;
    float salary;
    String role;
}
class Employee1 extends Management
{
    public void tester()
    {
        id = 101;
        salary = 10000;
        role = "tester";
        System.out.println(id);
        System.out.println(salary);
        System.out.println(role);
    }
}
class Employee2 extends Management
{
    public void developer()
    {
        id = 102;
        salary = 20000;
        role = "developer";
        System.out.println(id);
        System.out.println(salary);
        System.out.println(role);
    }
}
class Inheritance
{
    public static void main(String[] args)
    {
        Employee1 ep1 = new Employee1();
        ep1.tester();
        System.out.println();
        Employee2 ep2 = new Employee2();
        ep2.developer();
    }
}

//override
//=========================================================================
class Order
{
    void showMenu()
    {
        System.out.println("Food Menu");
    }

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
        super.discount();
        System.out.println("Food Order Special Discount = 10%");
    }
}

public class InheritanceUsingOverride
{
    public static void main(String[] args)
    {
        FoodOrder fd = new FoodOrder();

        fd.showMenu();
        System.out.println();

        fd.discount();
    }
}



/*class Bank
{
    void interestRate()
    {
        System.out.println("Interest Rate = 5%");
    }
}

class SBI extends Bank
{
    @Override
    void interestRate()
    {
        System.out.println("Interest Rate = 7%");
    }
}

public class OverrideDemo
{
    public static void main(String[] args)
    {
        SBI s = new SBI();

        s.interestRate();
    }
}*/