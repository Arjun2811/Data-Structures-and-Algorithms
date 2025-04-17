package LongestCommonSubsequence;

public class LCSMemoziation {


public static int LCSMemoziation(String str1,String str2,int i,int j,int[][]storage)
{
    if(storage[i][j]!=-1)
{
    return storage[i][j];
}
    
    
    if(i==str1.length()||j==str2.length())
    {
        storage[i][j]=0;
        return storage[i][j];
       
    }


    if(str1.charAt(i)==str2.charAt(j))
    {

        int max=LCSMemoziation(str1,str2,i+1,j+1,storage);
        storage[i][j]=max+1;
        return storage[i][j];

    }
    
    else{
        //int max=LCSRecursion(str1, str2, i+1, j+1); this same work is done by the next two lines when u start the recursion dry run u can see it.
    
       int max2= LCSMemoziation(str1, str2, i, j+1,storage);
       int max3=LCSMemoziation(str1,str2,i+1,j,storage);
       
       storage[i][j]=Math.max(max2, max3);
       return storage[i][j];
    }


}
    public static void main(String[]args)
    {
        // String str1="adgei";
        // String str2="abegi";
        String str1="bd";
        String str2="db";
        int arr[][]=new int[str1.length()+1][str2.length()+1];
        int i=0;
        while(i<=str1.length())
        {
            int j=0;
            while(j<=str2.length())
            {
arr[i][j]=-1;
j++;
            }
            i++;
        }
       int ans= LCSMemoziation(str1,str2,0,0,arr);
       System.out.println(ans);
    }
}
