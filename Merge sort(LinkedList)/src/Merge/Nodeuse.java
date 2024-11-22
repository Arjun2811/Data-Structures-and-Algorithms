package Merge;
import java.util.Scanner;

public class Nodeuse {

public static Node<Integer>MergeSort(Node<Integer>Head)
{
if(Head==null)
{
    return Head;
}
if(Head.next==null)
{
    return Head;
}

Node<Integer>midnode=Midpoint(Head);
Node<Integer>h2=midnode.next;
midnode.next=null;
Node<Integer>part1=MergeSort(Head);
Node<Integer>part2=MergeSort(h2);
Node<Integer>mergedList=Merge(part1,part2);
return mergedList;




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
    Node<Integer>head=takeinput1();
   
    print(head);
    
    
    Node<Integer>Head=MergeSort(head);
    
    print(Head);
}

}


