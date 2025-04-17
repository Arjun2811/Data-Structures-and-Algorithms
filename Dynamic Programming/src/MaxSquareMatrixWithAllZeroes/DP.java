package MaxSquareMatrixWithAllZeroes;
import java.util.Scanner;

public class DP {

public static int DP(int[][]arr,int dp[][])
{
    if (arr.length == 0 || arr[0].length == 0) {
        return 0;
    }
    
    
    
    
    
    
    int max=0;
int rows=dp.length;
int coulmns=dp[0].length;
int i=0;

    int j=0;
    while(j<coulmns)
    {
       if(arr[i][j]==0)
       {
        dp[i][j]=1;
        max=1;
       }
       else{
        dp[i][j]=0;
       }
       j++;
    }
    j=0;
    while(i<rows)
    {
       
        if(arr[i][j]==0)
        {
         dp[i][j]=1;
         max=1;
        }
        else{
         dp[i][j]=0;
        }
        i++; 
    }
i=1;
while(i<rows)
{
     j=1;
    while(j<coulmns)
    {
        if(arr[i][j]==1)
        {
            dp[i][j]=0;
        }
        else{
dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));

if(max<dp[i][j])
{
    max=dp[i][j];
}
        }
j++;
    }
    i++;
}
return max;
}



    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        // int m=0;
        // int n=0; for checking input.length==0 and input[0].length case working or not

        int m=3;
         int n=2;
int arr[][]=new int[m][n];
int i=0;
while(i<m)
{
    int j=0;
    while(j<n)
    {
        arr[i][j]=s.nextInt();
        j++;
    }
    i++;
}
int dp[][]=new int[m][n];
 i=0;
while(i<m)
{
    int j=0;
    while(j<n)
    {
        dp[i][j]=-1;
        j++;
    }
    i++;
}

int ans=DP(arr,dp);
System.out.println("ans ="+ans);







    }
}
