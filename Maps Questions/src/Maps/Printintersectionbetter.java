package Maps;

import java.util.HashMap;

public class Printintersectionbetter {

public static void printbetter(int[]arr1,int[]arr2)
{
    HashMap<Integer,Integer>map= new HashMap<>();
    int i=0;
    while(i<arr1.length)
    {
        if(map.containsKey(arr1[i]))
        {
          map.put(arr1[i],map.get(arr1[i])+1);
        }
        else{
map.put(arr1[i],1);
        }
        i++;
    }
    i=0;
    while(i<arr2.length)
    {
        if(map.containsKey(arr2[i]))
        {
            int freq=map.get(arr2[i]);
            if(freq>0)
            {
                System.out.println(arr2[i]);
                map.put(arr2[i],freq-1);
            }
        }
        i++;
    }
}


    public static void main(String[]args){


        int arr1[]={1,4,5,2,2,3,6,5,3,2};
        int arr2[]={0,2,3,2,6,6,5,1};
        printbetter(arr1,arr2);
    }
}
