package Removex;
import java.util.Scanner;
public class Removex {



public static String Removex(String str,int i,String ans)
{
if(i>=str.length())
{
    return ans;
}
if(str.charAt(i)!='x')
{
ans+=str.charAt(i);
}



ans=Removex(str,i+1,ans);
return ans;






}





public static String Removex(String str)
{
    int i=0;
    String ans="";
    return Removex(str,i,ans);
}


public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    String str=s.next();
    System.out.println(Removex(str));

}
}
