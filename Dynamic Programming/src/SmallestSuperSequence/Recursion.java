package SmallestSuperSequence;

public class Recursion {

public static int Recursion(String str,String str1)
{
if(str.length()==0)
{
    return str1.length();
}
if(str1.length()==0)
{
    return str.length();
}


if(str.charAt(0)==str1.charAt(0))
{
int ans =Recursion(str.substring(1),str1.substring(1));
return ans+1;
}
else{

    int ans=Recursion(str, str1.substring(1));
    ans=ans+1;
    int ans2=Recursion(str.substring(1),str1);
    ans2=ans2+1;
    return Math.min(ans, ans2);
}



}



    public static void main(String[]args)
    {

String str="abc";
String str1="fac";

int ans=Recursion(str,str1);
System.out.println(ans);


    }
}
