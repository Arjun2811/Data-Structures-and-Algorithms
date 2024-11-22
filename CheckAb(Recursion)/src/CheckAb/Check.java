package CheckAb;
public class Check {

    public static boolean checkAB(String str,int i,boolean ans,int n)
    {
       if(str.charAt(0)!='a')
       {  
        ans=false;
        return ans;
       }

       if(i>=n)
       {
        return ans;
       }
       
       if(str.charAt(i)=='a')
       { ans=false;
         if(i+1<n)
        {
        if(str.charAt(i+1)=='a')
        {
            ans=true;
        }
    } if(i+2<n)
    {
        if((str.charAt(i+1)=='b') && (str.charAt(i+2)=='b') )
        {
            ans=true;
        }
    }
        if(i+1>=n)
        {
           ans=true;
        }
        
        }
        if(ans==false)
        {
            return ans;
        }

       if(i+1<n)
       {
       if((str.charAt(i)=='b') && (str.charAt(i+1)=='b'))       
{  ans =false;
     if(i+2<n)
{if(str.charAt(i+2)=='a')
{
    ans=true;
}
}
if((i+2)>=n)
{
    ans=true;

}
}

}
if(ans==false)
{
    return ans;
}


boolean smallans=checkAB(str,++i,ans,n);
return smallans;


    }
    public static boolean checkAB(String str)
    {
        int i=0;
        boolean ans=true;
        boolean result =checkAB(str,i,ans,str.length());
        return result;
     
    }


    public static void main(String[]args)
    {
        String str="abbaaabb";
        boolean result=checkAB(str);
        System.out.println(result);
    }
}
