package Palindrome;
import java.util.Scanner;
public class Nodeuse {



public static Node<Integer> takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;
    Scanner s = new Scanner(System.in);
    int data =s.nextInt();
    while(data!=-1)
    { Node<Integer> node1= new Node<Integer>(data);
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
public static void print(Node<Integer>head)
{
    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }
}
public static boolean Palindrome(Node<Integer>Head)
{
Node<Integer>temp=Head;
int len=0;
while(temp!=null)
{    len++;
    temp=temp.next;
}int i=0;
Node<Integer>temp1=Head;
while(i<(len/2))
{i++;
temp1=temp1.next;
}


    Node<Integer>prev=null;
    Node<Integer>current=temp1;
    Node<Integer>next=null;
    while(current!=null)
    {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    Node<Integer>Headprev=prev;
    int f=0;
    while((f<len/2)&&(Headprev!=null))
    {
        if(Head.data!=Headprev.data)
        {
           return false;

        }
        else{
            f++;
            Head=Head.next;
            Headprev=Headprev.next;
        }
    }
    return true;

}




public static void main(String[]args)
{
   Node<Integer>head= takeinput();
   print(head);
   boolean ans =Palindrome(head);
   System.out.println(ans);
}





}
