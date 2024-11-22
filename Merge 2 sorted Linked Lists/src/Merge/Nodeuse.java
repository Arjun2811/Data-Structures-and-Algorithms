package Merge;
import java.util.Scanner;

public class Nodeuse {


 public static Node<Integer> takeinput1()
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
    public static Node<Integer> takeinput2()
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
    public static Node<Integer> Merge(Node<Integer>head1,Node<Integer>head2)
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }

        Node<Integer>t1=head1;
        Node<Integer>t2=head2;
        Node<Integer>Head;
        Node<Integer>Tail;
        
        if(t1.data<=t2.data)
        {
     Head=t1;
     Tail=t1;
     t1=t1.next;
        }
        else{
            Head=t2;
            Tail=t2;
            t2=t2.next;
        }

        while(t1!=null&&t2!=null)
        {
            if(t1.data<=t2.data)
            {
                Tail.next=t1;
              Tail=t1;
             t1=t1.next;
            }
            else{
                Tail.next=t2;
                Tail=t2;
                t2=t2.next;
            }
        }
        if(t1!=null)
        {
            Tail.next=t1;
        }
        else{
        
            Tail.next=t2;
        }
        return Head;

    }

    public static void main(String[]args)

{
    Node<Integer>head1=takeinput1();
    Node<Integer>head2=takeinput2();
    //print(head1);
     //print(head2);
    Node<Integer>Head=Merge(head1,head2);
    print(Head);
}

}
