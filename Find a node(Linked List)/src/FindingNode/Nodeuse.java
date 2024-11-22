package FindingNode;
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
public static int Finding(Node<Integer>Head,int n)
{int i=0;
 while(Head!=null)
 {

if(Head.data==n)
{
return i;
}

i++;
    Head=Head.next;
 }
 return -1;


}







    public static void main(String[]args)
    {
        Node<Integer>head=Takeinput();
        print(head);
        int i=Finding(head,20);
        System.out.println(i);
        
    }
}
