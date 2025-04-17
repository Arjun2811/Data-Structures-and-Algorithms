package MinStepsto1;

public class MinMemoization {


public static int MinMemoization(int n,int[]steps)
{if(n==1)
    {steps[n]=0;
        return steps[n];
       
    }



if(steps[n]!=-1)
{
    return steps[n];
}

    int op1=MinMemoization(n-1,steps);
    int minsteps=op1;
    if(n%2==0)
    {
        int op2=MinMemoization(n/2,steps);
        if(minsteps>op2)
        {
            minsteps=op2;
        }
    }
    if(n%3==0)
    {
        int op3=MinMemoization(n/3,steps);
        if(minsteps>op3)
        {
            minsteps=op3;
        }
    }
    steps[n]=minsteps+1;
    return steps[n];
}




public static int MinMemoization(int n)
{
    int steps[]= new int[n+1];
int i=0;
while(i<=n)
{
    steps[i]=-1;
    i++;
}
return MinMemoization(n,steps);
}


    public static void main(String[]args)
    {
       int ans= MinMemoization(1000);
       System.out.println(ans);
    }
}
