
package Maps;

import java.util.HashMap;
import java.util.Set;

public class PairSum0 {

public static int PairSum0(int[]arr,int n)
{
    HashMap<Integer,Integer>map=new HashMap<>();
int ans=0;

int i=0;
while(i<arr.length)
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
{if(ele==0)
    {
        int value=map.get(ele);
        value=value-1;
        while(value>=1)
        {
            ans+=value;
            value--;
        }
    }
    else{
int a=0-ele;

if(map.containsKey(a))
{
ans+=map.get(ele)*map.get(a);
map.put(ele,0);
map.put(a,0);

}
if(map.containsKey(ele))
{
    map.put(ele,0);
 
}
}
}
return ans;




}









    public static void main(String[]args)
    {
        int arr[]={0,0,0,0,0,2,-2};
int ans=PairSum0(arr,arr.length);
System.out.println(ans);

    }
}
