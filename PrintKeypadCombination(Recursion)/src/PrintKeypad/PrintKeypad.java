package PrintKeypad;

public class PrintKeypad {

public static void printKeypad(int i)
{
    printKeypad(i,"");
}

public static void printKeypad(int i,String output)
{
    if(i==0)
    {
        System.out.println(output);
        return;
    }
int n=i%10;
    String helper=helper(n);
    if(helper.length()==4)
    {
    printKeypad(i/10,helper.charAt(0)+output);
printKeypad(i/10,helper.charAt(1)+output);
printKeypad(i/10,helper.charAt(2)+output);
printKeypad(i/10,helper.charAt(3)+output);
    }

    else{
printKeypad(i/10,helper.charAt(0)+output);
printKeypad(i/10,helper.charAt(1)+output);
printKeypad(i/10,helper.charAt(2)+output);



    }
    
}

public static String helper(int n)
{
    if(n==0||n==1)
    {
        return "";
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
        int i=234;
        printKeypad(i);
    }
}
