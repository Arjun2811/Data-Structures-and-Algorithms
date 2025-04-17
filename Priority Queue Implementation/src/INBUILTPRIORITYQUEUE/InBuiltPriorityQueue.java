package INBUILTPRIORITYQUEUE;

import java.util.PriorityQueue;

public class InBuiltPriorityQueue {



    public static void main(String[]args)
    {
        PriorityQueue<Integer>pq= new PriorityQueue();
        int i=0;
        int arr[]={5,1,9,2,0,6};
        while(i<arr.length)
        {
pq.add(arr[i]);
i++;

        }

// System.out.println(pq.peek()); it gives null when pq is empty
//System.out.println(pq.element()); it gives exception when pq is empty

        while(!pq.isEmpty())
        {
            System.out.println(pq.remove()+" ");
        
        }
         
        
    }
}
