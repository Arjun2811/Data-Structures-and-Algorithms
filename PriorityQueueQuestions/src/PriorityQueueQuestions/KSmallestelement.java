package PriorityQueueQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestelement {


    public static ArrayList<Integer> ksmallest(int[]arr,int k)
{
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int i=0;
    while(i<k)
{
    pq.add(arr[i]);
    i++;
}
while(i<arr.length)
{
    if(arr[i]< pq.element())
    {
pq.remove();
pq.add(arr[i]);
    }
    i++;
}
    ArrayList<Integer>arr1= new ArrayList<>();
while(!pq.isEmpty())
{

    arr1.add(pq.remove());

}
return arr1;
}
    public static void main(String[]args)
    {
        int arr[]={2,12,9,16,10,5,3};
       
        int k=3;
        ArrayList<Integer>arr1=ksmallest(arr,k);
        for(int ele:arr1)
        {
            System.out.println(ele);
        }
    }
}
