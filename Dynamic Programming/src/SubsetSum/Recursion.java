package SubsetSum;

import java.util.ArrayList;

public class Recursion {


public static  ArrayList<Integer> SubsetSum(int[]arr,int sum,int n)
{
if(n<0)
{
    ArrayList<Integer>list=new ArrayList<>();
    return list;
}


    ArrayList<Integer>list=SubsetSum(arr, sum, n-1);
    int m=list.size();
    int i=0;
    while(i<m)
    {
        list.add(list.get(i)+arr[n]);
        i++;
    }
    list.add(arr[n]);
    return list;


}
public static boolean  finalans(int[]arr,int sum)
{

   ArrayList<Integer>list= SubsetSum(arr,sum,arr.length-1);
   int i=0;
   while(i<list.size())
   {
       if(list.get(i)==sum)
       {
           
           return true;
       }
       i++;
   }
return false;
}

    public static void main(String[]args)
    {int[]arr={4,2,5,6,7};
    int sum=14;
      
   boolean ans = finalans(arr,sum);
   System.out.println(ans);
        
    }
}
