class Vehicle
{
    void rideDetails()
    {
        System.out.println("Vehicle Ride");
    }
}
class Bike extends Vehicle
{
    @Override
    void rideDetails()
    {
        int distance = 2;
        int price = 80;

        System.out.println("Bike Booked");
        System.out.println("Distance : " + distance + " KM");
        System.out.println("Price    : " + price);
    }
}
class Auto extends Vehicle
{
    @Override
    void rideDetails()
    {
        int distance = 2;
        int price = 180;

        System.out.println("Auto Booked");
        System.out.println("Distance : " + distance + " KM");
        System.out.println("Price    : " + price);
    }
}
class Car extends Vehicle
{
    @Override
    void rideDetails()
    {
        int distance = 2;
        int price = 250;

        System.out.println("Car Booked");
        System.out.println("Distance : " + distance + " KM");
        System.out.println("Price    : " + price);
    }
}
public class UberInterview
{
    public static void main(String[] args)
    {
        Vehicle v;

        v = new Bike();   // Runtime Polymorphism
        v.rideDetails();

        System.out.println();

        v = new Auto();   // Runtime Polymorphism
        v.rideDetails();

        System.out.println();

        v = new Car();    // Runtime Polymorphism
        v.rideDetails();
    }
}