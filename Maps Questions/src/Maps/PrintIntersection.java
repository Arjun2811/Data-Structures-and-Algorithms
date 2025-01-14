package Maps;

import java.util.HashMap;
import java.util.Set;

public class PrintIntersection {



public static void print(int[]arr1,int []arr2)
{

    HashMap<Integer,Integer>map1= new HashMap<>();
    HashMap<Integer,Integer>map2= new HashMap<>();
    int i=0;
    while(i<arr1.length)
    {
if(map1.containsKey(arr1[i]))
{
    map1.put(arr1[i],map1.get(arr1[i])+1);
}
else{
        map1.put(arr1[i],1);
    }
    i++;
}
i=0;
while(i<arr2.length)
{
if(map2.containsKey(arr2[i]))
{
map2.put(arr2[i],map2.get(arr2[i])+1);
}
else{
    map2.put(arr2[i],1);
}
i++;
}



Set<Integer>keys=map1.keySet();
for(int ele:keys)
{
    if(map2.containsKey(ele))
    {
        int map1value=map1.get(ele);
        int map2value=map2.get(ele);
        if(map1value<=map2value)
        {
 i=0;
while(i<map1value)
{
System.out.println(ele);
i++;
}
        }
else{
    i=0;
    while(i<map2value)
{
System.out.println(ele);
i++;
}
}
        }
    }
}





public static void main(String[]args)
{
    int arr1[]={2,3,4,5,2};
    int arr2[]={2,2,3,5,7,8};

    print(arr1,arr2);
}



}
