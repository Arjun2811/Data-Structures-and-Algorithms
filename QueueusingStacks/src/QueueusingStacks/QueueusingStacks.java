package QueueusingStacks;
import java.util.Stack;
public class QueueusingStacks<T> {

Stack<T> s1;
Stack<T> s2;


public QueueusingStacks()
{
    s1=new Stack<>();
    s2=new Stack<>();
}

public int size()
{
    return s1.size();
}
public boolean isEmpty()
{
    return s1.isEmpty();
}
public T front() throws QueueEmptyException
{ if(s1.size()==0)
    {
        throw new QueueEmptyException();
    }
    
    T a =s1.peek();
    while(!s1.isEmpty())
    {  if(s1.size()==1)
        {
            return a;
        }
        
        a=s1.peek();
    s2.push(a);
      s1.pop();
    }
    while(!s2.isEmpty())
    {  T f =s2.peek();
        s1.push(f);
        s2.pop();

    }
    return a;

}
public void Enqueue(T element)
{
s1.push(element);

}

public T dequeue() throws QueueEmptyException
{
if(s1.size()==0)
{
    throw new QueueEmptyException();
}

    T a =s1.peek();
    while(!s1.isEmpty())
    { if(s1.size()==1)
        {a=s1.peek();
          s1.pop();
          break;
        }
        a=s1.peek();
    s2.push(a);
      s1.pop();
      
      
    }
    while(!s2.isEmpty())
    {  T f =s2.peek();
        
        s1.push(f);
        s2.pop();
        

    }
    return a;

}
}
