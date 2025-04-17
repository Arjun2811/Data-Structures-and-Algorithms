package PriorityQueueQuestions;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class LargestKelements {

public static ArrayList<Integer> KLargest(int[]arr,int k)
{
PriorityQueue<Integer>pq=new PriorityQueue<>();
int i=0;


while(i<k)
{
    pq.add(arr[i]);
    i++;
}
while(i<arr.length)
{
if(arr[i]>pq.element())
{pq.remove();
    pq.add(arr[i]);

}
i++;
}
ArrayList<Integer> arr1=new ArrayList<>();
int f=0;
while(f<k)
{
arr1.add(pq.remove());
f++;
}
return arr1;

}




    public static void main(String[]args)
    {
        int arr[]={2,12,9,16,10,5,3,20,25,11,1,8,6 };
        int k=4;
       ArrayList<Integer>arr1= KLargest(arr,k);
       int i=0;
       while(i<k)
       {
        System.out.println(arr1.get(i));
        i++;
       }
    }
}

