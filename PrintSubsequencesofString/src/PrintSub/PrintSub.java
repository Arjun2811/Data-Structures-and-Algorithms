package PrintSub;

public class PrintSub {


public static  void PrintSub(String str,String output)
{

    if(str.length()==0)
    {
        System.out.println(output);
        return;
    }
    PrintSub(str.substring(1),output);//i have to trust that ye "yz" ki sari values laa k dega
    PrintSub(str.substring(1),output+str.charAt(0));// and then isme output m x add kro ans aa ajayega i have to trust on it

}

public static void PrintSub(String str)
{
    PrintSub(str,"");
}

public static void main(String[]args)
{
    String str="xyz";
PrintSub(str);
}
}
