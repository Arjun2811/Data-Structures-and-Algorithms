package MinimumCostPath;

public class MinCostPathDP {

public static int MinCostPathDP(int[][]arr)
{
    int m=arr.length;
    int n=arr[0].length;
    int storage[][]=new int[m][n];
    int i=0;
    int j=0;
    while(i<m)
    {j=0;
        while(j<n)
    {
        storage[i][j]=arr[i][j];
        int min=Integer.MAX_VALUE;
        if(i-1>=0)
        {
        int op1=storage[i-1][j];
        min=op1;

        }
        if(j-1>=0)
        {
        int op2=storage[i][j-1];
        if(min>op2)
        {
            min=op2;
        }
        }
        if(i-1>=0&&j-1>=0)
        {
        int op3=storage[i-1][j-1];
        if(min>op3)
        {
            min=op3;
        }
        }
        if(min==Integer.MAX_VALUE)
        {min=0;
        }
        storage[i][j]+=min;
        j++;

    }
    i++;
}
return storage[m-1][n-1];
}

    public static void main(String[]args)
    {
int arr[][]={{3,4,1,2},{2,1,8,9},{4,7,8,1}};


        int ans=MinCostPathDP(arr);
        System.out.println(ans);
        
    }
}
