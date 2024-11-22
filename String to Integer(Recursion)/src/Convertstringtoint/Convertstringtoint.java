package Convertstringtoint;
import java.util.Scanner;
public class Convertstringtoint {


public static int Convertstringtoint(String str,int i,int ans,int c)
{

if(i==0)
{
  // ans+=str.charAt(c);
   return ans; 
}
int result=str.charAt(c)-'0';
int f=0;
while(f<i)
{
    result*=10;
f++;
}
ans+=result;

ans=Convertstringtoint(str,i-1,ans,c+1);
return ans;


}
public static int Convertstringtoint(String str)
{
    int i=str.length()-1 ;
    
    int ans=str.charAt(i)-'0';
    int c=0;
   return Convertstringtoint(str,i,ans,c);
}

public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    String str=s.next();
    int ans=Convertstringtoint(str);
    System.out.println(ans);
}
}
