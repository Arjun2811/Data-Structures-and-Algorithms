package Midpoint;
import java.util.Scanner;
public class Nodeuse {



    public static Node<Integer> takeinput()
    {
        Node<Integer>Head=null;
        Node<Integer>Tail=null;

        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1)
        {Node<Integer> node1= new Node<Integer>(data);
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



    public static Node<Integer> Midpoint(Node<Integer>Head)
    {
        Node<Integer>slow=Head;
        Node<Integer>fast=Head;
        while(fast!=null)
        {
           
            if(fast.next==null||fast.next.next==null)
            {
               return slow;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return Head;
    }
    // while(fast.next!= null && fast.next.next!=null)
    // {
    //     slow=slow.next;
    //     fast=fast.next.next;
    // }
    // return slow;
    //when directly given -1 meaning no no. it will null point exception
    // }
    public static void main(String[]args)
    {
        Node<Integer>head=takeinput();
        print(head);
        Node<Integer>Slow=Midpoint(head);
        if(Slow!=null)
        {
        System.out.println(Slow.data);
        }
    }
}
