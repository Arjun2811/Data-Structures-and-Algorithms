package PriorityQueueQuestions;

import java.util.PriorityQueue;

public class KsortedArray {


public static void Ksorted(int[]arr,int k)
{
    PriorityQueue<Integer> pq= new PriorityQueue();
    int i=0;
    while(i<k)
    {
        pq.add(arr[i]);
        i++;
    }
while(i<arr.length)
{
    arr[i-k]=pq.remove();
    pq.add(arr[i]);
    i++;
}
int j=i-k;
while(j<arr.length)
{
    arr[j]=pq.remove();
    j++;
}
}

    public static void main(String[]args)
    {
        int arr[]={2,4,1,9,6,8};
        Ksorted(arr,3);
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}
