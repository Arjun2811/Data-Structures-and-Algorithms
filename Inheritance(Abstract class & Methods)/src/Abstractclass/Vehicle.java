
package Abstractclass{









public abstract class Vehicle {
    // niche function incomplete h so yha p bhi likhna pdega class incomplete h 
    int maxspeed;
    int numdoors;

    public abstract isMotorized();
    //abstract function or incomplete function*

public abstract string company();
//* 




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


}