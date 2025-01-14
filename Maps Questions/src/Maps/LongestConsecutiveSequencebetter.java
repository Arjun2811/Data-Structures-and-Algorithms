package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequencebetter {

public static ArrayList<Integer> longestbetter(int[]arr)
{int start=-1;
    int end=-1;
    int max=Integer.MIN_VALUE;
    HashMap<Integer,Boolean>map=new HashMap<>();
    int i=0;
    while(i<arr.length)
    {
        map.put(arr[i],true);
        i++;
    }
    i=0;
    while(i<arr.length)
    { if(map.get(arr[i])==true)
        {
        int length=1;
        int j=1;
        while(j<arr.length)
        {
if(map.containsKey(arr[i]+j))
{map.put(arr[i]+j,false);
    j++;
    length++;

}
else{

    break;
}
        }
        int f=1;
        while(arr[i]-f>=0)
        {
            if(map.containsKey(arr[i]-f))
            {map.put(arr[i]-f,false);
                f++;
                length++;
            }
            else{
                break;
            }
        }
        if(length>max)
        {
      start=arr[i]-f+1;
      end=arr[i]+j-1;
        max=length;
        }
    }
i++;
        }
        ArrayList<Integer>newarr=new ArrayList<>();
        if(start==end)
        {
            newarr.add(start);
        }
        else{
        newarr.add(start);
        newarr.add(end);
    }
        return  newarr;
    }



    public static void main(String[]args)
    {
        int[]arr={3,7,2,1,9,8,41};
       ArrayList<Integer>newarr= longestbetter(arr);
       for(int ele:newarr)
       {
        System.out.println(ele);
       }

    }
}
