package inheritance_constructors;

//import java.lang.reflect.Constructor;

public class Vehicleuse {



public static void main(String[]args){


   // Vehicle v = new Vehicle();
    //{
      //  v.maxspeed=100;
        //v.numdoors=5;
       // v.print();
   // }

   // Car c = new Car(120,4);{inheritance and constructors part}
   Vehicle v = new Car(120,4);
//v.isconvertible="True";(it will show error bcoz isconvertible function is not there in Vehicle)
v.print();
//{print function exist in both vehicle class and car class but it will print the car class vala print function}
 


    //c.maxspeed=120;
    //c.numdoors=4;
   // c.print();



}
}