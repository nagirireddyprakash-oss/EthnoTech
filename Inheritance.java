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