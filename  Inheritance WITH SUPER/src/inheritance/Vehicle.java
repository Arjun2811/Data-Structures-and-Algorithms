package inheritance;

public class Vehicle {


    private String color;
    public int maxspeed;
    protected int gears;

    void setcolor(String color)
    {
        this.color=color;
    }
     String getcolor()
     {
       return color;
     }

     public void print(){
       System.out.println("Vehicle"+" color "+color+" "+maxspeed);
    }
}

