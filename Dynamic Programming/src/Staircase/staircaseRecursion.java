package Staircase;

public class staircaseRecursion {



public static int staircase(int n)
{
if(n==0)
{
    return 1;
}




    int op1=staircase(n-1);
    int op2=0;
    int op3=0;
    if((n-2)>=0)
    {
     op2=staircase(n-2);
    }
    if((n-3)>=0)
    {
     op3=staircase(n-3);
    }
    return op1+op2+op3;
}





    public static void main(String[]args)
    {
        int n=10;
        int ans=staircase(n);
        System.out.println(ans);
    }
}
