package PrintReverse;
import java.util.Scanner;
public class Nodeuse {


public static Node<Integer> takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;

    Scanner s = new Scanner (System.in);
    int data=s.nextInt();
    while(data!=-1)
    {Node<Integer>node1=new Node<Integer>(data);
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

public static void PrintReverse(Node<Integer>Head)
{
if(Head==null)
{
    return;
}
PrintReverse(Head.next);
System.out.print(Head.data+" ");



}
    public static void main(String[]args)
    {


        Node<Integer>Head=takeinput();
        print(Head);
        PrintReverse(Head);
    }

}
