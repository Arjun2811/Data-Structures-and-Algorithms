package Maps;


import java.util.HashMap;

public class MaximumFrequencyNumber {


//int arr[]={1,2,2,1}
public static int MaximumFrequencyNumber(int[]arr)
{
    
HashMap<Integer,Integer>map=new HashMap<>();
int i=0;
int max=Integer.MIN_VALUE;
int maxvalue=-1;
while(i<arr.length)
{
    if(map.containsKey(arr[i]))
    {
        int a=map.get(arr[i]);
      map.put(arr[i],a+1);

    }
    else{
        map.put(arr[i],1);
    }
    i++;
}
i=0;
while(i<map.size())
{
    if(map.get(arr[i])>max)
    {
maxvalue=arr[i];
max=map.get(arr[i]);
    }
    i++;
}

return maxvalue;



}


    public static void main(String[] args) {
        
int arr[]={1,2,2,1};
       int max= MaximumFrequencyNumber(arr);
       System.out.println(max);
    }
}
