package QueueusingStacks;

public class Queueuse {


public static void main(String[]args) throws QueueEmptyException
{
    QueueusingStacks<Integer> Queue=new QueueusingStacks<Integer>();
    int i=0;
    int arr[]={1,2,2};
    int n=arr.length;
    while(i<n)
    {
Queue.Enqueue(arr[i]);
i++;
    }
    System.out.println(Queue.size());
    while(!Queue.isEmpty())
    {


System.out.println(Queue.dequeue());
}
    System.out.println(Queue.size());
}

}

