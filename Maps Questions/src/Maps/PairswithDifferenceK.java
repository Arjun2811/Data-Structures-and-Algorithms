package Maps;

import java.util.HashMap;
import java.util.Set;

public class PairswithDifferenceK {


public static int pair(int[]arr,int k)
{HashMap <Integer,Integer>map= new HashMap<>();
int n=arr.length;
int ans=0;
int i=0;
while(i<n)
{
if(map.containsKey(arr[i]))
{
    map.put(arr[i],map.get(arr[i])+1);
}

else{

    map.put(arr[i],1);
}
i++;
}
Set<Integer>keys=map.keySet();
for(int ele:keys)
{
    int value=map.get(ele);
    int firstx=ele-k;
if(firstx==ele)
{  value=value-1;
    while(value>0)
    {
        ans+=value;
        value--;
    }

}


   else if(map.containsKey(firstx))
    {
        int freqx1=map.get(firstx);
        int freqele=value;
        ans+=freqx1*freqele;
    }
 
    int secondx=ele+k;
    if(secondx==ele)
    {  value=value-1;
        while(value>0)
        {
            ans+=value;
            value--;
        }
    
    }
    else if(map.containsKey(secondx))
    {
        int freqx2=map.get(secondx);
        int freqele=value;
        ans+=freqx2*freqele;
    }
    map.put(ele,0);

}

return ans;



}
    public static void main(String[]args){


        int arr[]={2,-1,3,5,6,0,-1,2,6};
        int ans=pair(arr,3);
        System.out.println(ans);
        
    }
}
