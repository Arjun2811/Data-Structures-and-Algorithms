package DoubleLL;
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
    }
return Head;
//we can obviosly return Tail and print in the oppsite manner also 
}
public static void print(Node<Integer>Head)
{

    while(Head!=null)
    {

 System.out.println(Head.data);

        Head=Head.next;
        //for tail; tail=tail.prev;
    }
}

public static Node<Integer> insertion(Node<Integer>Head)
{  

    Node <Integer> node1=new Node(10);
    node1.next=Head;
    Head.prev=node1;
    return node1;

}
public static Node<Integer> Deletion(Node<Integer>Head)
{

    Head=Head.next;
    Head.prev=null;
    return Head;
}


public static void main(String[] args) {
    Node<Integer>Head=Takeinput();
    // print(Head);
    // Node<Integer>node1=insertion(Head);
    // print(node1);
    Node<Integer>newHead=Deletion(Head);
    print(newHead);
}


}
