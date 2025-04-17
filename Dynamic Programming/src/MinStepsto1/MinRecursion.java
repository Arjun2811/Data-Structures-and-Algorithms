package MinStepsto1;
public class MinRecursion {



public static int MinRecursion(int n)
{
if(n==1)
{
    return 0;
}

int op1=MinRecursion(n-1);
int minsteps=op1;
if(n%2==0)
{
int op2=MinRecursion(n/2);
if(minsteps>op2)
{
    minsteps=op2;
}
}
if(n%3==0)
{
    int op3=MinRecursion(n/3);
    if(op3<minsteps)
    {
        minsteps=op3;
    }
}

return minsteps+1;

}







    public static void main(String[]args)
    {
        int ans=MinRecursion(1000);
        System.out.println(ans);
    }
}
