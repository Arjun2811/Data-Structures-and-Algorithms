package Vehicle;

public class Vehicle {
protected String color;
private int maxspeed;

public Vehicle(int maxspeed){
    this.maxspeed=maxspeed;
    System.out.println("Vehicle constructor");
}

public int getMaxSpeed(){
    return maxspeed;
}

public void setMaxSpeed(int maxSpeed){
    this.maxspeed=maxspeed;
}
public void print()
{
    System.out.println("Vehicle color : "+ color);
    System.out.println("Vehicle speed :"+ maxspeed);
}


}
