package Maps;

import java.util.HashMap;

public class LongestSubarraywithSum0 {


    public static int longest(int[]arr)
    {HashMap<Integer,Integer>map=new HashMap<>();
int sum=0;
int i=0;
int n=arr.length;
int max=Integer.MIN_VALUE;
while(i<n)
{
sum+=arr[i];

if(sum==0)
{
   int index= i;
   if(max<index+1)
   {
    max=index+1;
   }
}




else if(map.containsKey(sum))
{
    int latestindex=i;
    int lastindex=map.get(sum);
    int length=latestindex-lastindex;
    if(max<length)
    {
        max=length;
    }

}
else{
map.put(sum,i);

}


i++;
}
if(max==Integer.MIN_VALUE)
{
    return 0;
}
return max;
    }


    public static void main(String[]args)
    {
        //int arr[]={6,-3,-1,2,-4,3,1,-2,20};
        //int arr[]={16,1,5,8,-4,2};
        int arr[]={2,-2,0,-2,2};
        int max=longest(arr);
        System.out.println(max);
    }
}
