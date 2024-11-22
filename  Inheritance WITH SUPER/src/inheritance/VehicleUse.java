package inheritance;



public class VehicleUse{

public static void main (String[]args){
    Vehicle v = new Vehicle();
    v.setcolor("red");
    v.maxspeed=120;
    v.print();
    //Vehicle color red 120
     
    Car c = new Car();
    c.setcolor("black");
    c.maxspeed=100;
    c.numdoors=4;
    c.gears=6;
    c.print();
//Vehicle color black 0
//car numdoors 4gears6
    
    c.printmaxspeed();
    //100  130



}
}


