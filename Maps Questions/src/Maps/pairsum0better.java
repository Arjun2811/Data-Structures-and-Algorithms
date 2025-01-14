package Maps;

import java.util.HashMap;

public class pairsum0better {

public static int pairsum0better(int[]arr,int n)
{HashMap <Integer,Integer>map= new HashMap<>();
    int ans=0;
    int i=0;
    while(i<n)
    {
    if(arr[i]==0)
    {if(map.containsKey(arr[i]))
     { 
       map.put(arr[i],map.get(arr[i])+1);
    }
    else{
        map.put(arr[i],1);
    }
}   
        else if(map.containsKey(arr[i]))
        {
            
            int value=0-arr[i];
            if(map.containsKey(value))
            {
                ans+=map.get(arr[i])*map.get(value);
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
        
        map.put(arr[i],1);
        int value=0-arr[i];
            if(map.containsKey(value))
            {
                ans+=map.get(arr[i])*map.get(value);
            }
        
        }
        i++;
    }
    if(map.containsKey(0)==true)
    {
        int smallans=map.get(0);
        smallans=smallans-1;
        while(smallans>=1)
        {
            ans+=smallans;
            smallans--;
        }
    }
    return ans;
}

public static void main(String[]args)
{
    int arr[]= {0,0,0,0,0};
    int ans=pairsum0better(arr,arr.length);
    System.out.println(ans);
}


}
