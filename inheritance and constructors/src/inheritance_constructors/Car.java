package inheritance_constructors;

public class Car extends Vehicle {

    int gears;
    boolean isconvertible;

    public Car(int maxspeed,int numdoors)
    { //super(150);
        //(Jb default constructor ni hoga or parametrized constructor hoga vehicle ka toh, super dena pdega )
        this.maxspeed=maxspeed;
        this.numdoors=numdoors;

        System.out.println("Car Constructor");
        System.out.println("Car's maxspeed"+maxspeed+"Car'snumdoors"+numdoors);
    }

public boolean isconvertible()
{
    return isconvertible;
}
   

    void print()
    {
System.out.println("Car"+"gears"+gears+"numdoors"+numdoors);
    }
}
