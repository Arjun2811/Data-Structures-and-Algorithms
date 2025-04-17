package PriorityQueueQuestions;


import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

public static int klargest(int[]arr,int k)
{

    PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
    int i=0;
    while(i<arr.length)
    {
        pq.add(arr[i]);
        i++;
    }
    i=1;
    while(i<k)
    {
        pq.remove();
        i++;
    }
    return pq.element();
    




}
public static int klargestbetter(int[]arr,int k)
{    PriorityQueue<Integer>pq= new PriorityQueue<>();
    int i=0;
    while(i<k)
{
    pq.add(arr[i]);
    i++;
}
while(i<arr.length)
{
if(arr[i]>pq.element())
{
    pq.remove();
    pq.add(arr[i]);
}
i++;
}
return pq.element();

}
    public static void main(String[]args){
        int arr[]={5,6,9,3,2};
        // int arr[]={11,9,8,7,4,3};
        int k=2;
        // int ans=klargest(arr,k);
        int ans=klargestbetter(arr,k);
        System.out.println(ans);
    }
}
