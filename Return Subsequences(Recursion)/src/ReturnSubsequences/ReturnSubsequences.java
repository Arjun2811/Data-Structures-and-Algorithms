package ReturnSubsequences;

public class ReturnSubsequences {

public static String[] ReturnSubsequences(String str)
{
    if(str.length()==0)
    {
        String ans[]={""};
        return ans;
    }

    String smallans[]=ReturnSubsequences(str.substring(1));
    
    String ans[]= new String[smallans.length*2];
int i=0;
int k=0;
    while(i<smallans.length)
    {
        ans[k]=smallans[i];
        i++;
        k++;
    }
    int f=0;
    while(f<smallans.length)
    {
        ans[k]=smallans[f]+str.charAt(0);
        f++;
        k++;
    }
return ans;
}









public static void main(String[]args)
{
    String str="xyz";
    String ans[]=ReturnSubsequences(str);
    int i=0;
    while(i<ans.length)
    {
        System.out.println(ans[i]);
        i++;
    }
}
}
