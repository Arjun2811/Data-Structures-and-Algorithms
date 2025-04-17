package MinCountofSquares;

public class MinCountMemoziation {




public static int minCount(int n,int[]storage)
{
    if(n==0)
    {
           
         storage[n]=0;
        return storage[n];
    }

if(storage[n]!=0)
{
    return storage[n];
}
int min=Integer.MAX_VALUE;
int i=1;
while(i*i<=n)
{
int minways= minCount(n-(i*i), storage);
if(minways<min){
    min=minways;
    
}
i++;
}
storage[n]=1+min;
return storage[n];
    }
public static int MinCount(int n)
{
    int storage[]=new int[n+1];
    return minCount(n,storage);
}
public static void main(String[]args)
{
   System.out.println(MinCount(5)); 
}



}
