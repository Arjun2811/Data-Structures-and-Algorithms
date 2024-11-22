package CheckRedundant;

public class StackusingLL<T>
{

private Node<T> Head;
private int size;

public StackusingLL()
{
Head=null;
size=0;
}
public int size()
{ 

    return size;

}
public void push(T element)
{ Node<T> node1= new Node(element);
   
    node1.next=Head;
    Head=node1;
    size++;
   }


public T pop() throws StackEmptyException 
{ 
    if(size()==0)
    {
     StackEmptyException e = new StackEmptyException();
     throw e;
    }


    T data=Head.data;
    Head=Head.next;
    size--;
    return data;

}

public boolean isempty()
{
    if(size==0)
    {
        return true;
    }
    else{
        return false;
    }
}

public T Top() throws StackEmptyException 
{
  if(size()==0)
  {
    StackEmptyException e = new StackEmptyException();
    throw e;
  }
  
    return Head.data;
  
  

}


}

