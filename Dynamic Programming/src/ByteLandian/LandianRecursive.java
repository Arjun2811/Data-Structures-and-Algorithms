package ByteLandian;

public class LandianRecursive {


public static long Landian(long n)
{
if(n==1)
{
    return 1;
}
if(n==0)
{
    return 0;
}



long a=Landian(n/2);
long b=Landian(n/3);
long c=Landian(n/4);
if(a+b+c>=n)
{
    return a+b+c;
}
else{
    return n;
}



}



    public static void main(String args[])
    {
        long n=7747374;
        long ans=Landian(n);
        System.out.println(ans);
    }
}
