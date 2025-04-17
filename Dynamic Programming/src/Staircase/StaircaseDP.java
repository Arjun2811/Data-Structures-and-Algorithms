package Staircase;

public class StaircaseDP {




    public static long staircaseDp(int n,long storage[])
    {
storage[0]=1;

int i=1;
while(i<storage.length)
{
    long op1=storage[i-1];
    long op2=0;
    if((i-2)>=0)
    {
     op2=storage[i-2];
    }
long op3=0;
    if((i-3)>=0)
    {
     op3=storage[i-3];
    }
    storage[i]=op1+op2+op3;
    i++;
}

return storage[n];

    }


    public static long staircaseDp(int n)
    {
long storage[]=new long[n+1];
        return staircaseDp(n,storage);
    }


    public static void main(String[]args)
    {

        int n=10;
       long ans= staircaseDp(n);
       System.out.println(ans);

    }
}
