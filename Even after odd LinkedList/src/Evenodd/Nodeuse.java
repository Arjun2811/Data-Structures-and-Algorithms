package Evenodd;
import java.util.Scanner;
public class Nodeuse {


    public static Node<Integer> Takeinput()
    {
        Node<Integer>Head=null;
        Node<Integer>Tail=null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data!=-1)
        { Node<Integer> node1 = new Node(data);
            if(Head==null)
            {
                Head=node1;
                Tail=node1;
            }
            else{
                Tail.next=node1;
                Tail=Tail.next;
            }
            data=s.nextInt();

        }
        return Head;


    } 

    public static void print(Node<Integer>Head)
    {
        while(Head!=null)
        {
            System.out.println(Head.data);
            Head=Head.next;
        }
    }

public static Node<Integer> EvenHead(Node<Integer>Head,Node<Integer>evenhead,Node<Integer>eventail,Node<Integer>oddhead,Node<Integer>oddtail)
{
   while(Head!=null)
   {
    if(Head.data%2==0)
    {
        if(evenhead==null)
        {
            evenhead=Head;
            eventail=Head;
        }
        else{
            eventail.next=Head;
            eventail=Head;
        }
    }
    else{
        if(oddhead==null)
            {
                oddhead=Head;
                oddtail=Head;
            }
            else{
                oddtail.next=Head;
                oddtail=Head;
            }
    }


    Head=Head.next;
    
}
if(oddtail!=null)
{  if(eventail!=null)
   { eventail.next=null;
    oddtail.next=evenhead;
}
else{
oddtail.next=null;
}
    return oddhead;
}
else{
    if(eventail!=null)
    {
    eventail.next=null;
    return evenhead;
    }
    return evenhead;
}

    }

   
public static Node<Integer> Evenodd(Node<Integer>Head)
{
Node<Integer>oddhead=null;
Node<Integer>oddtail=null;
Node<Integer>evenhead=null;
Node<Integer>eventail=null;
Node<Integer>Finalhead=EvenHead(Head,evenhead,eventail,oddhead,oddtail);

return Finalhead;

}

    public static void main(String[]args)
    {
        Node<Integer>Head=Takeinput();
        // print(Head);
        Evenodd(Head);
        // print(Head);
    }

}
