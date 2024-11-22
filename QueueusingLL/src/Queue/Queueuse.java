package Queue;

public class Queueuse {


    public static void main(String[]args) throws QueueEmptyException
    {
        QueueusingLL<Integer> queue= new QueueusingLL<>();
        int i=0;
        while(i<15)
        {
            queue.Enqueue(i);
            i++;
        }
        while(!queue.isempty())
        {
            System.out.println(queue.Dequeue());
        }
    }
}
