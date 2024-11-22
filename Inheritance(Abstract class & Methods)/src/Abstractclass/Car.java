
package Abstractclass{

    public abstract class Car extends Vehicle {
    //ab bcoz  vehicle incomplete so car usse hi extent krri h toh  2 incompete function the 1 pura krdiya car ne ek abi bhi reh rha so  isme bhi abstract  ayega read the 3 point in register.

    public boolean ismotorized()
    {
        return false;
// ab isne ye function bana k apne aap ko complete krliya otherwise isse bhi apni class m likhna pdta ki hn m incomplete hu bcoz ye vehicle ko extend krri 
    }




        int gears;
        boolean isconvertible;
    
        public Car(int maxspeed,int numdoors)
        { 
            this.maxspeed=maxspeed;
            this.numdoors=numdoors;
    
            System.out.println("Car Constructor");
            System.out.println("Car's maxspeed"+maxspeed+"Car'snumdoors"+numdoors);
        }
    
    public boolean isconvertible()
    {
        return isconvertible;
    }
       
    
        void print()
        {
    System.out.println("Car"+"gears"+gears+"numdoors"+numdoors);
        }
    }
    

