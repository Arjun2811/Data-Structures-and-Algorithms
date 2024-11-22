package Multiplication;
import java.util.Scanner;

public class Multiply {

public static int Multiply(int n ,int m)
{
    if(m==1)
    {
        return n;
    }
    if(n==0||m==0)
    {
        return 0;
    }

    int smallans=Multiply(n,m-1);
    return n+smallans;
}









    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int ans=Multiply(n,m);
        System.out.println(ans);
    }
}
