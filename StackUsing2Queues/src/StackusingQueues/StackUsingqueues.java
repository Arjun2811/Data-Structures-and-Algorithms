package StackusingQueues;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingqueues {

 
Queue<Integer> q1;
Queue<Integer> q2;

public StackUsingqueues()
{
    q1=new LinkedList();
    q2=new LinkedList();
}


public int size()
{
    return q1.size()+q2.size();
}
public boolean isEmpty()
{
    return size()==0;
}

public int Top()
{int a=-1;
if(!q1.isEmpty())
{while(!q1.isEmpty())
    {
     a=q1.remove();
    q2.add(a);
}
}
else if(!q2.isEmpty())
{while(!q2.isEmpty())
    {
a =q2.remove();
q1.add(a);
    }
}

return a;
}
public void push(int element)
{if(size()==0)
    {
        q1.add(element);
    }

    else if(!q1.isEmpty())
    {
        q1.add(element);
    }
    else if(!q2.isEmpty())
    {
     q2.add(element);
    }
}
public int pull()
{
    int i=0;
    int a=-1;
        if(!q1.isEmpty())
        {
        while(!q1.isEmpty())
        {if(i==size()-1)
            {
                 a =q1.remove();

                return a;
            }
            else{
             a=q1.remove();
            q2.add(a);
            i++;
            }
        }
    }
        else if(!q2.isEmpty())
        {while(!q2.isEmpty())
            {if(i==size()-1)
            {
                a=q2.remove();
                
                return a;
            }
            else{
                a=q2.remove();
                q1.add(a);
                i++;
            }
        }
    }
        return a;
    }
}



