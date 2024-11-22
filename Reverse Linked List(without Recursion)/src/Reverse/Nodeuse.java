package Reverse;

import java.util.Scanner;

public class Nodeuse {



public static Node<Integer> takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;
    Scanner s = new Scanner(System.in);
    int data =s.nextInt();
    while(data!=-1)
    { Node<Integer> node1= new Node<Integer>(data);
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
public static void print(Node<Integer>head)
{
    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }
}
public static Node<Integer> Reverse(Node<Integer>Head)
{
Node<Integer>prev=null;
Node<Integer>current=Head;
Node<Integer>next=null;

while(current!=null)
{
    next=current.next;
    current.next=prev;

    prev=current;

    current=next;
}
return prev;


}


public static void main(String[]args)
{
   Node<Integer>Head= takeinput();
print(Head);
Node<Integer>prev=Reverse(Head);
print(prev);
}


}
