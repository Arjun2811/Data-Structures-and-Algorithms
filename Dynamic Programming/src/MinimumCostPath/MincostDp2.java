package MinimumCostPath;

public class MincostDp2 {


public static int MincostDp2(int arr[][],int i,int j,int [][]storage,int m,int n)
{

storage[m-1][n-1]=arr[m-1][n-1];

 i=m-1;
 j=n-2;
 while(j>=0)
 {
storage[i][j]=storage[i][j+1]+arr[i][j];
j--;
 }
j=n-1;
i=m-2;
while(i>=0)
{
    storage[i][j]=storage[i+1][j]+arr[i][j];
    i--;
}
 i=m-2;
 while(i>=0)
 {
    j=n-2;
    while(j>=0)
    {
        storage[i][j]=arr[i][j];
        int ans=Math.min(storage[i][j+1],Math.min(storage[i+1][j+1],storage[i+1][j]));
        storage[i][j]+=ans;
        j--;
    }
    i--;
 }
 return storage[0][0];


}


    public static void main(String[]args)
    {
//         int arr[][]={{9,6,0,12,90,1},{2,7,8,5,78,6},{1,6,0,5,10,-4},{9,6,2,-10,7,4},{10,-2,0,5,5,7}};
//         4 4
// 5 7 2 4
// 1 8 1 3
// 6 2 9 5
// 1 6 2 8

int arr[][]={{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
int m=arr.length;
int n=arr[0].length;
        int storage[][]=new int[m][n];
        int ans=MincostDp2(arr,0,0,storage,m,n);
        System.out.println(ans);

    }
}
