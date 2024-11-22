

package Inheritance;
public class Car extends Vehicle{


    int numdoors;
    int maxspeed;
    public void print()
    {
        super.print();
        //this super.print function will call the vehicles print function but will print the prop. of the car because it is the one calling it)
        System.out.println("car"+" numdoors "+numdoors+"gears"+gears);
    }
    public void printmaxspeed()
    {   super.maxspeed=130;
        //this will call and set the maxspeed variable of the vehicle class for the car class because it is the one calling it.
        System.out.println(maxspeed+" "+super.maxspeed);
    




}
}