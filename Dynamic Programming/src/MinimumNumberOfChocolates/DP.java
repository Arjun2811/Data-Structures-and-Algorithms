package MinimumNumberOfChocolates;

public class DP {



public static void Frontphase(int[]arr,int dp[])
{
    if(arr[0]>arr[1])
    {
        dp[0]=2;
    }
    else{
        dp[0]=1;
    }
int i=1;
while(i<arr.length)
{
    if(arr[i]>arr[i-1])
    {
     dp[i]=1+dp[i-1];
    }
    else{
        dp[i]=1;
    }
    i++;
}
}




public static void Backphase(int[]arr,int dp[])
{

int i=arr.length-2;
while(i>=0)
{
    if(arr[i]>arr[i+1]&&dp[i]<=dp[i+1])
    {

dp[i]=dp[i+1]+1;
    }

    i--;
}



}




public static void MinChocolate(int[]arr,int dp[])
{
    Frontphase(arr,dp);
    Backphase(arr,dp);
}


    public static void main(String[]args)
    {
        // int[]arr={8,7,5};
        int []arr={1,4,4,6};
        int dp[]=new int[arr.length];
        MinChocolate(arr,dp);
        int i=0;
        int ans=0;
        while(i<dp.length)
        {
            ans+=dp[i];
            i++;
        }
        System.out.println(ans);
    }
}
