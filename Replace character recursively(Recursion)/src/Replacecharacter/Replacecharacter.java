package Replacecharacter;

public class Replacecharacter {



    public static String Replacecharacter(String str,char ch1, char ch2,String ans,int i)
    {
     if(i>=str.length())
     {
        return ans;
     }
     
     
     if(str.charAt(i)==ch1)
     {
        ans+=ch2;
     }else{
        ans+=str.charAt(i);
     }

    ans=Replacecharacter(str, ch1, ch2,ans,++i);
    return ans;




    }
    
    
    public static String Replacecharacter(String str,char ch1, char ch2)
    {
        String ans="";
        int i=0;
        
        
        return Replacecharacter(str, ch1,ch2,ans,i);
    }

    public static void main(String[]args)
    {
        String str="xabcfdaac";
        char ch1='a';
        char ch2='b';
        String ans=Replacecharacter(str,ch1,ch2);
        System.out.println(ans);
    }
}
