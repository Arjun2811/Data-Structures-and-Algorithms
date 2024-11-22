package PAIRSUM;

import java.util.Arrays;

public class Pair {


public static int Pair(int[]arr,int num)
{
    int n=arr.length;
    Arrays.sort(arr);
    int L=0;
    int Ans=0;
    int count=0;
    int count1=0;
    int R=n-1;
    while(L<R)
    {
        if(arr[L]+arr[R]>num)
        {
            R--;
            
        }
        else if(arr[L]+arr[R]<num)
        {
            L++;
            
        }
       if(arr[L]+arr[R]==num)
        { if(arr[L]!=arr[R])
           { count=0;
            int i=0;
            while(i<n)
            {
                if(arr[i]==arr[L])
                {
                    count++;
                }
                i++;
            }
            int j=0;
            count1=0;
            while(j<n)
            {  
               if(arr[j]==arr[R])
               {
                count1++;
               }
               j++;
            }
            Ans+=(count*count1);
            L+=count;
        }
    
        
        
        else
            {
                int f=0;
                count=0;
            while(f<n)
            { 
                if(arr[f]==arr[L])
                {
                    count++;
                }
                f++;
            }
             int Result=(count*(count-1))/2;
             Ans+=Result;
         return Ans;
             
        }
    }
}
    return Ans;
    
}


    public static void main(String[] args) {
        int arr[]={4,5,7,6,2,1};

        int num=6;
        int Ans=Pair(arr,num);
        System.out.println(Ans);
    }
}
