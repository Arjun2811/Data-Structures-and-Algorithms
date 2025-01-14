package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {


    public static ArrayList<Integer> Longest(int[]arr)
    {int start=-1;
        int end=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int i=0;
        int max=Integer.MIN_VALUE;
        while(i<n)
        {
            map.put(arr[i],1);
            i++;
        }
        i=0;
        while(i<n)
        { int j=1;
            while(j<n)
            {
            if(map.containsKey(arr[i]+j))
            {

                j++;
            }
            else{
                break;
            }
        }
        
            if(j>max)
            {
                start=arr[i];
                 end=arr[i]+j-1;
                max=j;
            }
            i++;

            }
            ArrayList<Integer>ans= new ArrayList<>();
            if(start==end)
            {
                ans.add(start);
            }
            else{
            ans.add(start);
            ans.add(end);
        }
            return ans;
        }
    

    public static void main(String[]args){
        int[]arr={1,3,5,7,9};
        ArrayList<Integer>ans=Longest(arr);
        for(int val:ans)
        {
            System.out.println(val);
        }

    }
}
