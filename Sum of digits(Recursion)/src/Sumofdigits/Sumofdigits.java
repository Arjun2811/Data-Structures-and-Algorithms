package Sumofdigits;
import java.util.Scanner;
public class Sumofdigits {

public static int Sumofdigits(int n,int Sum)
{
   
    if(n==0)
    {
        return Sum;
    }
   
   
   
   
    int a =n%10;
    Sum+=a;





int result=Sumofdigits(n/10,Sum);
return result;
}

public static int Sumofdigits(int n)
{
    int sum=0;
    return Sumofdigits(n,sum);
}




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
      int ans=Sumofdigits(n);
      System.out.println(ans);
    }
}
