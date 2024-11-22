package MaximumProfit;
public class Profit {


public static int Profit(int[]arr)
{
    int n=arr.length;
    int i=0;
    int Target=0;
    int TargetTobe=0;
    while(i<n)
    {
     int j=0;
     TargetTobe=0;
     while(j<n)
     {
        if(arr[i]<=arr[j])
        {
            TargetTobe+=arr[i];

        }
        j++;
     }
     if(Target<TargetTobe)
     {Target=TargetTobe;
     }
     i++;

    }
    return Target;
}
public static void main(String[]args)
{
    int arr[]= {34,78,90,15,67};
    int Target=Profit(arr);
    System.out.println(Target);

}

}
// public static int maximumProfit(int arr[]) {
//     // Write your code here
// Arrays.sort(arr);
// int ans=Integer.MIN_VALUE;
// int n=arr.length;
// for(int i=0;i<n;i++)
// {
// ans=Math.max(ans,arr[i]*(n-i));
// }
// return ans;
// }
// }better approach
