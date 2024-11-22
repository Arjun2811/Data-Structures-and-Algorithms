package Interface;

//public class Car extends Vehicle implements VehicleInterface,CarInterface {
    // ab jb tk car interface extends ni krra tha vehicle interface ko tb tk alag alag likhne ki zarurat h agar implement krna h to 
public class Car extends Vehicle implements CarInterface{

 public void getcompany()
 {
    System.out.println("ford");
 }
    //isne implement krri h  car interface or car interface vehicle interface ko extend krta h dono k  functions dalne zarori h class car ko
    public void print()
    {
        System.out.println("Hello");
    }
    public int getmaxspeed(){

        return 10;
    }
}
