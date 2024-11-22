package ReturnKeypad;
public class ReturnKeypad {


public static String[] ReturnKeypad(int n)
{
    if(n==0||n==1)
    {
        String ans[]={""};
        return ans;
    }
    int newn=n%10;
    String ans[]=ReturnKeypad(n/10);
    String helper=Stringgiving(newn);
    String finalans[]= new String[helper.length()*ans.length];
    int i=0;
    int k=0;
    while(i<ans.length)
    {
        int j=0;
        while(j<helper.length())
        {
            finalans[k]=ans[i]+ helper.charAt(j);
            k++;
            j++;
        }
        i++;
    }
    return finalans;


    
    
    
}

public static String Stringgiving(int n)
{

    if(n==0||n==1)
    {
        return " ";
    }
if(n==2)
{
    return "abc";
}
if(n==3)
{
    return "def";
}
if(n==4)
{
 return "ghi";
}
if(n==5)
{
    return "jkl";
}
if(n==6)
{
    return "mno";
}
if(n==7)
{
    return "pqrs";
}
if(n==8)
{
    return "tuv";
}
else
{
    return "wxyz";
}

}


public static void main(String[]args)
{
    int i=239;
   String arr[]= ReturnKeypad(i);
   int f=0;
   while(f<arr.length)
   {
    System.out.println(arr[f]);
    f++;
   }


}
}
