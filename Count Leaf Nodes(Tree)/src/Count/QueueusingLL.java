package Count;

public class QueueusingLL<T> {


private Node<T>front;
private Node<T>rear;
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
public T front() throws QueueEmptyException
{if(size()==0)
    {
        throw new QueueEmptyException();
    }


    return front.data;
}

public void Enqueue(T element)
{
Node <T> node1=new Node(element);
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
public T Dequeue() throws QueueEmptyException
{

if(size()==0)
{
    throw new QueueEmptyException();
}

T i=front.data;
front=front.next;
  if(size()==1)
  {
      rear=null;
  }
  size--;
  return i;


}
}


