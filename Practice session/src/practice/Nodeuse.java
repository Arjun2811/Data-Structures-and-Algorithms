package practice;
import java.util.Scanner;
public class Nodeuse{





public static Node<Integer> eliminate(Node<Integer>head)
{
if(head==null||head.next==null)
{
    return head;
}

Node<Integer>head2=head;
Node<Integer>tail=head;
while(tail.next!=null)
{
if(tail.data==tail.next.data)
{
tail=tail.next;
}
else{
    tail=tail.next;
    head2.next=tail;
    head2=head2.next;
}
}
head2.next=null;
return head;
}



public static void print(Node<Integer>head)
{

    Node<Integer>temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}


public static Node<Integer> takeinput()
{Scanner s = new Scanner(System.in);
Node<Integer>head=null;
Node<Integer>tail=null;
int data=s.nextInt();

while(data!=-1)
{Node<Integer>node1=new Node<>(data);
    if(head==null)
    {
     head=node1;
     tail=node1;
    }
    else{
tail.next=node1;
tail=tail.next;


    }
    data=s.nextInt();
}
return head;
}



    public static void main(String[] args) {
        Node<Integer>head=takeinput();
       
        Node<Integer>Head=eliminate(head);
        print(Head);
    }
}





    


    
