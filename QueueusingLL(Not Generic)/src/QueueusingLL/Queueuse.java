package QueueusingLL;

public class Queueuse {


    public static void main(String[]args) throws QueueEmptyException
    {
        QueueusingLL queue= new QueueusingLL();
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
