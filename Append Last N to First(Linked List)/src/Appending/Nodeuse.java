package Appending;

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

public static Node<Integer> Append(Node<Integer>head,int n)
{
    int Length=0;
Node<Integer>temp=head;
while(temp!=null)
{

    if(temp.next==null)
    {   Length++;
        Node<Integer>Tail=temp;
        Node<Integer>Head=Appendagain(Tail,head,Length-n+1,Length);
        return Head;
    }
Length++;
temp=temp.next;

}
return temp;
}



public static Node<Integer> Appendagain(Node<Integer>Tail,Node<Integer>head,int n,int Length)
{
int i=1;
Node<Integer>Head1=null;
Node<Integer>temp=head;
while(temp!=null)
{
    if(n==1||n>Length)
    {
        return head;
    }
if(i==n-1)
{ Head1=temp.next;
temp.next=null;
break;
}
i++;
temp=temp.next;
}
  Tail.next=head;
  return Head1;
}





public static void main(String[]args)
{
Node<Integer>head=Takeinput();
print(head);
Node<Integer>Head=Append(head,0);
print(Head);

}
}
