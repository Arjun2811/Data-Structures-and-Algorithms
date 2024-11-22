package TripletSum;

import java.util.Arrays;

public class Triplet {


    public static int Triplet(int[]arr,int num)
    { Arrays.sort(arr);
        int i=0;
        int count=0;
        int n=arr.length;
        while(i<n)
        { int j=i+1;
            int k=n-2;
            while(j<k)
            {
         if(arr[i]+arr[j]+arr[k]>num)
         {
            k--;
            
         }
         else if(arr[i]+arr[j]+arr[k]<num)
         {
            j++;
         }
         else
         { int count1=0;
            int f=0;
            while(f<n)
            {
               if(arr[f]==arr[k])
               {
                  count1++;
               }
               f++;
            }
            count+=count1;;

            j++;
         }
            }
            i++;
        }
        return count;
    }
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int num=19;
       int ans= Triplet(arr,num);
       System.out.println(ans);

    }

}
