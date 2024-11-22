package Circular;
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
        Node<Integer> node1=new Node(data);
        if(Head==null)
        {
           Head=node1;
           Tail=node1;
        }
        else{
            Tail.next=node1;
            node1.prev=Tail;
            Tail=node1;
        }
        data=s.nextInt();
        if(data==-1){
            Tail.next=Head;
            Head.prev=Tail;
        }
    }
return Head;
//we can obviosly return Tail and print in the oppsite manner also 
}
public static void print(Node<Integer>Head)
{Node<Integer>Temp=Head;
    System.out.println(Temp.data);
    Temp=Temp.next;

    while(Temp!=Head)
    {

 System.out.println(Temp.data);

        Temp=Temp.next;
        //for tail; tail=tail.prev;
    }
}


public static Node<Integer> Insertion(Node<Integer>Head)
{
Node<Integer> node1= new Node(10);
Head.prev.next=node1;
node1.prev=Head.prev;
node1.next=Head;
return node1;

}

public static Node<Integer> Deletion(Node<Integer>Head)
{  Head.next.prev=Head.prev;

    Head.prev.next=Head.next;
    return Head.next;
}
public static void main(String[]args)
{
    Node<Integer>Head=Takeinput();
    //print(Head);
    // 
    Node<Integer>newhead=Deletion(Head);
    print(newhead);
    
}}