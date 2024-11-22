package Reverse;
import java.util.Scanner;
public class Nodeuse {
public static Node<Integer> Takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();
    while(data!=-1)
    {
        Node<Integer> node1= new Node<>(data);
        if(Head==null)
        {
            Head=node1;
            Tail=node1;
        }
        else{
            Tail.next=node1;
            Tail=node1;
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


public static Node<Integer> Reverse(Node<Integer>Head)
{ if(Head==null||Head.next==null)
    {
    return Head;
    }
    Node<Integer>Finalhead=Reverse(Head.next);
        Node<Integer>Temp=Finalhead;
        while(Temp.next!=null)
        {
            Temp=Temp.next;
        }
        Temp.next=Head;
        Head.next=null;
        return Finalhead;


    }


    public static void main(String[] args) {
       Node<Integer>Head= Takeinput();
        //print(Head);
        Node<Integer>head=Reverse(Head);
        print(head);
    }

}