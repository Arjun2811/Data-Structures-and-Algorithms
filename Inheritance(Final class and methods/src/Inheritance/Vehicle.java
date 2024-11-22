package Inheritance;
public final class Vehicle {
    // yha final likhte hi ab no inheritance from this class allowed jha p bhi ab super likha h ya ineritance hora h car class m har jagah error 
    // aajayenge



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

     public final void print(){
        //yha final likhte hi car class k print function m error agya kuki ye ab car class is function ko
        //override ni kr skti or we can say koi b subclass same naam ka function ni bna skti agar parent class ka vo function final h toh
       System.out.println("Vehicle"+" color "+color+" "+maxspeed);
    }
}


