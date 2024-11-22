package PairStar;
import java.util.Scanner;
public class addStars {




    public static String addStars(String str,int i,String ans)
    {

       
        if(i>str.length()-1)
        {
        return ans;
        }
        ans+=str.charAt(i);
       if(i<str.length()-1)
        {
            if(str.charAt(i)==str.charAt(i+1))
       {
       ans+="*";
       }
    }
       ans=addStars(str,++i,ans);
       return ans;

    }








    public static String addStars(String str)
    {
        int i=0;
        String ans="";
       return addStars(str,i,ans);
    }








public static void main(String[]args)
{  Scanner s = new Scanner(System.in);
    String str=s.next();
    String ans=addStars(str);
    System.out.println(ans);
}
}
