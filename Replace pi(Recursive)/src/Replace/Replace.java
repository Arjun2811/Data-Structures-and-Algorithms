package Replace;
import java.util.Scanner;
public class Replace {

public static String Replace(String str,int i,String ans)
{

if(i>=str.length())
{
    return ans;
}
if((str.charAt(i)=='p')&& (i<str.length()-1)&&(str.charAt(i+1)=='i'))
{
ans+="3.14";
ans=Replace(str,i+2,ans);

}
else{
    ans+=str.charAt(i);
    ans=Replace(str,i+1,ans); 
}


return ans;

}

public static String Replace(String str)
{
    int i=0;
    String ans="";
   return Replace(str,i,ans);
}


public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    String str=s.next();
    String str1=Replace(str);
    System.out.println(str1);
}


}

