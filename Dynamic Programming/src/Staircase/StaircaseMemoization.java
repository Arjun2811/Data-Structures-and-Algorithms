package Staircase;

public class StaircaseMemoization {

public static long staircaseM(int n,long []storage)
{

    if(n==0)
    {storage[n]=1;
        return storage[n];
    }
    if(storage[n]!=0)
    {
        return storage[n];
    }
    
    
    
        long op1=staircaseM(n-1,storage);
        long op2=0;
        long op3=0;
        if((n-2)>=0)
        {
         op2=staircaseM(n-2,storage);
        }
        if((n-3)>=0)
        {
         op3=staircaseM(n-3,storage);
        }
        storage[n]=op1+op2+op3;
        return storage[n];


}
public static long staircaseM(int n)
{
    long storage[]= new long[n+1];
    return staircaseM(n,storage);
}


    public static void main(String[] args) {
        
        int n=100;
        long ans=staircaseM(n);
        System.out.println(ans);
    }
}
