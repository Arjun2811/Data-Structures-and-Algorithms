package Fibonaccinumber;
public class fibno {


public static int fibno(int n)
{
    if(n==0||n==1)
    {
        return n;
    }




    int smallans=fibno(n-1)+fibno(n-2);
    return smallans ;
}







    public static void main(String[]args)
    {
        int n=4;
        int ans=fibno(n);
        System.out.println(ans);
    }
}
