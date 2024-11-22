package DynamicQueue;

public class QueueusingDynamic {

    private int data[];
   private  int front;
   private  int rear;
   private int size;

public QueueusingDynamic()
{
    data=new int[3];
    front=-1;
    rear=-1;
    size=0;

}

public QueueusingDynamic(int capacity)
{
    data= new int[capacity];
    front=-1;
    rear=-1;
    size=0;
}

public boolean isEmpty()
{
return size==0;
}


public int size()
{
    return size;
}
public int front() throws QueueEmptyException
{
if(size()==0)
{
    throw new QueueEmptyException();
}


    return data[front];
}

public void enqueue(int element)
{
if(size()==data.length)
{
    doublecapacity();
}
if(size()==0)
{
    front=0;
}

rear=(rear+1)%data.length;
// rear++;
// if(rear==data.length)
// {
//     rear=0;
// }


data[rear]=element;
size++;

}
public void doublecapacity()
{
    int temp[]=data;
    data=new int[temp.length*2];
int j=0;
    int i=front;
    while(i<temp.length)
    {
        data[j]=temp[i];
        i++;
        j++;
    }
    i=0;
    while(i<=front-1)
    {
        data[j]=temp[i];
        i++;
        j++;
    }
    front=0;
    rear=temp.length-1;

}

public int dequeue() throws QueueEmptyException
{
if(size()==0)
{
    throw new QueueEmptyException();
}




int temp=data[front];

front=(front+1)%data.length;
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