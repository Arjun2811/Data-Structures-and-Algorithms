
package PriorityQueueQuestions;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuytheTicket {

public static int BuytheTicket(int[]arr,int k)
{
PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
Queue <Integer>q=new LinkedList<>();
int i=0;
while(i<arr.length)
{
    q.add(i);
    pq.add(arr[i]);
    i++;
}
int time=0;
while(!q.isEmpty())
{
if(arr[q.peek()]<pq.element())
{
    q.add(q.poll());

}
else{
    int idx=q.poll();
    pq.remove();
    time++;
    if(idx==k)
    {
        break;
    }
}


}
return time;
}









    public static void main(String[]args){

        int arr[]={2,3,4,5,8,2,2};
        int ans=BuytheTicket(arr,3);
        System.out.println(ans);
    }
}
