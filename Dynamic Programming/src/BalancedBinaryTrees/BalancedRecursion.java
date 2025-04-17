package BalancedBinaryTrees;

public class BalancedRecursion {

public static  int BalancedMod(int h)
{
    int mod=(int)Math.pow(10,9)+7; // it will return a double value thats why we casted it into int
    return BalancedRecursion(h,mod);
}

public static int BalancedRecursion(int h,int mod)
{
if(h==0||h==1)
{
    return 1;
}



    int x=BalancedRecursion(h-1 ,mod);
    int y=BalancedRecursion(h-2,mod);
    long value1=(long)x*x;
    long value2=(long)x*y*2;
    int ans1=(int)(value1%mod);
    int ans2=(int)(value2%mod);
    return (ans1+ans2)%mod;
    

    
}



    public static void main(String[]args)
    {
      int ans= BalancedMod(4);
      System.out.println(ans);
    }
}
