package RemoveX;
public class RemoveX {

public static String RemoveX(String str)
{
    if(str.length()==0)
    {
        return str;
    }
    String ans="";
    if(str.charAt(0)!='x')
    {
 ans+=str.charAt(0);
    }

   String smallans= RemoveX(str.substring(1));
   return ans +smallans;
}




public static void main(String[]args){
    String str="xabbx";
   String ans= RemoveX(str);
   System.out.println(ans);
}


}
