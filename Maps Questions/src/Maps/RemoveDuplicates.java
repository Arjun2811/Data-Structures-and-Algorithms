package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {


public static ArrayList<Integer> RemoveDuplicates(int arr[])
{ArrayList<Integer>output=new ArrayList<>();
HashMap<Integer,Boolean> seen=new HashMap<>();
int i=0;
while(i<arr.length)
{
    if(seen.containsKey(arr[i]))
    {i++;
   continue;
    }
    else{
output.add(arr[i]);
seen.put(arr[i],true);
    }
    i++;
}
return output;

}





    public static void main(String[] args) {

int arr[]={1,3,2,4,1,2,2,2,100000,3,2};

        ArrayList<Integer>output=RemoveDuplicates(arr);
        int i=0;
        while(i<output.size())
        {
            System.out.println(output.get(i));
            i++;
        }
        
    }
}
