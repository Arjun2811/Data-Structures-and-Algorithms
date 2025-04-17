package KnapSack;

public class KnapSackDP {

public static int KnapSackDP(int[]weight,int[]value,int maxweight,int i,int dp[][])
{

i=weight.length;
{
int j=0;
while(j<maxweight+1)
{
dp[i][j]=0;
j++;
}
j=0;
i=0;
while(i<weight.length+1)
{
dp[i][j]=0;
i++;
}
i=weight.length-1;
while(i>=0)
{
j=1;
while(j<maxweight+1)
{
    if(weight[i]>j)
    {
dp[i][j]=dp[i+1][j];
    }
    else{
        int ans1=dp[i+1][j];
        int ans2=value[i]+dp[i+1][j-weight[i]];
       dp[i][j]= Math.max(ans1,ans2);
    }
    j++;
}
i--;
}

return dp[0][maxweight];
}




}



    public static void main(String[]args)
    {
        // int weight[]={2,3,4};
        // int value[]={5,10,15};
        // int maxweight=3;
        int weight[]={12,7,11,8,9};
        int value[]={24,13,23,15,16};
        int maxweight=26;
        int dp[][]=new int[weight.length+1][maxweight+1];
        int i=0;
        while(i<weight.length+1)
        {
            int j=0;
            while(j<maxweight+1)
            {
                dp[i][j]=-1;
                j++;
            }
            i++;
        }
       int ans= KnapSackDP(weight,value,maxweight,i,dp);
       System.out.println(ans);
    }
}
