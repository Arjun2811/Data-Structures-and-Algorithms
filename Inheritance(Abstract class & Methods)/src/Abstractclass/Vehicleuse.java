package Abstractclass{


    public class Vehicleuse {



        public static void main(String[]args){
        
        
            Vehicle v = new Vehicle();
            //the above line will throw error boz vehicle is a incomplete class*
            {
                v.maxspeed=100;
                // *
                v.numdoors=5;
                // *
                v.print();
                //* 
           }
        
            Car c = new Car(120,4);
            // the above line will not work fine bcoz car has inherited 2  incomplete function.From those 1 car has made it complete the other is still incomplete *
           Vehicle v1 = new Car(120,4);
           //* v1 is also pointing towards car only
        
        v1.print();
        //*
        
        
         
        
        
            c.maxspeed=120;
            //* */
            c.numdoors=4;
            // *
            c.print();
             // *
        //ab bmw class ka object ban skta h kuki vo complete h 
        
        
        }
        }
        
}
