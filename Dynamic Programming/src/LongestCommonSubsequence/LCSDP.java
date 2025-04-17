package LongestCommonSubsequence;

public class LCSDP {

public static int LCSDP(String str1,String str2,int m,int n,int[][]storage)
{
int i=str1.length();
int j=0;
while(j<str2.length()+1)
{
storage[i][j]=0;
j++;
}
i=0;
j=str2.length();
while(i<str1.length()+1)
{
storage[i][j]=0;
i++;
}
i=str1.length()-1;
while(i>=0)
{
j=str2.length()-1;
    while(j>=0)
    {
if(str1.charAt(i)==str2.charAt(j))
{
    storage[i][j]=storage[i+1][j+1]+1;
}
else{
    storage[i][j]=Math.max(storage[i+1][j],storage[i][j+1]);
}
j--;

    }
    i--;
}
return storage[0][0];








}
    public static void main(String[]args)
    {
        // String str1="adgei";
        // String str2="abegi";
        String str1="gei";
        String str2="egi";
        int i=0;
        
        int storage[][]=new int[str1.length()+1][str2.length()+1];
        while(i<str1.length()+1)
        {int j=0;
            while(j<str2.length()+1)
            {
                storage[i][j]=-1;
                j++;
            }
            i++;
        }
       int ans= LCSDP(str1,str2,str1.length(),str2.length(),storage);
       System.out.println(ans);
    }
}
