package SmallestSuperSequence;

public class DP {

    public static int DP(String str,String str1,int[][]arr)
    {
        int m=str.length()+1;
        int n=str1.length()+1;
        int i=0;
        int j=0;
        int f=0;
        while(j<n)
        {
        arr[i][j]=f;
        f++;
        j++;
        }
        f=0;
        j=0;
        while(i<m)
        {
        arr[i][j]=f;
        f++;
        i++;
        }
        i=1;
        while(i<m)
        {
        j=1;
        while(j<n)
        {
if(str.charAt(m-i-1)==str1.charAt(n-j-1))
{
    arr[i][j]=arr[i-1][j-1]+1;
}
else{
   arr[i][j]= Math.min(arr[i][j-1],arr[i-1][j])+1;
}
j++;
        }
        i++;

    }
    return arr[m-1][n-1];
    }
    public static void main(String[] args) {
        String str="abc";
        String str1="fac";
        int m=str.length()+1;
        int n=str1.length()+1;
        int arr[][]=new int [m][n];
        int i=0;
        while(i<m)
        {
            int j=0;
            while(j<n)
            {
                arr[i][j]=-1;
                j++;
            }
            i++;
        }
        int ans=DP(str,str1,arr);
        System.out.println(ans);
    
    }
}
