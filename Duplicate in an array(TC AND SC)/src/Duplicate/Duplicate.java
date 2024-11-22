package Duplicate;

public class Duplicate {


    // public static int Duplicate(int[]arr)
    // {
    //     int n=arr.length;
    //     int i=0;
    //     while(i<n)
    //     {int j=0;
    //         while(j<n)
    //         {int ans =0;
    //             if(i==j)
    //             {
    //                 j++;
    //                 continue;
    //             }
    //         ans=arr[i]^arr[j];
            
    //             if(ans==0)
    //             {
    //             return arr[i];
    //         }
    //         else{
    //             j++;
    //         }
    //     }
    //     i++;
    // }
    // return 0;

        
    // }next approach is the more efficent in terms of T.c AND sc

    public static int Duplicate(int arr[])
    {
        int i=0;
        int sum=0;
        int n=arr.length;
        while(i<n)
        {
         sum+=arr[i];
         i++;
        }
        int Sumofnminus2numbers=((n-2)*(n-1))/2;
        int duplicate=sum-Sumofnminus2numbers;
        return duplicate;
    }


    public static void main(String[] args) {
        int arr[]={0,2,3,3,1};
        int ans =Duplicate(arr);
        System.out.println(ans);
    }
}
