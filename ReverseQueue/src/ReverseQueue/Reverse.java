package ReverseQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Reverse {


public static void Reverse(Queue<Integer>q1)
{int i=0;
    Queue<Integer>q2=new LinkedList<>();
    Queue<Integer> q3= new LinkedList<>();
while(q1.size()>1)
{
int a=q1.remove();
q2.add(a);

}
while((!q2.isEmpty())||!q3.isEmpty())
{int f=0;
    int b=0;
if(!q2.isEmpty())
{

    while(q2.size()>1)
    {
        b=q2.remove();
        q3.add(b);
        
    }
    b=q2.remove();
    q1.add(b);

}
else{
    while(q3.size()>1)
    {
        b=q3.remove();
        q2.add(b);
        f++;
    }
    b=q3.remove();
    q1.add(b);
}


}
}







public static void main(String[]args)
{
    Queue<Integer> q1= new LinkedList<Integer>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    q1.add(4);
    q1.add(5);

    Reverse(q1);
   
    while(!q1.isEmpty())
    {
        System.out.println(q1.remove());
    }
    
}

}
