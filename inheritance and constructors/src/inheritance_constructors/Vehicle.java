package inheritance_constructors;

public class Vehicle {
    int maxspeed;
    int numdoors;

    public Vehicle(int maxspeed)
    {
       this.maxspeed=maxspeed;
        System.out.println("Vehicle maxspeed"+maxspeed);
        System.out.println("Vehicle Constructor");
    }
public Vehicle()
{
   System.out.println("Vehicle Constructor");

}
    void print()
    {
        System.out.println("vehicle"+"maxspeed"+maxspeed+"numdoors"+numdoors);
    }

}
