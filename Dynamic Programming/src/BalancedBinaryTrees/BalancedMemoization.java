package BalancedBinaryTrees;

public class BalancedMemoization {



    public static int BalancedMod(int h)
{
    int mod=(int)Math.pow(10,9)+7;
    int storage[]=new int[h+1];
    return BalancedMemoization(h,mod,storage);


}
public static int BalancedMemoization(int h ,int mod,int[]storage)
{
if(h==0||h==1)
{
    storage[h]=1;
    return storage[h];
}

if(storage[h]!=0)
{
    return storage[h];
}

int x=BalancedMemoization(h-1, mod,storage);
int y=BalancedMemoization(h-2, mod,storage);

long res1=(long)x*x;
long res2=(long)x*y*2;
int ans1=(int)(res1%mod);
int ans2=(int)(res2%mod);
storage[h]=(ans1+ans2)%mod;
return storage[h];

}

    public static void main(String[] args) {
        int ans=BalancedMod(6);
        System.out.println(ans);
    }
}
