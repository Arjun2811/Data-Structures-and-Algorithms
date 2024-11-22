package VEHICLE;
public class Vehicle {
String color;
private int maxspeed;


public int getmaxspeed()
{
    return maxspeed;
}

public void setmaxspeed(int maxspeed)
{
    this.maxspeed=maxspeed;
}
public void print()
{
    System.out.println("colour"+" - "+color);
    System.out.println("speed"+" - " + getmaxspeed());
}
}
