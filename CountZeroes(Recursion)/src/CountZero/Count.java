package CountZero;
import java.util.Scanner;
public class Count {

public static int Count(int n,int count)
{


    if(n==0)
    {
     return count;
    }
    int a =n%10;

    if(a==0)
    {
        count++;
    }
  



    int smallans=Count(n/10,count);
    return smallans;
}

public static int Count(int n)
{   if(n==0)
    {
        return 1;
    }

    int count=0;
   return Count(n,count);
}






    public static void main(String[]args)
    {
 Scanner s = new Scanner(System.in);
 int n =s.nextInt();
 int ans=Count(n);
 System.out.println(ans);
    }

}
