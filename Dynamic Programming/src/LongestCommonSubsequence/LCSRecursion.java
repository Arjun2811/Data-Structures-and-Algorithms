package LongestCommonSubsequence;

public class LCSRecursion {

public static int LCSRecursion(String str1,String str2,int i,int j)
{

if(i==str1.length()||j==str2.length())
{
    return 0;
}
if(str1.charAt(i)==str2.charAt(j))
{
    int max=LCSRecursion(str1,str2,i+1,j+1);
    return max+1;
}

else{
    //int max=LCSRecursion(str1, str2, i+1, j+1); this same work is done by the next two lines when u start the recursion dry run u can see it.

   int max2= LCSRecursion(str1, str2, i, j+1);
   int max3=LCSRecursion(str1,str2,i+1,j);
   return Math.max(max2, max3);
}


}

    public static void main(String[]args)
    {
        String str1="adgei";
        String str2="abegi";
        int ans=LCSRecursion(str1,str2,0,0);
        System.out.println(ans);
    }
}
