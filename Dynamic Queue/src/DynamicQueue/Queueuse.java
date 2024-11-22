package DynamicQueue;

public class Queueuse {

    public static void main(String[]args) throws QueueEmptyException
    {
        QueueusingDynamic queue=new QueueusingDynamic(3);
        int i=0;
        while(i<10)
        {
            queue.enqueue(i);
            i++;
        }
        while(!queue.isEmpty())
        {
             System.out.println(queue.dequeue());
        }
    }
}
