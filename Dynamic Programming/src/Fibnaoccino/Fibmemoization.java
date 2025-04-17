package Fibnaoccino;
public class Fibmemoization {


public static int fib(int n,int storage[])
{
if(n==0||n==1)
{

    storage[n]=n;
    return storage[n];
}


if(storage[n]!=-1)
{
    return storage[n];
}

    storage[n]= fib(n-1,storage)+fib(n-2,storage);
    return storage[n];
}

    public static int fib(int n)
    {
        int storage[]=new int[n+1];
        int i=0;
        while(i<n+1)
        {
            storage[i]=-1;
            i++;
        }
        return fib(n,storage);
    }

    public static void main(String[]args)
    {
        int ans=fib(4);
        System.out.println(ans);
    }
}
