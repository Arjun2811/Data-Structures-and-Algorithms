package Reversequeue;
import java.util.LinkedList;
import java.util.Queue;
public class Reverse {

public static void Reverse(Queue<Integer>q1)
{

if(q1.size()==0)
{
return;
}

int front=q1.remove();
    Reverse(q1);
  
   q1.add(front);
    
    return;

}

    public static void main(String[]args)
    {
        Queue<Integer>q1=new LinkedList<>();
         //Queue<Integer>q2=new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        Reverse(q1);
        while(!q1.isEmpty())
        {
            System.out.println(q1.remove());
        }
    }
}
