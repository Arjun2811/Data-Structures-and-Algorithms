package Eliminate;

import java.util.Scanner;

public class Nodeuse {

public static Node<Integer> Takeinput()
{
    Node<Integer>head=null;
    Node<Integer>tail=null;
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();
    while(data!=-1)
    {
        Node<Integer> node1= new Node<Integer>(data);
        if(head==null)
        {
       head=node1;
       tail=node1;
        }
        else{
            tail.next=node1;
            tail=node1;
        }
        data=s.nextInt();
    }
    return head;

}
public static void print(Node<Integer>head)
{


    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }

}

public static Node<Integer> Duplicates(Node<Integer>head)
{

    if(head==null)
    {
        return head;
    }
    if(head.next==null)
    {
        return head;
    }
Node<Integer>temp1=head;
Node<Integer>temp2=head.next;

Node<Integer>Finalhead=head;
while(temp2!=null)
{
    if(temp1.data==temp2.data)
    {
        temp2=temp2.next;
    }
    else{
        temp1.next=temp2;
        temp1=temp2;

    }
}
    temp1.next=null;
    return Finalhead;

}


  









    public static void main(String[]args)
    {

Node<Integer>Head=Takeinput();
//print(Head);
Node<Integer>head=Duplicates(Head);
print(head);
    }
}
