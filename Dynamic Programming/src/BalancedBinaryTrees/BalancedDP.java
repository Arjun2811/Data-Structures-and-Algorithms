package BalancedBinaryTrees;

public class BalancedDP {


public static int BalancedDP(int h)
{int mod=(int)Math.pow(10,9)+7;
int storage[]=  new int[h+1];
return BalancedDP(h,storage,mod);
}
public static int BalancedDP(int h,int storage[],int mod)
{
storage[0]=1;
storage[1]=1;
int i=2;
while(i<storage.length)
{
    long value=(long)storage[i-1]*storage[i-1];
    value+=2*(long)storage[i-1]*storage[i-2];
int ans=(int)(value%mod);
    storage[i]=ans%mod;
    i++;
}
return storage[h];

}
public static void main(String[]args)
{
   int ans= BalancedDP(6);
   System.out.println(ans);
}
}
