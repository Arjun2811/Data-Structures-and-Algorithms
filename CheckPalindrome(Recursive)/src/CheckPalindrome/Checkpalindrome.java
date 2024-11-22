package CheckPalindrome;
import java.util.Scanner;
public class Checkpalindrome {


public static Boolean Checkpalindrome(String str,int i,int j)
{

if(str.charAt(i)!=str.charAt(j))
{
    return false;
}
if(i>=j)
{
        return true;
}


Boolean ans=Checkpalindrome(str,++i,--j);
//Boolean ans=Checkpalindrome(str,i+1,j-1);
//Boolean ans=Checkpalindrome(str,i++,j--); postfix operartors will not be able to work ass they cant change their values so fast while recursive calls 

  
    return ans;
}




public static boolean Checkpalindrome(String str)
{
    int i=0;
    int j=str.length()-1;
   return  Checkpalindrome(str,i,j);
}
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String str=s.next();
        boolean ans =Checkpalindrome(str);
System.out.println(ans);
    }

}
