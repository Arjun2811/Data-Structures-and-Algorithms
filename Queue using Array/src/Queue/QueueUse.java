package Queue;

public class QueueUse {


    public static void main(String[]args) throws QueueFullException, QueueEmptyException
    {
        QueueusingArray queue=new QueueusingArray();
        int i=0;
        while(i<5)
        {
            queue.enqueue(i);
            i++;
        }
queue.dequeue();
queue.dequeue();
queue.enqueue(10);
queue.enqueue(20);

        while(!queue.isEmpty())
        {
    
    System.out.println(queue.dequeue());
        }
    }
}
