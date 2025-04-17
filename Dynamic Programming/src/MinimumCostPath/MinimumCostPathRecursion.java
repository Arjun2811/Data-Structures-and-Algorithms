package MinimumCostPath;

public class MinimumCostPathRecursion {


public static int MinCostPath(int[][]arr,int i,int j)
{
int m=arr.length;
int n=arr[0].length;

if(i==m-1&&j==n-1)
{
    return arr[i][j];
}


if(j>=n||i>=m)
{

    return Integer.MAX_VALUE;
}


int op1=MinCostPath(arr, i, j+1);
int op2=MinCostPath(arr, i+1, j+1);
int op3=MinCostPath(arr, i+1, j);

int min=Math.min(op1,Math.min(op2,op3));
return arr[i][j]+min;





}
    public static void main(String[]args)
    {
        int arr[][]={{1,1,1},{4,5,2},{7,8,9}};
       int ans= MinCostPath(arr,0,0);
       System.out.println(ans);
    }
}
