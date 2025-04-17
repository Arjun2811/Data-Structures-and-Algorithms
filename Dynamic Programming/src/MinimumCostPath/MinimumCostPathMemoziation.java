package MinimumCostPath;

public class MinimumCostPathMemoziation {


public static int MinCostMemo(int[][]arr,int i,int j,int m,int n,int storage[][])
{

    if(i==m-1&&j==n-1)
    {


        storage[i][j]=arr[i][j];
        return storage[i][j];
    }
    


    
    
    if(j>=n||i>=m)
    {
    
        return Integer.MAX_VALUE;
    }
    if(storage[i][j]!=0)
    {
        return storage[i][j];
    }
    
    int op1=MinCostMemo(arr, i, j+1,m,n,storage);
    int op2=MinCostMemo(arr, i+1, j+1,m,n,storage);
    int op3=MinCostMemo(arr, i+1, j,m,n,storage);
    
    int min=Math.min(op1,Math.min(op2,op3));
    storage[i][j]=arr[i][j]+min;
    return storage[i][j];
    
}

    public static void main(String[]args)
    {
        int arr[][]={{1,1,1},{4,5,2},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int storage[][]=new int[m][n];
        int ans=MinCostMemo(arr,0,0,m,n,storage);
        System.out.println(ans);
    }
}
