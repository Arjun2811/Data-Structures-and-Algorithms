package Interface;

public class Vehicle implements VehicleInterface{
//isne implement krri h vehicle interface toh uske functions dalne zarori h
//if a class does not want to make the functions  of vehicle interface it can make itself abstract/ incomplete 
    public int getmaxspeed()
    {
        return 10;
    }

    public void print(){
        System.out.println("Hello");
    }

}
