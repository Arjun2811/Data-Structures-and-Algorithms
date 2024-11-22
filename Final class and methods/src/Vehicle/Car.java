package Vehicle;

public class Car {
 int numgears;
 boolean isconvertible;
}
public car(int numgears, int maxspeed)
{
    super(maxspeed);
    this.numgears=numgears;
    System.out.println("Car Constructor");
}
public boolean isconvertible()
{
    return isconvertible;
}

public void print()
{
    super.print();
    System.out.println("car numgears :"+ numgears);
    System.out.println("Car isconvertible : "+isconvertible);
}
