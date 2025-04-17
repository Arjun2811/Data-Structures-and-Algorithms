package PriorityQueueQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {



public static void RunningMedian(int[]arr)
{

PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<Integer>minpq=new PriorityQueue<>();

int i=0;

while(i<arr.length)
{
if(maxpq.isEmpty()||arr[i]<maxpq.element())
{
maxpq.add(arr[i]);
}
else{
    minpq.add(arr[i]);
}
//balancing
if(maxpq.size()-minpq.size()>1)
{
int removedelement=maxpq.remove();
minpq.add(removedelement);
}
else if(minpq.size()-maxpq.size()>1)
{
    int elementremoved=minpq.remove();
    maxpq.add(elementremoved);

}
if((maxpq.size()+minpq.size())%2==0)
{
    int median =((maxpq.element()+minpq.element())/2);
    System.out.println(median);
}
else{
if(maxpq.size()>minpq.size())
{
    int median=maxpq.element();
    System.out.println(median);
}
else{
int median=minpq.element();
System.out.println(median);
}
}

i++;


}




}






    public static void main(String[]args)
{
int arr[]={6,2,1,3,7,5};
RunningMedian(arr);
}
}