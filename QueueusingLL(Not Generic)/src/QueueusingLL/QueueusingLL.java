package QueueusingLL;

public class QueueusingLL {


private Node front;
private Node rear;
private int size;


public QueueusingLL()
{
    front=null;
    rear=null;
    size=0;
}

public int size()
{
    return size;
}

public boolean isempty()
{
    return size==0;
}
public int front() 
{if(size()==0)
    {
        return -1;
    }


    return front.data;
}

public void Enqueue(int element)
{
Node node1=new Node(element);
if(size()==0)
{
    front=node1;
    rear=node1;
}

else{
    rear.next=node1;
    rear=node1;
}
size++;

}
public int Dequeue() 
{

if(size()==0)
{
    return -1;
}

 int i=front.data;
  front=front.next;
    if(size()==1)
    {
        rear=null;
    }
    size--;
    return i;


}
}

