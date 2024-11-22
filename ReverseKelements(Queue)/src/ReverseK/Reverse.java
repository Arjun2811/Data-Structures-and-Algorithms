package ReverseK;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {

    public static Queue<Integer> ReverseK(Queue<Integer>q1,int k,int i)
    {
Queue<Integer>q2=new LinkedList<>();
while(i<=k)
{
    q2.add(q1.remove());
    i++;

}
Reverse(q2);
while(!q1.isEmpty())
{
q2.add(q1.remove());
}
return q2;
    }
    public static void Reverse(Queue<Integer>q2)
    {
        if(q2.size()==0||q2.size()==1)
        {
            return;
        }


        int front=q2.remove();
        Reverse(q2);
        q2.add(front);
        return;
    }

    
    
    public static void main(String[]args){
   Queue<Integer>q1=new LinkedList<>();
q1.add(1);
q1.add(2);
q1.add(3);
q1.add(4);
q1.add(5);
q1.add(6);
q1.add(7);
q1.add(8);


       Queue<Integer>q2= ReverseK(q1,5,1);
       while(!q2.isEmpty())
       {
      System.out.println(q2.remove());
       }


    }

}