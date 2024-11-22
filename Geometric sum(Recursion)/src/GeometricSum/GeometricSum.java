package GeometricSum;

import java.text.DecimalFormat;
import java.util.Scanner;
public class GeometricSum {

public static double GeometricSum(int k,double ans)
{
    double smallans=1.000;
if(k==0)
{
    
    return ans;
}
int i=0;
while(i<k)
{
 smallans*=2.0;
 i++;
}
ans+=1.0/smallans;
double bigans=GeometricSum(k-1,ans);
return bigans;

}

public static double GeometricSum(int k)
{
    double ans=1.000;
    return GeometricSum(k,ans);
}



    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int k=s.nextInt();
        double ans=GeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));

       //System.out.println(ans);

    }

}
