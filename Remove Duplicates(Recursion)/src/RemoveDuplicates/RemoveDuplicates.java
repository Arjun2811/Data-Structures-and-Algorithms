package RemoveDuplicates;

public class RemoveDuplicates {


public static String RemoveDuplicates(String str,int i,String ans)
{
if(i>=str.length())
{
    return ans;
}

if(str.length()-1==i||str.charAt(i)!=str.charAt(i+1))
{
    ans+=str.charAt(i);
}



ans=RemoveDuplicates(str,i+1,ans);
return ans;
}
{

}
public static String RemoveDuplicates(String str)
{
    int i=0;
    String ans="";
    return RemoveDuplicates(str,i,ans);
}




    public static void main(String[] args) {
        String str="aa";
        System.out.println(RemoveDuplicates(str));
    }
}
