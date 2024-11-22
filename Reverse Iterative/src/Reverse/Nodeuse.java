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
    {

Node<Integer>current=Head;
Node<Integer>prev=null;
if(Head==null||Head.next==null)
{
return Head;
}
Node<Integer>Temp=current.next;
while(current!=null)
{  Temp=current.next;
    current.next=prev;
    prev=current;
    current=Temp;
}
return prev;



    }
public static void main(String[]args)
{
    Node<Integer>Head=Takeinput();
    print(Head);
    Head=Reverse(Head);
    print(Head);
}
}
