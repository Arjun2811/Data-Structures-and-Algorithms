package MagicGrid;
import java.util.Scanner;
public class DP {

public static int DP(int[][]arr,int[][]dp)
{

int m=dp.length;
int n=dp[0].length;
dp[m-1][n-1]=1;
dp[m-1][n-2]=1;
dp[m-2][n-1]=1;
int i=m-1;
int j=n-3;
while(j>=0)
{
dp[i][j]=(dp[i][j+1]-arr[i][j+1]);
if(dp[i][j]<=0)
{
    dp[i][j]=1;
}
j--;
}
i=m-3;
j=n-1;
while(i>=0)
{
    dp[i][j]=dp[i+1][j]-arr[i+1][j];
    if(dp[i][j]<=0)
{
    dp[i][j]=1;
}
i--;
}
i=m-2;
while(i>=0)
{
    j=n-2;
    while(j>=0)
    {
        dp[i][j]=Math.min((dp[i][j+1]-arr[i][j+1]),dp[i+1][j]-arr[i+1][j]);
        if(dp[i][j]<=0)
        {
            dp[i][j]=1;
        }
        j--;
        
    }
    i--;
}


return dp[0][0];
}
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int [][]arr= new int[m][n];
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
        int [][]dp= new int[m][n];
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
   int ans= DP(arr,dp);
   System.out.println(ans);
    }
}
