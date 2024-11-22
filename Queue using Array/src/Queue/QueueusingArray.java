package Queue;

public class QueueusingArray {


private int data[];
private int front;
private int rear;
private int size;

public QueueusingArray()
{
    data=new int[7];
    front=-1;
    rear=-1;
    size=0;
}
public QueueusingArray(int capacity)
{
    data = new int[capacity];
    front=-1;
    rear=-1;
    size=0;
}

public int size()
{
    return size;
}
public boolean isEmpty()
{
    return size==0;
}
public int front() throws QueueEmptyException
{
if(size()==0)
{
    throw new QueueEmptyException();
}

    return data[front];
}
public void enqueue(int element) throws QueueFullException
{
if(size()==data.length)
{
    throw new QueueFullException();
}

if(size()==0)
{
    front=0;
}
rear=(rear+1)%data.length;  //  alternate way of writing the niche vala part.  (Circular queue concept)
// rear++;
// if(rear==data.length)
// {
//     rear=0;
// }



size++;
    data[rear]=element;
}

public int dequeue() throws QueueEmptyException
{
if(size()==0)
{
    throw new QueueEmptyException();
}
int temp=data[front];  
front=(front+1)%data.length;  //  alternate way of writing the niche vala part.  (Circular queue concept)

// front++;
// if(front==data.length)
// {
//     front=0;
// }




size--;
if(size()==0)
{
    front=-1;
    rear=-1;
}
return temp;
}

}
